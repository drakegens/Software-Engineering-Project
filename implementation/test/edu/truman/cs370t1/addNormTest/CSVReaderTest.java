package edu.truman.cs370t1.addNormTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import edu.truman.cs370t1.addNorm.CSVReader;
import edu.truman.cs370t1.addNorm.Address;
import edu.truman.cs370t1.addNorm.PersonalAddress;

public class CSVReaderTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
	}

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    //System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    //System.setErr(null);
	}
	
	
	@Test
	public void test() {
	}

	@Test
	public void testParse() {
		CSVReader cr = new CSVReader();
		// assertEquals(new PersonalAddress(), cr.parse());
		assertNotNull(cr.parse());
		Address add = cr.parse();
		// cr.parse();
		assertEquals("123 Normal St", add.getLine1());

		assertEquals("Kirksville", add.getCity());

		assertEquals("MO", add.getStateCode());

		assertEquals("63501", add.getZip5());

		assertEquals(null, add.getZip4());

	}

	@Test
	public void testCreateInputFile() {

	}
	
	@Test
	public void testNoFileInput() {
		CSVReader cr = new CSVReader();
		File file = new File("");
		cr.createInputFile(file);
		assertEquals("Incorrect File Name", outContent.toString());
	}
	
	@Test
	public void testFile(){
		CSVReader cr = new CSVReader();
		File file = new File("C:\\Users\\Drake\\Documents\\cs370t1\\data\\dataset_2016_04_14.txt");
		cr.createInputFile(file);
		assertNotEquals("Incorrect File Name", outContent.toString());
		//assertTrue(file.exists());
	}

}
