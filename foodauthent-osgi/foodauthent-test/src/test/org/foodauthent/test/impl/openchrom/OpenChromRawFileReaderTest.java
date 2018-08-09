package org.foodauthent.test.impl.openchrom;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

import org.foodauthent.impl.openchrom.OpenChromRawFileReader;
import org.foodauthent.model.FileMetadata.TypeEnum;
import org.foodauthent.test.category.FrameworkTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(FrameworkTest.class)
public class OpenChromRawFileReaderTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    private static final File testFile = new File("files/bruker-nmr/1.zip");

    @Test
    public void test01() throws Exception {

	OpenChromRawFileReader reader = new OpenChromRawFileReader();
	Map<String, String> map = reader.getAllFileMetadata(TypeEnum.FINGERPRINTS_BRUKER,
		new FileInputStream(testFile));

	assertThat(map, is(not(nullValue())));

    }

}