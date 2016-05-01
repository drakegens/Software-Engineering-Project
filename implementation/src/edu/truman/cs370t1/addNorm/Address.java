package edu.truman.cs370t1.addNorm;

/**
 * This class represents a general address that is able to normalize itself
 * @author Yuhao Zhang
 * @author Aidan Talerico
 */
public abstract class Address {
	
	
protected String stateCode;
protected String zip5;
protected String zip4;
protected String line1;
protected String flag;
protected String city;
protected String error = null;


	/**
	 * This method returns the error message that prevents the address from being normalized
	 * @return the error message
	 */
	public String getError() {
		return error;
	}
	
	
	/**
	 * This method sets the error message that prevents the address from being normalized
	 * @param error
	 */
	public void setError(String error) {
		this.error = error;
	}
		
		public String getCity() {
		return city;
	}
	
	
	/**
	 * This method sets the city name of the address
	 * @param city the city name
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * This method attempts to normalize the address fields and return whether it has been normalized successfully
	 * @return whether it is normalized successfully
	 */
	public abstract boolean normalize();


	/**
	 * This method returns the state code
	 * @return the state code
	 */
	public String getStateCode() {
		return stateCode;
	}


	/**
	 * This method sets the state code
	 * @param stateCode the state code
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}


	/**
	 * This method returns the five digit zip code
	 * @return the five digit zip code
	 */
	public String getZip5() {
		return zip5;
	}


	/**
	 * This method sets the five digit zip code
	 * @param zip5 the five digit zip code
	 */
	public void setZip5(String zip5) {
		this.zip5 = zip5;
	}


	/**
	 * This method returns the four digit zip code
	 * @return the four digit zip code
	 */
	public String getZip4() {
		return zip4;
	}


	/**
	 * This method sets the four digit zip code
	 * @param zip4 the four digit zip code
	 */
	public void setZip4(String zip4) {
		this.zip4 = zip4;
	}


	/**
	 * This method returns the delivery address line
	 * @return the delivery address line
	 */
	public String getLine1() {
		return line1;
	}


	/**
	 * This method sets the delivery address line
	 * @param line1 the delivery address line
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	
	
		
		
		
	
	
	
	
	
}
