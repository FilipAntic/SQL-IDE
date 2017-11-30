package interpreters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import model.Attribute;
import model.Entity;
import model.InfPackage;
import model.MetaSchema;
import model.Storage;

public class TryingParser {
	private Storage storage;
	private File file; 
	
	public TryingParser() {
		storage = new Storage();
	}

	public Storage readMetaSchema() {

		BufferedReader br = null;
		file = new File("resources/metaSchema/p.json");
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

			JSONTokener tokener = new JSONTokener(br);
			JSONObject o = new JSONObject(tokener);
			storage.setName(WorkingWithPath.getGrandparentName(file));
			InfPackage infPackage = new InfPackage();
			infPackage.setName(WorkingWithPath.getParentName(file));
			Entity entity = new Entity();
			entity.setName(WorkingWithPath.getFileName(file));
			
			JSONArray proba = o.getJSONArray("attributes");
			for(int i = 0;i<proba.length();i++){
				JSONObject object = proba.getJSONObject(i);
				Attribute attribute = new Attribute();
				attribute.setName(object.getString("name"));
				attribute.setLength(object.getInt("length"));
				attribute.setType(object.getString("type"));
				entity.addAttribute(attribute);
			}
			infPackage.addEntity(entity);
			storage.addPackage(infPackage);
			br.close();
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		return storage;
	}
}
