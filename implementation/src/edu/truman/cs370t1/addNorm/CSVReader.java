package edu.truman.cs370t1.addNorm;

public class CSVReader {

	private String full = "123 Normal St, Kirksville, MO, 63501, 1234";
	
	public Address parse() {
	Address address = new PersonalAddress();
	
	String[] addressarray = full.split(", ");
	
	address.setLine1(addressarray[0]);
	
	address.setCity(addressarray[1]);
	
	address.setStateCode(addressarray[2]);
	
	address.setZip5(addressarray[3]);
	
	
	address.setZip4(addressarray[4]);
	
	return address;
	
	
	
	}
}
