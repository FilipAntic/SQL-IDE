package interpreters;

public class StringUtil {

	public static String DBnameToNormal(String name){
		
		name = name.replaceAll("_", " ");
		name = name.toLowerCase();
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		return name;
	}
	
	public static String normalToDBname(String name){
		name = name.replaceAll(" ", "_");
		name = name.toUpperCase();
		return name;
	}
	
	public static String ascOrDesc(String asc){
		if(asc.equalsIgnoreCase("Ascending")){
			return "ASC";
		}else{
			return "DESC";
		}
	}
}
