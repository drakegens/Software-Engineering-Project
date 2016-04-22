package edu.truman.cs370t1.addNormTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import edu.truman.cs370t1.addNorm.CSVReader;
import edu.truman.cs370t1.addNorm.Address;
import edu.truman.cs370t1.addNorm.PersonalAddress;

public class CSVReaderTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
	}
	
	@Test 
	public void testParse() {
		CSVReader cr = new CSVReader();
		//assertEquals(new PersonalAddress(), cr.parse());
		assertNotNull(cr.parse());
		Address add = cr.parse();
		//cr.parse();
		assertEquals("123 Normal St", add.getLine1());
		
		assertEquals("Kirksville", add.getCity());
		
		assertEquals("MO", add.getStateCode());
		
		assertEquals("63501", add.getZip5());
		
		assertEquals(null, add.getZip4());
		
		
	}
	
	

}
