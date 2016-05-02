import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.truman.cs370t1.addNorm.Address;


public class AddNormBatchTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    
	}
	
	@Test
	public void testParseRegularLine(){
		String addressString = "55 LeMay Plaza South	Maxwell AFB	AL	36112	6335";
		AddNormBatch anb = new AddNormBatch();
		Address address = anb.parse(addressString);
		assertEquals("55 LeMay Plaza South", address.getLine1());
		assertEquals("Maxwell AFB", address.getCity());
		assertEquals("AL", address.getStateCode());
		assertEquals("36112", address.getZip5());
		assertEquals("6335", address.getZip4());
	}
	
	@Test
	public void testParseWithoutZip4(){
		String addressString = "55 LeMay Plaza South	Maxwell AFB	AL	36112	";
		AddNormBatch anb = new AddNormBatch();
		Address address = anb.parse(addressString);
		assertEquals("55 LeMay Plaza South", address.getLine1());
		assertEquals("Maxwell AFB", address.getCity());
		assertEquals("AL", address.getStateCode());
		assertEquals("36112", address.getZip5());
		assertEquals(null, address.getZip4());	
	}
	
	@Test
	public void testParseWith3Fields(){
		String addressString = "55 LeMay Plaza South	Maxwell AFB	AL	";
		AddNormBatch anb = new AddNormBatch();
		Address address = anb.parse(addressString);
		assertEquals(null, address.getLine1());
		assertEquals(null, address.getCity());
		assertEquals(null, address.getStateCode());
		assertEquals(null, address.getZip5());
		assertEquals(null, address.getZip4());
		assertEquals("55 LeMay Plaza South	Maxwell AFB	AL	", address.getError());
	}
	
	@Test
	public void testEmptyFile(){
		AddNormBatch anb = new AddNormBatch();
		String file = "";
		anb.createInputFile(file);
		assertEquals("Incorrect File Name", outContent.toString());
		//assertTrue(file.exists());
	}
	
	@Test
	public void testFile(){
		AddNormBatch anb = new AddNormBatch();
		String file = "C:\\Users\\Drake\\Documents\\cs370t1\\data\\dataset_2016_04_14.txt";
		anb.createInputFile(file);
		assertNotEquals("Incorrect File Name", outContent.toString());
		//assertTrue(file.exists());
	}
	
	@Test
	public void testCreateOutputFiles() {
		AddNormBatch anb = new AddNormBatch();
		anb.createOutputFiles();
		assertNotEquals("File could not be created", outContent.toString());
	}
	
	@Test
	public void testNormalizeAddressesToOutputFiles(){
		AddNormBatch anb = new AddNormBatch();
		String normalizableAddressString = "55 LeMay Plaza South	Maxwell AFB	AL	36112	6335";
		
		Address normalizableAddress = anb.parse(normalizableAddressString);
		
		try {
			File normFilename = new File("normalized_addresses.txt");
			File unnormFilename = new File("unnormalized_addresses.txt");
			PrintWriter outNormalized = new PrintWriter(normFilename);
			PrintWriter outError = new PrintWriter(unnormFilename);	
			anb.normalizeAddressesToOutputFiles(outNormalized, outError, normalizableAddress);
			
			outNormalized.close();
			outError.close();
		} catch (FileNotFoundException exception) {
			System.out.println("File could not be created");
		}
		
	}
	
	@Test
	public void testUnNormalizableAddressesToOutputFiles(){
		AddNormBatch anb = new AddNormBatch();
		String unNormalizableAddressString = "blah	6335";
		
		Address unnormalizableAddress = anb.parse(unNormalizableAddressString);
		
		try {
			File normFilename = new File("normalized_addresses.txt");
			File unnormFilename = new File("unnormalized_addresses.txt");
			PrintWriter outNormalized = new PrintWriter(normFilename);
			PrintWriter outError = new PrintWriter(unnormFilename);	
			anb.normalizeAddressesToOutputFiles(outNormalized, outError, unnormalizableAddress);
			
			outNormalized.close();
			outError.close();
		} catch (FileNotFoundException exception) {
			System.out.println("File could not be created");
		}
		
	}

}
