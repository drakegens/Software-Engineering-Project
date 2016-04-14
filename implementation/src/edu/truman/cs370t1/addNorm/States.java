package edu.truman.cs370t1.addNorm;

import java.util.HashMap;
import java.util.Map;

public class States {
	
	private Map<String, String> stateToAbbreviation = new HashMap<>();
	
	public States(){
		stateToAbbreviation.put("Alabama", "AL");
		stateToAbbreviation.put("Alaska", "AK");
	}
	
	public String getAbbreviation(String fullname){
		return stateToAbbreviation.get(fullname);
	}
	
	
	public boolean isAbbreviation(String possibleAbbre){
		for(String value : stateToAbbreviation.values()){
			if(value.equals(possibleAbbre)){
				return true;
			}
		}
		return false;
	}

}
