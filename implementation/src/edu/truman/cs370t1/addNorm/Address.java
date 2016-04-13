package edu.truman.cs370t1.addNorm;

public abstract class Address {
	
	
protected String stateCode;
protected String zip5;
protected String zip4;
protected String line1;
protected String flag;
protected String city;


	
	public String getCity() {
	return city;
}



public void setCity(String city) {
	this.city = city;
}



	public abstract boolean normalize();



	public String getStateCode() {
		return stateCode;
	}



	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}



	public String getZip5() {
		return zip5;
	}



	public void setZip5(String zip5) {
		this.zip5 = zip5;
	}



	public String getZip4() {
		return zip4;
	}



	public void setZip4(String zip4) {
		this.zip4 = zip4;
	}



	public String getLine1() {
		return line1;
	}



	public void setLine1(String line1) {
		this.line1 = line1;
	}
	
	
		
		
		
	
	
	
	
	
}
