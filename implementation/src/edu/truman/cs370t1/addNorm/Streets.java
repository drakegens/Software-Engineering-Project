package edu.truman.cs370t1.addNorm;

import java.util.HashMap;
import java.util.Map;

public class Streets {
	
	private static Map<String, String> streetLineItems = null;
		
	
	public static String getAbbreviation(String streetLine){
		populateStreetItems();

		return streetLineItems.get(streetLine);
	}
	
	

	private static void populateStreetItems() {
		if(streetLineItems != null){
			return;
		}
		streetLineItems = new HashMap<>();
		streetLineItems.put("ALLEE", "ALY");
		streetLineItems.put("ALLEY", "ALY");

		
	}	
}
