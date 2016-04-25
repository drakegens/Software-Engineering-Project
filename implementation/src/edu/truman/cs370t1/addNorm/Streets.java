package edu.truman.cs370t1.addNorm;

import java.util.HashMap;
import java.util.Map;

public class Streets {
	
	private static Map<String, String> streetLineItems = null;
		
	
	public static String getAbbreviation(String streetLine){
		populateStreetItems();

		return streetLineItems.get(streetLine);
	}
	
	public static String getDirectionAbbreviation(String s){
		if(s.equals("NORTH")){
			return "N";
		}
		else if(s.equals("SOUTH")){
			return "S";
		}		
		else if(s.equals("EAST")){
			return "E";
		}
		else if(s.equals("WEST")){
			return "W";
		}
		else if(s.equals("NORTHEAST")){
			return "NE";
		}
		else if(s.equals("NORTHWEST")){
			return "NW";
		}
		else if(s.equals("SOUTHEAST")){
			return "SE";
		}		
		else if(s.equals("SOUTHWEST")){
			return "SW";
		}
		return s;
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
