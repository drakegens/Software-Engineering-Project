package edu.truman.cs370t1.addNorm;

public class PersonalAddress extends Address {
	


	public PersonalAddress(String zip4, String zip5) {
		this.zip4 = zip4;
		this.zip5 = zip5;		
	}

	@Override
	public boolean normalize() {
		if(zip4.length() != 4){
			return false;
		}
		for(char character : zip4.toCharArray()){
			if(!Character.isDigit(character)){
				return false;
			}
		}
		if(zip5.length() != 5){
			return false;
		}
		for(char character : zip5.toCharArray()){
			if(!Character.isDigit(character)){
				return false;
			}
		}
			
		
		
		return true;
	}

}
