package edu.truman.cs370t1.addNorm;

public class PersonalAddress extends Address {
	private String state;
	
	public PersonalAddress(){
		super();
	}

	public PersonalAddress(String zip4, String zip5, String state, String city) {
		super();
		this.zip4 = zip4;
		this.zip5 = zip5;
		this.state = state;
		this.city = city;
	}

	@Override
	public boolean normalize() {
		this.city = this.city.toUpperCase();
		
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
		
		if(States.getAbbreviation(state) != null){
			state = States.getAbbreviation(state);
		}
		else{
			if(!States.isAbbreviation(state)){
				return false;
			}
		}
		
		return true;
	}

}
