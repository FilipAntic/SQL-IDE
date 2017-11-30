package interpreters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONStringInterpreter {

	private final static String path = "resources/jsonFiles/strings.txt";

	public JSONStringInterpreter() {

	}

	public static String interprateString(String string) {

		JSONParser parser = new JSONParser();
		String fromJSON = null;
		try {
			Object object = parser.parse(new FileReader(path));
			JSONObject jsonObject = (JSONObject) object;
			fromJSON = (String) jsonObject.get(string);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return fromJSON;
	}

//	public void readFromJSON(String path) {
//		JSONParser parser = new JSONParser();
//
//		try {
//			Object object = parser.parse(new FileReader(path));
//			JSONObject jsonObject = (JSONObject) object;
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//	}
}
