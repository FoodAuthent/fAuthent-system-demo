package org.foodauthent.internal.impl.persistence;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import org.foodauthent.api.internal.exeption.NoSuchIDException;
import org.foodauthent.internal.api.persistence.UUIDPersistenceIDMapper;
import org.osgi.service.component.annotations.Component;

/**
 *
 * @author Alexander Kerner, Lablicate GmbH
 *
 */
@Component(service=UUIDPersistenceIDMapper.class)
public class SimpleUUIDEntityMapper implements UUIDPersistenceIDMapper {

    private final Map<Long, UUID> persistenceId2Uuid;

    private final Map<UUID, Long> uuid2PersistenceId;

    public SimpleUUIDEntityMapper() {
	this.persistenceId2Uuid = new LinkedHashMap<>();
	this.uuid2PersistenceId = new LinkedHashMap<>();
    }

    @Override
    public void addMapping(final UUID uuid, final long persistenceId) {
	assert !uuid2PersistenceId.containsKey(uuid);
	persistenceId2Uuid.put(persistenceId, uuid);
	uuid2PersistenceId.put(uuid, persistenceId);
    }

    @Override
    public long getPersistenceId(final UUID uuid) throws NoSuchIDException {
	final Long entityId = uuid2PersistenceId.get(uuid);
	if (entityId == null) {
	    throw new NoSuchIDException("No entry for " + uuid);
	}
	return entityId;
    }

    @Override
    public UUID getUuid(final long persistenceId) throws NoSuchIDException {
	final UUID uuid = persistenceId2Uuid.get(persistenceId);
	if (uuid == null) {
	    throw new NoSuchIDException("No entry for " + persistenceId);
	}
	return uuid;
    }

    @Override
    public boolean containsUUID(UUID uuid) {
	return uuid2PersistenceId.containsKey(uuid);
    }

}