package edu.truman.cs370t1.addNormTest;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.truman.cs370t1.addNorm.States;

public class StatesTest {

	@Test
	public void testGetAbbreviation() {
		assertEquals(States.getAbbreviation("Missouri"), "MO");
		assertEquals(States.getAbbreviation("Kumamoto"), null);
	}

	@Test
	public void testIsAbbreviation() {
		assertTrue(States.isAbbreviation("MO"));
		assertFalse(States.isAbbreviation("not"));
	}

}
