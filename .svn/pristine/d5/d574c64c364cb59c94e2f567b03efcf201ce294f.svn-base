package files;

public class InfFileFactory {

	public static InfAbstractFile getFile(String str) {
		if (str == null) {
			return null;
		}
		if (str.equalsIgnoreCase("ser")) {
			return new SerFile();
		} else if (str.equalsIgnoreCase("sek")) {
			return new SekFile();
		} else if (str.equalsIgnoreCase("ind")) {
			return new IndFile();
		}else if(str.equalsIgnoreCase("db")){
			return new DBFile();
		}
		return null;
	}
}
