package edu.truman.cs370t1.addNormTest;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.truman.cs370t1.addNorm.States;

public class StatesTest {

	@Test
	public void testGetAbbreviation() {
		assertEquals(States.getAbbreviation("Kumamoto"), null);
		assertEquals(States.getAbbreviation("Alabama"), "AL");
		assertEquals(States.getAbbreviation("Alaska"), "AK");
		assertEquals(States.getAbbreviation("Arizona"), "AZ");
		assertEquals(States.getAbbreviation("Arkansas"), "AR");
		assertEquals(States.getAbbreviation("California"), "CA");
		assertEquals(States.getAbbreviation("Colorado"), "CO");
		assertEquals(States.getAbbreviation("Connecticut"), "CT");
		assertEquals(States.getAbbreviation("Delaware"), "DE");
		assertEquals(States.getAbbreviation("Florida"), "FL");
		assertEquals(States.getAbbreviation("Georgia"), "GA");
		assertEquals(States.getAbbreviation("Hawaii"), "HI");
		assertEquals(States.getAbbreviation("Idaho"), "ID");
		assertEquals(States.getAbbreviation("Illinois"), "IL");
		assertEquals(States.getAbbreviation("Indiana"), "IN");
		assertEquals(States.getAbbreviation("Iowa"), "IA");
		assertEquals(States.getAbbreviation("Kansas"), "KS");
		assertEquals(States.getAbbreviation("Kentucky"), "KY");
		assertEquals(States.getAbbreviation("Louisiana"), "LA");
		assertEquals(States.getAbbreviation("Maine"), "ME");
		assertEquals(States.getAbbreviation("Maryland"), "MD");
		assertEquals(States.getAbbreviation("Massachusetts"), "MA");
		assertEquals(States.getAbbreviation("Michigan"), "MI");
		assertEquals(States.getAbbreviation("Minnesota"), "MN");
		assertEquals(States.getAbbreviation("Mississippi"), "MS");
		assertEquals(States.getAbbreviation("Missouri"), "MO");
		assertEquals(States.getAbbreviation("Montana"), "MT");
		assertEquals(States.getAbbreviation("Nebraska"), "NE");
		assertEquals(States.getAbbreviation("Nevada"), "NV");
		assertEquals(States.getAbbreviation("New Hampshire"), "NH");
		assertEquals(States.getAbbreviation("New Jersey"), "NJ");
		assertEquals(States.getAbbreviation("New Mexico"), "NM");
		assertEquals(States.getAbbreviation("New York"), "NY");
		assertEquals(States.getAbbreviation("North Carolina"), "NC");
		assertEquals(States.getAbbreviation("North Dakota"), "ND");
		assertEquals(States.getAbbreviation("Ohio"), "OH");
		assertEquals(States.getAbbreviation("Oklahoma"), "OK");
		assertEquals(States.getAbbreviation("Oregon"), "OR");
		assertEquals(States.getAbbreviation("Pennsylvania"), "PA");
		assertEquals(States.getAbbreviation("Rhode Island"), "RI");
		assertEquals(States.getAbbreviation("South Carolina"), "SC");
		assertEquals(States.getAbbreviation("South Dakota"), "SD");
		assertEquals(States.getAbbreviation("Tennessee"), "TN");
		assertEquals(States.getAbbreviation("Texas"), "TX");
		assertEquals(States.getAbbreviation("Utah"), "UT");
		assertEquals(States.getAbbreviation("Vermont"), "VT");
		assertEquals(States.getAbbreviation("Virginia"), "VA");
		assertEquals(States.getAbbreviation("Washington"), "WA");
		assertEquals(States.getAbbreviation("West Virginia"), "WV");
		assertEquals(States.getAbbreviation("Wisconsin"), "WI");
		assertEquals(States.getAbbreviation("Wyoming"), "WY");
		assertEquals(States.getAbbreviation("Virgin Islands"), "VI");
		assertEquals(States.getAbbreviation("Palau"), "PW");
		assertEquals(States.getAbbreviation("Puerto Rico"), "PR");
		assertEquals(States.getAbbreviation("Northern Marianas"), "MP");
		assertEquals(States.getAbbreviation("Micronesia"), "FM");
		assertEquals(States.getAbbreviation("District of Columbia"), "DC");
		assertEquals(States.getAbbreviation("American Samoa"), "AS");
	}

	@Test
	public void testIsAbbreviation() {
		assertFalse(States.isAbbreviation("not"));
		assertTrue(States.isAbbreviation("AL"));
		assertTrue(States.isAbbreviation("AK"));
		assertTrue(States.isAbbreviation("AZ"));
		assertTrue(States.isAbbreviation("AR"));
		assertTrue(States.isAbbreviation("CA"));
		assertTrue(States.isAbbreviation("CO"));
		assertTrue(States.isAbbreviation("CT"));
		assertTrue(States.isAbbreviation("DE"));
		assertTrue(States.isAbbreviation("FL"));
		assertTrue(States.isAbbreviation("GA"));
		assertTrue(States.isAbbreviation("HI"));
		assertTrue(States.isAbbreviation("ID"));
		assertTrue(States.isAbbreviation("IL"));
		assertTrue(States.isAbbreviation("IN"));
		assertTrue(States.isAbbreviation("IA"));
		assertTrue(States.isAbbreviation("KS"));
		assertTrue(States.isAbbreviation("KY"));
		assertTrue(States.isAbbreviation("LA"));
		assertTrue(States.isAbbreviation("ME"));
		assertTrue(States.isAbbreviation("MD"));
		assertTrue(States.isAbbreviation("MA"));
		assertTrue(States.isAbbreviation("MI"));
		assertTrue(States.isAbbreviation("MN"));
		assertTrue(States.isAbbreviation("MS"));
		assertTrue(States.isAbbreviation("MO"));
		assertTrue(States.isAbbreviation("MT"));
		assertTrue(States.isAbbreviation("NE"));
		assertTrue(States.isAbbreviation("NV"));
		assertTrue(States.isAbbreviation("NH"));
		assertTrue(States.isAbbreviation("NJ"));
		assertTrue(States.isAbbreviation("NM"));
		assertTrue(States.isAbbreviation("NY"));
		assertTrue(States.isAbbreviation("NC"));
		assertTrue(States.isAbbreviation("ND"));
		assertTrue(States.isAbbreviation("OH"));
		assertTrue(States.isAbbreviation("OK"));
		assertTrue(States.isAbbreviation("OR"));
		assertTrue(States.isAbbreviation("PA"));
		assertTrue(States.isAbbreviation("RI"));
		assertTrue(States.isAbbreviation("SC"));
		assertTrue(States.isAbbreviation("SD"));
		assertTrue(States.isAbbreviation("TN"));
		assertTrue(States.isAbbreviation("TX"));
		assertTrue(States.isAbbreviation("UT"));
		assertTrue(States.isAbbreviation("VT"));
		assertTrue(States.isAbbreviation("VA"));
		assertTrue(States.isAbbreviation("WA"));
		assertTrue(States.isAbbreviation("WV"));
		assertTrue(States.isAbbreviation("WI"));
		assertTrue(States.isAbbreviation("WY"));
		assertTrue(States.isAbbreviation("VI"));
		assertTrue(States.isAbbreviation("PW"));
		assertTrue(States.isAbbreviation("PR"));
		assertTrue(States.isAbbreviation("MP"));
		assertTrue(States.isAbbreviation("FM"));
		assertTrue(States.isAbbreviation("DC"));
		assertTrue(States.isAbbreviation("AS"));
	}
}
