package edu.truman.cs370t1.addNormTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.truman.cs370t1.addNorm.Address;
import edu.truman.cs370t1.addNorm.PersonalAddress;

public class PersonalAddressTest {
	
	Address address;
	Address address2;

	@Before
	public void setUp() throws Exception {
		address = new PersonalAddress("1234","12345");
		address2 = new PersonalAddress("ABCD","ABCDE");
	}

	@Test
	public void testNormalize() {
		assertTrue(address.normalize());
		assertFalse(address2.normalize());
	}

}
