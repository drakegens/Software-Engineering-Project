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
		
	
	private void normalizeLine1(){
		String[] line1Fields = line1.split(" ");
		String abbreviation = Streets.getAbbreviation(line1Fields[line1Fields.length - 1]);
		if(abbreviation != null){
			line1Fields[line1Fields.length - 1] = abbreviation;
		}
		else{
			abbreviation = Streets.getAbbreviation(line1Fields[line1Fields.length - 2]);
			if(abbreviation != null){
				line1Fields[line1Fields.length - 2] = abbreviation;
			}			
			line1Fields[line1Fields.length - 1] = Streets.getDirectionAbbreviation(line1Fields[line1Fields.length - 1]);
		}
		for(int i = 0; i < 2 && i < line1Fields.length; i++){
			line1Fields[i] = Streets.getDirectionAbbreviation(line1Fields[i]);
		}
		
		
		this.line1 = String.join(" ", line1Fields);

	}

	private boolean normalizeState(){
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
	
	private boolean normalizeZip(){
		if(zip4.length() != 4){
			return false;
		}
		if(allNumbers(zip4) == false){
			return false;
		}
		
		if(zip5.length() != 5){
			return false;
		}
		if(allNumbers(zip5) == false){
			return false;
		}
		return true;
	}
	
	private boolean allNumbers(String s){
		for(char character : s.toCharArray()){
			if(!Character.isDigit(character)){
				return false;
			}
		}
		return true;
	}
	
	
	@Override
	public boolean normalize() {
		normalizeLine1();
		
		if(normalizeZip() == false){
			return false;
		}
		if(normalizeState() == false){
			return false;
		}
		return true;		
	}

}
