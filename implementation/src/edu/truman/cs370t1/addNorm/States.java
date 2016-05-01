package edu.truman.cs370t1.addNorm;

import java.util.HashMap;
import java.util.Map;

/**
 * This class resolves state names and abbreviations
 * @author Yuhao Zhang
 * @author Aidan Talerico
 */
public class States {
	
	private static Map<String, String> stateToAbbreviation = null;
		
	/**
	 * Returns the state abbreviation for the given string 
	 * if applicable.
	 * @param fullname the string to retrieve an abbreviation for
	 * @return the abbreviation if possible, null otherwise
	 */
	public static String getAbbreviation(String fullname){
		populateStates();
		return stateToAbbreviation.get(fullname);
	}
	
	/**
	 * Determines if a given string is a state abbreviation.
	 * @param possibleAbbre a string that may be an abbreviation
	 * @return true if the string is a state abbreviation, false otherwise
	 */
	public static boolean isAbbreviation(String possibleAbbre){
		populateStates();
		for(String value : stateToAbbreviation.values()){
			if(value.equals(possibleAbbre)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Populates the state abbreviation hashmap if it has not 
	 * already been populated.
	 */
	private static void populateStates() {
		if(stateToAbbreviation != null){
			return;
		}
		stateToAbbreviation = new HashMap<>();
		stateToAbbreviation.put("Alabama", "AL");
		stateToAbbreviation.put("Alaska", "AK");
		stateToAbbreviation.put("Arizona", "AZ");
		stateToAbbreviation.put("Arkansas", "AR");
		stateToAbbreviation.put("California", "CA");
		stateToAbbreviation.put("Colorado", "CO");
		stateToAbbreviation.put("Connecticut", "CT");
		stateToAbbreviation.put("Delaware", "DE");
		stateToAbbreviation.put("Florida", "FL");
		stateToAbbreviation.put("Georgia", "GA");
		stateToAbbreviation.put("Hawaii", "HI");
		stateToAbbreviation.put("Idaho", "ID");
		stateToAbbreviation.put("Illinois", "IL");
		stateToAbbreviation.put("Indiana", "IN");
		stateToAbbreviation.put("Iowa", "IA");
		stateToAbbreviation.put("Kansas", "KS");
		stateToAbbreviation.put("Kentucky", "KY");
		stateToAbbreviation.put("Louisiana", "LA");
		stateToAbbreviation.put("Maine", "ME");
		stateToAbbreviation.put("Maryland", "MD");
		stateToAbbreviation.put("Massachusetts", "MA");
		stateToAbbreviation.put("Michigan", "MI");
		stateToAbbreviation.put("Minnesota", "MN");
		stateToAbbreviation.put("Mississippi", "MS");
		stateToAbbreviation.put("Missouri", "MO");
		stateToAbbreviation.put("Montana", "MT");
		stateToAbbreviation.put("Nebraska", "NE");
		stateToAbbreviation.put("Nevada", "NV");
		stateToAbbreviation.put("New Hampshire", "NH");
		stateToAbbreviation.put("New Jersey", "NJ");
		stateToAbbreviation.put("New Mexico", "NM");
		stateToAbbreviation.put("New York", "NY");
		stateToAbbreviation.put("North Carolina", "NC");
		stateToAbbreviation.put("North Dakota", "ND");
		stateToAbbreviation.put("Ohio", "OH");
		stateToAbbreviation.put("Oklahoma", "OK");
		stateToAbbreviation.put("Oregon", "OR");
		stateToAbbreviation.put("Pennsylvania", "PA");
		stateToAbbreviation.put("Rhode Island", "RI");
		stateToAbbreviation.put("South Carolina", "SC");
		stateToAbbreviation.put("South Dakota", "SD");
		stateToAbbreviation.put("Tennessee", "TN");
		stateToAbbreviation.put("Texas", "TX");
		stateToAbbreviation.put("Utah", "UT");
		stateToAbbreviation.put("Vermont", "VT");
		stateToAbbreviation.put("Virginia", "VA");
		stateToAbbreviation.put("Washington", "WA");
		stateToAbbreviation.put("West Virginia", "WV");
		stateToAbbreviation.put("Wisconsin", "WI");
		stateToAbbreviation.put("Wyoming", "WY");
		stateToAbbreviation.put("Virgin Islands", "VI");
		stateToAbbreviation.put("Palau ", "PW");
		stateToAbbreviation.put("Puerto Rico ", "PR");
		stateToAbbreviation.put("Northern Marianas", "MP");
		stateToAbbreviation.put("Micronesia", "FM");
		stateToAbbreviation.put("District of Columbia", "DC");
		stateToAbbreviation.put("American Samoa", "AS");
	}	
}
