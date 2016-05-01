package edu.truman.cs370t1.addNorm;


public class PersonalAddress extends Address {
	private String state;
	private String line2;
	


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
		
	
	private boolean hasLine2(){
		int streetFieldLength = this.line1.split(" ").length;
		if(this.line1.contains(",")){
			this.line2 = line1.split(",")[1].trim();
			this.line1 = line1.split(",")[0].trim();
			return true;
		}
		else if(streetFieldLength >= 2 && 
				Streets.isLine2Abbreviation(this.line1.split(" ")[streetFieldLength - 2])){
			String newline1 = "";
			for(int i = 0; i < streetFieldLength - 2; i++){
				newline1 += this.line1.split(" ")[i] + " "; 
			}
			this.line2 = this.line1.split(" ")[streetFieldLength - 2] 
					+ " " + this.line1.split(" ")[streetFieldLength - 1];
			this.line1 = newline1.trim();

			return true;
		}
		return false;
	}
	
	public String getLine2() {
		return line2;
	}	
	
	private void normalizeLine1(){
		if(hasLine2()){
			this.line1.replaceAll(line2, "");
		}
		String[] line1Fields = line1.split(" ");
		String suffix = Streets.getStreetSuffixAbbreviation(line1Fields[line1Fields.length - 1]);
		if(suffix != null){
			line1Fields[line1Fields.length - 1] = suffix;
		}
		else{
			suffix = Streets.getStreetSuffixAbbreviation(line1Fields[line1Fields.length - 2]);
			if(suffix != null){
				line1Fields[line1Fields.length - 2] = suffix;
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
				this.error = "Unrecognized state abbreviation";
				return false;
			}
		}
		
		return true;
	}
	
	private boolean normalizeZip5(){
		if(zip5.length() != 5){
			this.error = "Zip5 field too short";
			return false;
		}
		if(allNumbers(zip5) == false){
			this.error = "Zip5 field not all numeric";
			return false;
		}
		return true;
	}
	
	private boolean normalizeZip4(){
		if(zip4.length() != 4){
			this.error = "Zip4 field too short";
			return false;
		}
		if(allNumbers(zip4) == false){
			this.error = "Zip4 field not all numeric";
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
		if(this.error != null && this.error.length() != 0){
			this.error = "Not enough field for personal address";
			return false;
		}
		normalizeLine1();
		if(normalizeZip4() == false){
			return false;
		}
		if(normalizeZip5() == false){
			return false;
		}
		if(normalizeState() == false){
			return false;
		}
		return true;		
	}
	
	
	

}
