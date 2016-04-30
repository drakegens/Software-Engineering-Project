import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import edu.truman.cs370t1.addNorm.Address;
import edu.truman.cs370t1.addNorm.PersonalAddress;

/**
 * This class contains the main method for the AddNorm system in batch mode. It lets the user specify an input
 * file to read a list of addresses from, then attempts to normalize those addresses and outputs the successfully
 * normalizable addresses to one file and non-normalizable addresses to a different file.
 *
 * @author Drake Gens
 * @author Andrew Brogan
 * @author Paulie Massey
 * @version 2016-04-30
 * 
 */

public class AddNormBatch {
	private static int streetPos = 0;
	private static int cityPos = 1;
	private static int statePos = 2;
	private static int zip5Pos = 3;
	private static int zip4Pos = 4;
	private static ArrayList<Address> addressArrayList = new ArrayList<Address>();

	/**
	 * The main method of the AddNormBatch class
	 * @param args the file name containing addresses specified by the user 
	 */
	public static void main(String[] args) {
		String filename = "C:\\Users\\Drake\\Documents\\cs370t1\\data\\dataset_2016_04_14.txt";// eventually																								// args[0]
		createInputFile(filename);
		createOutputFiles();
	}

	/**
	 * The method to create the input file based on the user-provided file name and call the workThroughFile method
	 * @param filename the input file name provided by the user
	 */
	public static void createInputFile(String filename) {
		File file = new File(filename);
		try {
			Scanner inputFile = new Scanner(file);
			workThroughFile(inputFile);
		} catch (FileNotFoundException e) {
			System.out.print("Incorrect File Name");
		}
	}

	/**
	 * Iterates through each line of the input file, call the parse method on each line, and add the resulting Address to addressArrayList
	 * @param inputFile the file created in createInputFile
	 */
	public static void workThroughFile(Scanner inputFile) {
		while (inputFile.hasNextLine()) {
			addressArrayList.add(parse(inputFile.nextLine()));
		}
	}
	
	/**
	 * Returns an Address object for each line of the input file, and sets the Error field of Address if it is an incomplete and non-normalizable address.
	 * @param addressString each line of the input file 
	 * @return the Address object resulting from parsing each line of the input file
	 */
	public static Address parse(String addressString) {
		Address address = new PersonalAddress();
		String[] addressarray = addressString.split("\t");
		if (addressarray.length <= 3) {
			address.setError(addressString);
		} else {
			address.setLine1(addressarray[streetPos]);
			address.setCity(addressarray[cityPos]);
			address.setStateCode(addressarray[statePos]);
			address.setZip5(addressarray[zip5Pos]);
			if (addressarray.length == 5) {
				address.setZip4(addressarray[zip4Pos]);
			}
		}
		return address;
	}

	/**
	 * Try creating two output files, one for normalized addresses and one for non-normalizable addresses. Then call iterateThroughAddressCollection
	 */
	public static void createOutputFiles(){
		try {
			PrintWriter outNormalized = new PrintWriter("normalized_addresses.txt");
			PrintWriter outError = new PrintWriter("unnormalized_addresses.txt");
			iterateThroughAddressCollection(outNormalized, outError);		
			outNormalized.close();
			outError.close();
		} catch (FileNotFoundException exception) {
			System.out.println("File could not be created");
		}
	}

	/**
	 * Iterate through each Address in the addressArrayList, calling normalizeAddressesToOutputFiles on each
	 * @param outNormalized the output file to contain normalized Addresses
	 * @param outError the output file to contain non-normalizable Addresses
	 */
	public static void iterateThroughAddressCollection(PrintWriter outNormalized, PrintWriter outError) {
		for (Address address : addressArrayList){
			normalizeAddressesToOutputFiles(outNormalized, outError, address);
		}
	}

	/**
	 * Call the normalize method on each Address, if true (normalizable), print the address to outNormalized
	 * if false (non-normalizable), print the address to outError.
	 * @param outNormalized the output file to contain normalized Addresses
	 * @param outError the output file to contain non-normalizable Addresses
	 * @param address each Address from the Address collection, addressArrayList
	 */
	public static void normalizeAddressesToOutputFiles(PrintWriter outNormalized, PrintWriter outError,
			Address address) {
		if (address.normalize()){
			outNormalized.println(address);
		} else {
			outError.println(address);
		}
	}
}
