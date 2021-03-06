package org.foodauthent.test;

import org.foodauthent.impl.file.FileServiceImpl;
import org.foodauthent.impl.openchrom.OpenChromRawFileReader;
import org.foodauthent.internal.persistence.impl.SimpleInMemoryPersistenceService;

public class TestServices {

    private final SimpleInMemoryPersistenceService persistenceService;

    private final FileServiceImpl fileService;

    private final OpenChromRawFileReader rawFileReader;

    public TestServices() {
	persistenceService = new SimpleInMemoryPersistenceService();
	fileService = new FileServiceImpl();
	rawFileReader = new OpenChromRawFileReader();
	linkServices();
    }

    private void linkServices() {
	// TODO: use service trackes in tests
	//fileService.setPersistenceService(persistenceService);


    }

    public SimpleInMemoryPersistenceService getPersistenceService() {
	return persistenceService;
    }

    public FileServiceImpl getFileService() {
	return fileService;
    }

    public OpenChromRawFileReader getRawFileReader() {
	return rawFileReader;
    }

}
