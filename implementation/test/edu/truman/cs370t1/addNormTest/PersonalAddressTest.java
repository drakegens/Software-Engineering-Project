package edu.truman.cs370t1.addNormTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.truman.cs370t1.addNorm.PersonalAddress;

public class PersonalAddressTest {
	
	PersonalAddress passingAddress1;
	PersonalAddress passingAddress2;
	PersonalAddress passingAddress3;
	PersonalAddress passingAddress4;
	
	PersonalAddress failingAddress1;

	@Before
	public void setUp() throws Exception {
		passingAddress1 = new PersonalAddress("1234","12345", "AK", "kirksville", "123 Southwest First Alley");
		passingAddress2 = new PersonalAddress("1234","12345", "Alabama", "St. Louis", "south First ALLEE");
		passingAddress3 = new PersonalAddress("1234","12345", "Alabama", "kansas city", "NORTh First Allee WEST,STE #304");
		passingAddress4 = new PersonalAddress("1234","12345", "Alabama", "kansas city", "NORTh First Allee WEST STE 304");
		failingAddress1 = new PersonalAddress("ABCD","ABCDE", "Alama", "kansas city", "NORTh First Allee WEST");
	}

	@Test
	public void testNormalize() {
		assertTrue(passingAddress1.normalize());
		assertTrue(passingAddress2.normalize());
		assertTrue(passingAddress3.normalize());
		assertTrue(passingAddress4.normalize());	
		assertFalse(failingAddress1.normalize());

		assertEquals("123 SW FIRST ALY", passingAddress1.getLine1());
		assertEquals("S FIRST ALY", passingAddress2.getLine1());
		assertEquals("N FIRST ALY W", failingAddress1.getLine1());
		assertEquals("STE # 304", passingAddress3.getLine2());
		assertEquals("N FIRST ALY W", passingAddress3.getLine1());
		assertEquals("STE 304", passingAddress4.getLine2());
		assertEquals("N FIRST ALY W", passingAddress4.getLine1());
		
	}

}
