package edu.truman.cs370t1.addNorm;

public class PersonalAddress extends Address {
	private String state;
	
	public PersonalAddress(){
		super();
	}

	public PersonalAddress(String zip4, String zip5, String state, String city, String line1) {
		super();
		this.zip4 = zip4;
		this.zip5 = zip5;
		this.state = state;
		this.city = city.toUpperCase();
		this.line1 = line1.toUpperCase();
	}
		

	@Override
	public boolean normalize() {
		String[] line1Fields = line1.split(" ");
		String abbreviation = Streets.getAbbreviation(line1Fields[line1Fields.length - 1]);
		if(abbreviation != null){
			line1Fields[line1Fields.length - 1] = abbreviation;
			this.line1 = String.join(" ", line1Fields);
		}
		
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
