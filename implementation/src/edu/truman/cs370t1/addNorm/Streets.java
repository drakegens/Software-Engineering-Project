package edu.truman.cs370t1.addNorm;

import java.util.HashMap;
import java.util.Map;


/**
 * This class resolves the street name, directionals and their abbreviations
 * @author Yuhao Zhang
 * @author Aidan Talerico
 */
public class Streets {
	
	private static Map<String, String> streetSuffixAbbreviations = null;
	private static Map<String, String> designatorAbbreviations = null;
	
	/**
	 * For a given direction in all capital letters, this function returns 
	 * the standard abbreviation if applicable.
	 * @param direction the direction to retrieve the abbreviation of
	 * @return the direction's abbreviation or the given string if it is not one 
	 */
	public static String getDirectionAbbreviation(String direction){
		if(direction.equals("NORTH")){
			return "N";
		}
		else if(direction.equals("SOUTH")){
			return "S";
		}		
		else if(direction.equals("EAST")){
			return "E";
		}
		else if(direction.equals("WEST")){
			return "W";
		}
		else if(direction.equals("NORTHEAST")){
			return "NE";
		}
		else if(direction.equals("NORTHWEST")){
			return "NW";
		}
		else if(direction.equals("SOUTHEAST")){
			return "SE";
		}		
		else if(direction.equals("SOUTHWEST")){
			return "SW";
		}
		return direction;
	}
	
	/**
	 * Determines whether a given string is a standard secondary 
	 * address unit desiginator abbreviation.
	 * @param possible_designator the string to be checked
	 * @return true if the string is a designator, false otherwise
	 */
	
	public static boolean isDesignatorAbbreviation(String possible_designator) {
		populateDesignatorAbbreviations();
		for(String value : designatorAbbreviations.values()){
			if(value.equals(possible_designator)){
				return true;
			}
		}
		return false;
	}	
	
	/**
	 * Returns the standard secondary address unit designator for a given 
	 * string if applicable. 
	 * @param designator the string to retrieve an abbreviation for
	 * @return the abbreviated designator if possible, null otherwise
	 */
	public static String getDesignatorAbbreviation(String designator) {
		populateDesignatorAbbreviations();

		return designatorAbbreviations.get(designator);
	}	
	
	/**
	 * Returns the street abbreviated street suffix for the given string 
	 * if applicable.
	 * @param streetSuffix the string to retrieve an abbreviation for
	 * @return the abbreviated suffix if possible, null otherwise
	 */
	public static String getStreetSuffixAbbreviation(String streetSuffix){
		populateStreetSuffixAbbreviations();
		return streetSuffixAbbreviations.get(streetSuffix);
	}
	
	/**
	 * Populates the secondary unit abbreviation hashmap if it has not 
	 * already been populated.
	 */
	private static void populateDesignatorAbbreviations() {
		if(streetSuffixAbbreviations != null){
			return;
		}
		designatorAbbreviations = new HashMap<>();
		designatorAbbreviations.put("BUILDING", "BLDG");
		designatorAbbreviations.put("APARTMENT", "APT");
		designatorAbbreviations.put("FLOOR", "FL");
		designatorAbbreviations.put("SUITE", "STE");
		designatorAbbreviations.put("ROOM", "RM");
		designatorAbbreviations.put("DEPARTMENT", "DEPT");
	}
	
