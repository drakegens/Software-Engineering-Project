package edu.truman.cs370t1.addNorm;

import java.io.FileReader;

public class CSVReader {

	private int streetPos = 0;
	private int cityPos = 1;
	private int statePos = 2;
	private int zip5Pos = 3;
	private int zip4Pos = 4;

	private String full = "123 Normal St	Kirksville	MO	63501	1234";

	private String noZip4 = "123 Normal St	Kirksville	MO	63501	";
	
	private String filename = "dataset_2016_04_14";

	FileReader in = new FileReader(filename);
	
	
	public Address parse() {

		Address address = new PersonalAddress();
		String[] addressarray = noZip4.split("\t");
		address.setLine1(addressarray[streetPos]);
		address.setCity(addressarray[cityPos]);
		address.setStateCode(addressarray[statePos]);
		address.setZip5(addressarray[zip5Pos]);
		if (addressarray.length == 5) {
			address.setZip4(addressarray[zip4Pos]);
		}

		return address;

	}

}
