import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.truman.cs370t1.addNorm.Address;
import edu.truman.cs370t1.addNorm.PersonalAddress;

public class AddNormBatch {
	private static int streetPos = 0;
	private static int cityPos = 1;
	private static int statePos = 2;
	private static int zip5Pos = 3;
	private static int zip4Pos = 4;
	private static ArrayList<Address> addressArray = new ArrayList<Address>();
	
	public static void main(String[] args) {
		String filename = "C:\\Users\\Drake\\Documents\\cs370t1\\data\\dataset_2016_04_14.txt";
		createInputFile(filename);
		System.out.println(addressArray);
	}
	
	public static void createInputFile(String filename) {
		File file = new File(filename);
		try {
			Scanner inputFile = new Scanner(file);
			workThroughFile(inputFile);
		} catch (FileNotFoundException e) {
			System.out.print("Incorrect File Name");
		}
	}
	
	public static Address parse(String addressString) {

		Address address = new PersonalAddress();
		String[] addressarray = addressString.split("\t");
		address.setLine1(addressarray[streetPos]);
		address.setCity(addressarray[cityPos]);
		address.setStateCode(addressarray[statePos]);
		address.setZip5(addressarray[zip5Pos]);//change naming 
		if (addressarray.length == 5) {
			address.setZip4(addressarray[zip4Pos]);
		}
		return address;
	}
	
	public static void workThroughFile(Scanner inputFile){//not all have appropriate number of tabs
		
int i = 0;
		while (inputFile.hasNextLine()){
			addressArray.add(parse(inputFile.nextLine()));
			i++;
			System.out.println("address added to array" + i);
		
		}
	}
	
}