	/**
	 * Populates the street suffix abbreviation hashmap if it has not 
	 * already been populated.
	 */
	private static void populateStreetSuffixAbbreviations() {
		if(streetSuffixAbbreviations != null){
			return;
		}
		streetSuffixAbbreviations = new HashMap<>();
		streetSuffixAbbreviations.put("ALLEE", "ALY");
		streetSuffixAbbreviations.put("ALLEY", "ALY");
		streetSuffixAbbreviations.put("ALLY", "ALY");
		streetSuffixAbbreviations.put("ANEX", "ANX");
		streetSuffixAbbreviations.put("ANNEX", "ANX");
		streetSuffixAbbreviations.put("ANNX", "ANX");
		streetSuffixAbbreviations.put("ARCADE", "ARC");
		streetSuffixAbbreviations.put("AV", "AVE");
		streetSuffixAbbreviations.put("AVENU", "AVE");
		streetSuffixAbbreviations.put("AVENUE", "AVE");
		streetSuffixAbbreviations.put("AVNUE", "AVE");
		streetSuffixAbbreviations.put("AVEN", "AVE");
		streetSuffixAbbreviations.put("BAYOU", "BYU");
		streetSuffixAbbreviations.put("BAYOU", "BYU");
		streetSuffixAbbreviations.put("BEACH", "BCH");
		streetSuffixAbbreviations.put("BEND", "BND");
		streetSuffixAbbreviations.put("BLUF", "BLF");
		streetSuffixAbbreviations.put("BLUFF", "BLF");
		streetSuffixAbbreviations.put("BLUFFS", "BLFS");
		streetSuffixAbbreviations.put("BLUFFS", "BLFS");
		streetSuffixAbbreviations.put("BLUF", "BLF");
		streetSuffixAbbreviations.put("BLUFF", "BLF");
		streetSuffixAbbreviations.put("BLUFFS", "BLFS");
		streetSuffixAbbreviations.put("BOT", "BTM");
		streetSuffixAbbreviations.put("BOTTM", "BTM");
		streetSuffixAbbreviations.put("BOTTOM", "BTM");
		streetSuffixAbbreviations.put("BOUL", "BLVD");
		streetSuffixAbbreviations.put("BOULEVARD", "BLVD");
		streetSuffixAbbreviations.put("BOULV", "BLVD");
		streetSuffixAbbreviations.put("BRNCH", "BR");
		streetSuffixAbbreviations.put("BRANCH", "BR");
		streetSuffixAbbreviations.put("BRIDGE", "BR");
		streetSuffixAbbreviations.put("BRDGE", "BR");
		streetSuffixAbbreviations.put("BROOK", "BRK");
		streetSuffixAbbreviations.put("BROOKS", "BRKS");
		streetSuffixAbbreviations.put("BURG", "BG");
		streetSuffixAbbreviations.put("BURGS", "BGS");
		streetSuffixAbbreviations.put("BYPASS", "BYP");
		streetSuffixAbbreviations.put("BYPA", "BYP");
		streetSuffixAbbreviations.put("BYPAS", "BYP");
		streetSuffixAbbreviations.put("BYPS", "BYP");
		streetSuffixAbbreviations.put("CAMP", "CP");
		streetSuffixAbbreviations.put("CMP", "CP");
		streetSuffixAbbreviations.put("CANYON", "CP");
		streetSuffixAbbreviations.put("CANYN", "CP");
		streetSuffixAbbreviations.put("CAPE", "CPE");
		streetSuffixAbbreviations.put("CAUSEWAY", "CSWY");
		streetSuffixAbbreviations.put("CAUSWA", "CSWY");
		streetSuffixAbbreviations.put("CENTER", "CTR");
		streetSuffixAbbreviations.put("CENT", "CTR");
		streetSuffixAbbreviations.put("CENTR", "CTR");
		streetSuffixAbbreviations.put("CENTRE", "CTR");
		streetSuffixAbbreviations.put("CNTER", "CTR");
		streetSuffixAbbreviations.put("CNTR", "CTR");
		streetSuffixAbbreviations.put("CENTERS", "CTRS");
		streetSuffixAbbreviations.put("CIRCLE", "CIR");
		streetSuffixAbbreviations.put("CIRC", "CIR");
		streetSuffixAbbreviations.put("CIRCL", "CIR");
		streetSuffixAbbreviations.put("CRCL", "CIR");
		streetSuffixAbbreviations.put("CRCLE", "CIR");
		streetSuffixAbbreviations.put("CIRCLES", "CIRS");
		streetSuffixAbbreviations.put("CLIFF", "CLF");
		streetSuffixAbbreviations.put("CLIFFS", "CLFS");
		streetSuffixAbbreviations.put("CLUB", "CLB");
		streetSuffixAbbreviations.put("COMMON", "CMN");
		streetSuffixAbbreviations.put("COMMONS", "CMNS");
		streetSuffixAbbreviations.put("CORNER", "COR");
		streetSuffixAbbreviations.put("CORNERS", "CORS");
		streetSuffixAbbreviations.put("COURT", "CT");
		streetSuffixAbbreviations.put("COURTS", "CTS");
		streetSuffixAbbreviations.put("COVE", "CV");
		streetSuffixAbbreviations.put("COVES", "CVS");
		streetSuffixAbbreviations.put("CREEK", "CRK");
		streetSuffixAbbreviations.put("CRESCENT", "CRES");
		streetSuffixAbbreviations.put("CRSENT", "CRES");
		streetSuffixAbbreviations.put("CRSNT", "CRES");
		streetSuffixAbbreviations.put("CREST", "CRST");
		streetSuffixAbbreviations.put("CROSSING", "XING");
		streetSuffixAbbreviations.put("CRSSNG", "XING");
		streetSuffixAbbreviations.put("CROSSROAD", "XRD");
		streetSuffixAbbreviations.put("CROSSROADS", "XRDS");
		streetSuffixAbbreviations.put("CURVE", "CURV");
		streetSuffixAbbreviations.put("DALE", "DL");
		streetSuffixAbbreviations.put("DAM", "DM");
		streetSuffixAbbreviations.put("DIV", "DV");
		streetSuffixAbbreviations.put("DIVIDE", "DV");
		streetSuffixAbbreviations.put("DVD", "DV");
		streetSuffixAbbreviations.put("DRIVE", "DV");
		streetSuffixAbbreviations.put("DRV", "DV");
		streetSuffixAbbreviations.put("DRIV", "DV");
		streetSuffixAbbreviations.put("DRIVES", "DVS");
		streetSuffixAbbreviations.put("ESTATE", "EST");
		streetSuffixAbbreviations.put("ESTATES", "ESTS");
		streetSuffixAbbreviations.put("EXPRESSWAY", "EXPY");
		streetSuffixAbbreviations.put("EXP", "EXPY");
		streetSuffixAbbreviations.put("EXPR", "EXPY");
		streetSuffixAbbreviations.put("EXPRESS", "EXPY");
		streetSuffixAbbreviations.put("EXPW", "EXPY");
		streetSuffixAbbreviations.put("EXTENSION", "EXT");
		streetSuffixAbbreviations.put("EXTN", "EXT");
		streetSuffixAbbreviations.put("EXTNSN", "EXT");
		streetSuffixAbbreviations.put("FALLS", "FLS");
		streetSuffixAbbreviations.put("FERRY", "FRY");
		streetSuffixAbbreviations.put("FRRY", "FRY");
		streetSuffixAbbreviations.put("FIELD", "FLD");
		streetSuffixAbbreviations.put("FIELDS", "FLDS");
		streetSuffixAbbreviations.put("FLAT", "FLT");
		streetSuffixAbbreviations.put("FLATS", "FLTS");
		streetSuffixAbbreviations.put("FORD", "FRD");
		streetSuffixAbbreviations.put("FORDS", "FRDS");
		streetSuffixAbbreviations.put("FOREST", "FRST");
		streetSuffixAbbreviations.put("FORESTS", "FRST");	
		streetSuffixAbbreviations.put("FORGE", "FRG");	
		streetSuffixAbbreviations.put("FORG", "FRG");	
		streetSuffixAbbreviations.put("FORGES", "FRGS");	
		streetSuffixAbbreviations.put("FORK", "FRK");	
		streetSuffixAbbreviations.put("FORKS", "FRKS");	
		streetSuffixAbbreviations.put("FORT", "FT");	
		streetSuffixAbbreviations.put("FRT", "FT");	
		streetSuffixAbbreviations.put("FREEWAY", "FWY");	
		streetSuffixAbbreviations.put("FREEWY", "FWY");	
		streetSuffixAbbreviations.put("FRWAY", "FWY");	
		streetSuffixAbbreviations.put("FRWY", "FWY");
		streetSuffixAbbreviations.put("GARDEN", "GDN");	
		streetSuffixAbbreviations.put("GARDN", "GDN");	
		streetSuffixAbbreviations.put("GRDN", "GDN");	
		streetSuffixAbbreviations.put("GARDENS", "GDNS");	
		streetSuffixAbbreviations.put("GARDNS", "GDNS");	
		streetSuffixAbbreviations.put("GRDNS", "GDNS");	
		streetSuffixAbbreviations.put("GATEWAY", "GTWY");	
		streetSuffixAbbreviations.put("GATEWY", "GTWY");	
		streetSuffixAbbreviations.put("GATWAY", "GTWY");	
		streetSuffixAbbreviations.put("GTWAY", "GTWY");	
		streetSuffixAbbreviations.put("GLEN", "GLN");	
		streetSuffixAbbreviations.put("GLENS", "GLNS");	
		streetSuffixAbbreviations.put("GREEN", "GRN");	
		streetSuffixAbbreviations.put("GREENS", "GRNS");	
		streetSuffixAbbreviations.put("GROVE", "GRV");	
		streetSuffixAbbreviations.put("GROV", "GRV");	
		streetSuffixAbbreviations.put("GROVES", "GRVS");	
		streetSuffixAbbreviations.put("HARBOR", "HBR");	
		streetSuffixAbbreviations.put("HARB", "HBR");	
		streetSuffixAbbreviations.put("HARBR", "HBR");	
		streetSuffixAbbreviations.put("HRBOR", "HBR");	
		streetSuffixAbbreviations.put("HARBORS", "HBRS");	
		streetSuffixAbbreviations.put("HAVEN", "HVN");
		streetSuffixAbbreviations.put("HEIGHTS", "HTS");	
		streetSuffixAbbreviations.put("HT", "HTS");	
		streetSuffixAbbreviations.put("HIGHWAY", "HWY");
		streetSuffixAbbreviations.put("HIGHWY", "HWY");
		streetSuffixAbbreviations.put("HIWAY", "HWY");
		streetSuffixAbbreviations.put("HIWY", "HWY");
		streetSuffixAbbreviations.put("HWAY", "HWY");
		streetSuffixAbbreviations.put("HILL", "HL");
		streetSuffixAbbreviations.put("HILLS", "HLS");
		streetSuffixAbbreviations.put("HOLLOW", "HOLW");
		streetSuffixAbbreviations.put("HLLW", "HOLW");
		streetSuffixAbbreviations.put("HOLLOWS", "HOLW");
		streetSuffixAbbreviations.put("HOLW", "HOLW");
		streetSuffixAbbreviations.put("HOLWS", "HOLW");
		streetSuffixAbbreviations.put("INLET", "INLT");
		streetSuffixAbbreviations.put("ISLAND", "IS");
		streetSuffixAbbreviations.put("ISLND", "IS");
		streetSuffixAbbreviations.put("ISLANDS", "ISS");
		streetSuffixAbbreviations.put("ISLNDS", "ISS");
		streetSuffixAbbreviations.put("ISLES", "ISLE");
		streetSuffixAbbreviations.put("JUNCTION", "JCT");
		streetSuffixAbbreviations.put("JCTION", "JCT");
		streetSuffixAbbreviations.put("JCTN", "JCT");
		streetSuffixAbbreviations.put("JUNCTN", "JCT");
		streetSuffixAbbreviations.put("JUNCTON", "JCT");
		streetSuffixAbbreviations.put("JUNCTIONS", "JCTS");
		streetSuffixAbbreviations.put("JCTNS", "JCTS");
		streetSuffixAbbreviations.put("KEY", "KY");
		streetSuffixAbbreviations.put("KNOLLS", "KNLS");
		streetSuffixAbbreviations.put("KNOLLS", "KNLS");
		streetSuffixAbbreviations.put("LAKE", "LK");	
		streetSuffixAbbreviations.put("LAKES", "LKS");
		streetSuffixAbbreviations.put("LANDING", "LNDG");	
		streetSuffixAbbreviations.put("LNDNG", "LNDG");	
		streetSuffixAbbreviations.put("LANE", "LN");	
		streetSuffixAbbreviations.put("LIGHT", "LGT");	
		streetSuffixAbbreviations.put("LIGHTS", "LGTS");	
		streetSuffixAbbreviations.put("LOAF", "LF");	
		streetSuffixAbbreviations.put("LOCK", "LCK");	
		streetSuffixAbbreviations.put("LOCKS", "LCKS");	
		streetSuffixAbbreviations.put("LODGE", "LDG");
		streetSuffixAbbreviations.put("LDGE", "LDG");
		streetSuffixAbbreviations.put("LODG", "LDG");	
		streetSuffixAbbreviations.put("LOOPS", "LOOPS");	
		streetSuffixAbbreviations.put("MANOR", "MNR");	
		streetSuffixAbbreviations.put("MANORS", "MNRS");	
		streetSuffixAbbreviations.put("MEADOW", "MDW");	
		streetSuffixAbbreviations.put("MEADOWS", "MDWS");	
		streetSuffixAbbreviations.put("MDWS", "MDWS");	
		streetSuffixAbbreviations.put("MEDOWS", "MDWS");	
		streetSuffixAbbreviations.put("MILL", "ML");
		streetSuffixAbbreviations.put("MILLS", "MLS");	
		streetSuffixAbbreviations.put("MISSION", "MSN");
		streetSuffixAbbreviations.put("MSSN", "MSN");
		streetSuffixAbbreviations.put("MISSN", "MSN");
		streetSuffixAbbreviations.put("MOTORWAY", "MTWY");
		streetSuffixAbbreviations.put("MOUNT", "MT");
		streetSuffixAbbreviations.put("MNT", "MT");
		streetSuffixAbbreviations.put("MOUNTAIN", "MTN");
		streetSuffixAbbreviations.put("MNTAIN", "MTN");
		streetSuffixAbbreviations.put("MNTN", "MTN");
		streetSuffixAbbreviations.put("MOUNTAIN", "MTN");
		streetSuffixAbbreviations.put("MOUNTIN", "MTN");
		streetSuffixAbbreviations.put("MTIN", "MTN");
		streetSuffixAbbreviations.put("MOUNTAINS", "MTNS");
		streetSuffixAbbreviations.put("MNTNS", "MTNS");
		streetSuffixAbbreviations.put("NECK", "NCK");
		streetSuffixAbbreviations.put("ORCHARD", "ORCH");
		streetSuffixAbbreviations.put("ORCHRD", "ORCH");
		streetSuffixAbbreviations.put("OVL", "OVAL");
		streetSuffixAbbreviations.put("OVERPASS", "OPAS");
		streetSuffixAbbreviations.put("PRK", "PARK");
		streetSuffixAbbreviations.put("PARKS", "PARK");
		streetSuffixAbbreviations.put("PARKWAY", "PKWY");
		streetSuffixAbbreviations.put("PARKWY", "PKWY");
		streetSuffixAbbreviations.put("PKWAY", "PKWY");
		streetSuffixAbbreviations.put("PKY", "PKWY");
		streetSuffixAbbreviations.put("PARKWAYS", "PKWY");
		streetSuffixAbbreviations.put("PKWYS", "PKWY");
		streetSuffixAbbreviations.put("PASSAGE", "PSGE");
		streetSuffixAbbreviations.put("PATHS", "PATH");
		streetSuffixAbbreviations.put("PIKES", "PIKE");
		streetSuffixAbbreviations.put("PINE", "PNE");
		streetSuffixAbbreviations.put("PINES", "PNES");
		streetSuffixAbbreviations.put("PLACE", "PL");
		streetSuffixAbbreviations.put("PLAIN", "PLN");
		streetSuffixAbbreviations.put("PLAINS", "PLNS");
		streetSuffixAbbreviations.put("PLAZA", "PLZ");
		streetSuffixAbbreviations.put("PLZA", "PLZ");
		streetSuffixAbbreviations.put("POINT", "PT");
		streetSuffixAbbreviations.put("POINTS", "PTS");
		streetSuffixAbbreviations.put("PORT", "PRT");
		streetSuffixAbbreviations.put("PORTS", "PRTS");
		streetSuffixAbbreviations.put("PLAZA", "PLZ");
		streetSuffixAbbreviations.put("PRAIRIE", "PR");
		streetSuffixAbbreviations.put("PRR", "PR");
		streetSuffixAbbreviations.put("RADIAL", "RADL");
		streetSuffixAbbreviations.put("RAD", "RADL");
		streetSuffixAbbreviations.put("RADIEL", "RADL");
		streetSuffixAbbreviations.put("RANCH", "RNCH");
		streetSuffixAbbreviations.put("RANCHES", "RNCH");
		streetSuffixAbbreviations.put("RNCHS", "RNCH");
		streetSuffixAbbreviations.put("RAPID", "RPD");
		streetSuffixAbbreviations.put("RAPIDS", "RPDS");
		streetSuffixAbbreviations.put("REST", "RST");
		streetSuffixAbbreviations.put("RIDGE", "RDG");
		streetSuffixAbbreviations.put("RDGE", "RDG");
		streetSuffixAbbreviations.put("RIDGES", "RDGS");
		streetSuffixAbbreviations.put("RDGES", "RDGS");
		streetSuffixAbbreviations.put("RIVER", "RIV");
		streetSuffixAbbreviations.put("RVR", "RIV");
		streetSuffixAbbreviations.put("RIVR", "RIV");
		streetSuffixAbbreviations.put("ROAD", "RD");
		streetSuffixAbbreviations.put("ROADS", "RDS");
		streetSuffixAbbreviations.put("ROUTE", "RTE");
		streetSuffixAbbreviations.put("SHOAL", "SHL");
		streetSuffixAbbreviations.put("SHOALS", "SHLS");
		streetSuffixAbbreviations.put("SHORE", "SHR");
		streetSuffixAbbreviations.put("SHOAR", "SHR");
		streetSuffixAbbreviations.put("SHORES", "SHRS");
		streetSuffixAbbreviations.put("SHOARS", "SHRS");
		streetSuffixAbbreviations.put("SKYWAY", "SKWY");
		streetSuffixAbbreviations.put("SPRING", "SPG");
		streetSuffixAbbreviations.put("SPNG", "SPG");
		streetSuffixAbbreviations.put("SPRNG", "SPG");
		streetSuffixAbbreviations.put("SPRINGS", "SPGS");
		streetSuffixAbbreviations.put("SPNGS", "SPGS");
		streetSuffixAbbreviations.put("SPRNGS", "SPGS");
		streetSuffixAbbreviations.put("SPURS", "SPUR");
		streetSuffixAbbreviations.put("SQUARE", "SQ");
		streetSuffixAbbreviations.put("SQR", "SQ");
		streetSuffixAbbreviations.put("SQRE", "SQ");
		streetSuffixAbbreviations.put("SQU", "SQ");
		streetSuffixAbbreviations.put("SQUARES", "SQS");
		streetSuffixAbbreviations.put("SQRS", "SQS");
		streetSuffixAbbreviations.put("STATION", "STA");
		streetSuffixAbbreviations.put("STATN", "STA");
		streetSuffixAbbreviations.put("STN", "STA");
		streetSuffixAbbreviations.put("STRAVENUE", "STRA");
		streetSuffixAbbreviations.put("STRAV", "STRA");
		streetSuffixAbbreviations.put("STRAVEN", "STRA");
		streetSuffixAbbreviations.put("STRAVN", "STRA");
		streetSuffixAbbreviations.put("STRVN", "STRA");
		streetSuffixAbbreviations.put("STRVNUE", "STRA");
		streetSuffixAbbreviations.put("STREAM", "STRM");
		streetSuffixAbbreviations.put("STREME", "STRM");
		streetSuffixAbbreviations.put("STREET", "ST");
		streetSuffixAbbreviations.put("STRT", "ST");
		streetSuffixAbbreviations.put("STR", "ST");
		streetSuffixAbbreviations.put("STREETS", "STS");
		streetSuffixAbbreviations.put("SUMMIT", "ST");
		streetSuffixAbbreviations.put("SUMIT", "ST");
		streetSuffixAbbreviations.put("SUMITT", "ST");
		streetSuffixAbbreviations.put("SMT", "ST");
		streetSuffixAbbreviations.put("TERRACE", "TER");
		streetSuffixAbbreviations.put("TERR", "TER");
		streetSuffixAbbreviations.put("THROUGHWAY", "TRWY");
		streetSuffixAbbreviations.put("TRACE", "TRCE");
		streetSuffixAbbreviations.put("TRACES", "TRCE");
		streetSuffixAbbreviations.put("TRACK", "TRAK");
		streetSuffixAbbreviations.put("TRACKS", "TRAK");
		streetSuffixAbbreviations.put("TRK", "TRAK");
		streetSuffixAbbreviations.put("TRKS", "TRAK");
		streetSuffixAbbreviations.put("TRAFFICWAY", "TRFY");
		streetSuffixAbbreviations.put("TRAIL", "TRL");
		streetSuffixAbbreviations.put("TRAILS", "TRL");
		streetSuffixAbbreviations.put("TRLS", "TRL");
		streetSuffixAbbreviations.put("TRAILER", "TRLR");
		streetSuffixAbbreviations.put("TLRS", "TRLR");
		streetSuffixAbbreviations.put("TUNNEL", "TUNL");
		streetSuffixAbbreviations.put("TUNL", "TUNL");
		streetSuffixAbbreviations.put("TUNLS", "TUNL");
		streetSuffixAbbreviations.put("TUNNEL", "TUNL");
		streetSuffixAbbreviations.put("TUNNL", "TUNL");
		streetSuffixAbbreviations.put("TUNNELS", "TUNL");
		streetSuffixAbbreviations.put("TURNPIKE", "TPKE");
		streetSuffixAbbreviations.put("TRNPK", "TPKE");
		streetSuffixAbbreviations.put("TURNPK", "TPKE");
		streetSuffixAbbreviations.put("UNDERPASS", "UPAS");
		streetSuffixAbbreviations.put("UNION", "UN");
		streetSuffixAbbreviations.put("UNIONS", "UNS");
		streetSuffixAbbreviations.put("VALLEY", "VLY");
		streetSuffixAbbreviations.put("VALLY", "VLY");
		streetSuffixAbbreviations.put("VLLY", "VLY");
		streetSuffixAbbreviations.put("VALLYES", "VLYS");
		streetSuffixAbbreviations.put("VIADUCT", "VIA");
		streetSuffixAbbreviations.put("VIA", "VIA");
		streetSuffixAbbreviations.put("VIADCT", "VIA");
		streetSuffixAbbreviations.put("VIEW", "VW");
		streetSuffixAbbreviations.put("VIEWS", "VWS");
		streetSuffixAbbreviations.put("VILLAGE", "VLG");
		streetSuffixAbbreviations.put("VILLAG", "VLG");
		streetSuffixAbbreviations.put("VILLG", "VLG");
		streetSuffixAbbreviations.put("VILLIAG", "VLG");
		streetSuffixAbbreviations.put("VILL", "VLG");
		streetSuffixAbbreviations.put("VILLAGES", "VLGS");
		streetSuffixAbbreviations.put("VILL", "VL");
		streetSuffixAbbreviations.put("VISTA", "VIS");
		streetSuffixAbbreviations.put("VIST", "VIS");
		streetSuffixAbbreviations.put("VST", "VIS");
		streetSuffixAbbreviations.put("VSTA", "VIS");
		streetSuffixAbbreviations.put("WALKS", "WALK");
		streetSuffixAbbreviations.put("WY", "WAY");
		streetSuffixAbbreviations.put("WELL", "WL");
		streetSuffixAbbreviations.put("WELLS", "WLS");
	}
}
