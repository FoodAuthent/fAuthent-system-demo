package org.foodauthent.internal.impl.persistence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

import org.foodauthent.api.internal.exeption.EntityExistsException;
import org.foodauthent.api.internal.exeption.NoSuchIDException;
import org.foodauthent.internal.api.persistence.Blob;
import org.foodauthent.internal.api.persistence.PersistenceService;
import org.foodauthent.model.FaModel;
import org.foodauthent.model.FingerprintSet;
import org.foodauthent.model.Product;
import org.foodauthent.model.SOP;
import org.foodauthent.model.Workflow;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A simple persistence service, that holds objects in memory.
 * <p>
 * Entity IDs are only unique for the connected database.
 * </p>
 * <p>
 * Once the instance is destroyed, data is lost.
 * </p>
 *
 * @author Alexander Kerner
 *
 */
@Component(service = PersistenceService.class)
public class SimpleInMemoryPersistenceService implements PersistenceService {

	private static final Logger logger = LoggerFactory.getLogger(SimpleInMemoryPersistenceService.class);

	/**
	 * The class should be a singleton anyways, therefore this is not static.
	 */
	private long persistenceIdCounter = 1;

	/**
	 * Mimics a database and/ or a file system.
	 */
	private final Map<UUID, FaModel> entities;

	private final Map<UUID, Blob> blobs;

	public SimpleInMemoryPersistenceService() {
		this.entities = new LinkedHashMap<UUID, FaModel>();
		this.blobs = new LinkedHashMap<UUID, Blob>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends FaModel> List<T> findByKeywords(final Collection<String> keywords, final Class<T> modelType) {
		final List<T> result = new ArrayList<>();

		if (logger.isDebugEnabled()) {
			logger.debug("Seaching fields: name, descrption");
		}

		for (final Object o : entities.values()) {

			if (modelType.equals(Workflow.class) && o instanceof Workflow) {
				final Workflow wf = (Workflow) o;
				if (keywords.contains(wf.getDescription())) {
					result.add((T) wf);
				}
				if (keywords.contains(wf.getName())) {
					result.add((T) wf);
				} else {
					if (logger.isDebugEnabled()) {
						logger.debug("Ignoring " + o);
					}
				}
			} else if (modelType.equals(SOP.class) && o instanceof SOP) {
				final SOP sop = (SOP) o;
				if (keywords.contains(sop.getDescription())) {
					result.add((T) sop);
				}
				if (keywords.contains(sop.getName())) {
					result.add((T) sop);
				}
			} else if (modelType.equals(FingerprintSet.class) && o instanceof FingerprintSet) {
				final FingerprintSet fs = (FingerprintSet) o;
				if (keywords.contains(fs.getName())) {
					result.add((T) fs);
				}
			} else {
				if (logger.isDebugEnabled()) {
					logger.debug("Ignoring " + o);
				}
			}
		}
		return result;
	}

	@Override
	public Product findProductByGtin(final String gtin) {
		for (final Object o : entities.values()) {
			if (o instanceof Product) {
				final Product p = (Product) o;
				if (gtin.equals(p.getGtin())) {
					return p;
				}
			}
		}
		throw new NoSuchElementException("No product found for " + gtin);
	}

	@Override
	public <T extends FaModel> T getFaModelByUUID(final UUID uuid, Class<T> modelType) throws NoSuchElementException {
		try {
			return (T) entities.get(uuid);
		} catch (final NoSuchIDException e) {
			throw new NoSuchElementException(e.getLocalizedMessage());
		}
	}

	/**
	 * Returns the last used entity ID.
	 *
	 * @return the last used entity ID
	 */
	protected long getLastPersistenceId() {
		return persistenceIdCounter;
	}

	@Override
	public UUID save(final Blob blob) throws EntityExistsException {
		save(blob, blob.getFaId());
		return blob.getFaId();
	}

	@Override
	public <T extends FaModel> T save(final T entity) throws EntityExistsException {
		save(entity, entity.getFaId());
		return entity;
	}

	private <T extends Object> boolean save(final T obj, UUID faId) throws EntityExistsException {
		if (entities.containsKey(faId) || blobs.containsKey(faId)) {
			throw new EntityExistsException("An entity with the given id already exists.");
		}
		if (obj instanceof FaModel) {
			entities.put(faId, (FaModel) obj);
		} else if (obj instanceof Blob) {
			blobs.put(faId, (Blob) obj);
		} else {
			throw new IllegalArgumentException("Objects of type '" + obj.getClass().getSimpleName()
					+ "' + not supported by the persistence service.");
		}
		return true;
	}

	@Override
	public <T extends FaModel> T replace(final T  entity) throws NoSuchElementException {
		if (!entities.containsKey(entity.getFaId())) {
			throw new NoSuchElementException("No entity to replace for the given fa-id.");
		}
		entities.replace(entity.getFaId(), entity);
		return entity;
	}

	@Override
	public Blob getBlobByUUID(UUID uuid) {
		try {
			return blobs.get(uuid);
		} catch (final NoSuchIDException e) {
			throw new NoSuchElementException(e.getLocalizedMessage());
		}
	}

}