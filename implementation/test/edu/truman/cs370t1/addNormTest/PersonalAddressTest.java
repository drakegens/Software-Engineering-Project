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

	@Before
	public void setUp() throws Exception {
		address = new PersonalAddress("1234","12345", "AK");
		address2 = new PersonalAddress("1234","12345", "Alabama");
		address3 = new PersonalAddress("ABCD","ABCDE", "Alama");

	}

	@Test
	public void testNormalize() {
		assertTrue(address.normalize());
		assertTrue(address2.normalize());
		assertFalse(address3.normalize());
		
	}

}
