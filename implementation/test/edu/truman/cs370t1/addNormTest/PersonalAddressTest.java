package edu.truman.cs370t1.addNormTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.truman.cs370t1.addNorm.Address;
import edu.truman.cs370t1.addNorm.PersonalAddress;

public class PersonalAddressTest {
	
	Address address;
	Address address2;
	Address address3;
	PersonalAddress address4;
	PersonalAddress address5;

	@Before
	public void setUp() throws Exception {
		address = new PersonalAddress("1234","12345", "AK", "kirksville", "123 Southwest First Alley");
		address2 = new PersonalAddress("1234","12345", "Alabama", "St. Louis", "south First ALLEE");
		address3 = new PersonalAddress("ABCD","ABCDE", "Alama", "kansas city", "NORTh First Allee WEST");
		address4 = new PersonalAddress("1234","12345", "Alabama", "kansas city", "NORTh First Allee WEST,STE 304");
		address5 = new PersonalAddress("1234","12345", "Alabama", "kansas city", "NORTh First Allee WEST STE 304");

	}

	@Test
	public void testNormalize() {
		assertTrue(address.normalize());
		assertTrue(address2.normalize());
		assertFalse(address3.normalize());
		assertTrue(address4.normalize());
		assertTrue(address5.normalize());		
		assertEquals("123 SW FIRST ALY", address.getLine1());
		assertEquals("S FIRST ALY", address2.getLine1());
		assertEquals("N FIRST ALY W", address3.getLine1());
		assertEquals("STE 304", address4.getLine2());
		assertEquals("N FIRST ALY W", address4.getLine1());
		assertEquals("STE 304", address5.getLine2());
		assertEquals("N FIRST ALY W", address5.getLine1());
		
	}

}
