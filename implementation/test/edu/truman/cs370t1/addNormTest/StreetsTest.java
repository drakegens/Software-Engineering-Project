package edu.truman.cs370t1.addNormTest;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.truman.cs370t1.addNorm.Streets;

public class StreetsTest {

	@Test
	public void testGetAbbreviation() {
		assertEquals("ALY", Streets.getAbbreviation("ALLEE"));
		assertEquals("WLS", Streets.getAbbreviation("WELLS"));
	}

	@Test
	public void testGetDirectionAbbreviation() {
		assertEquals("W", Streets.getDirectionAbbreviation("WEST"));
		assertEquals("SW", Streets.getDirectionAbbreviation("SOUTHWEST"));
	}

}
