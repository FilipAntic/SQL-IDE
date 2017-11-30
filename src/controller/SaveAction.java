package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import app.MainFrame;
import model.Attribute;
import model.Entity;
import model.InfPackage;
import model.MetaSchema;
import model.Storage;
import view.JsonViewerDialog;

public class SaveAction implements ActionListener{

	
	@Override
	public void actionPerformed(ActionEvent e) {
		Storage storage = new Storage();
		saveInPath();
		storage = readMetaSchema();
		MainFrame.getInstance().getInfHorizontalSplitPane().getLeftScrollPane().getInfTree().newRoot(storage);
		MainFrame.getInstance().getJ().dispose();
	}
	public static Storage readMetaSchema(){
		Storage storage = new Storage();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(
					new FileInputStream(new File(MetaSchema.path))));
			
			JSONTokener tokener = new JSONTokener(br);
			JSONObject o = new JSONObject(tokener);
			storage.setName(o.getJSONObject("storage").getString("name"));
			JSONArray jsonArrayOfPackages = o.getJSONObject("storage").getJSONArray("packages");
			for(int i = 0; i<jsonArrayOfPackages.length();i++){
				JSONObject packageObject = jsonArrayOfPackages.getJSONObject(i);
				JSONArray jsonArrayOfEntities = packageObject.getJSONArray("entities");
				InfPackage infPackage = new InfPackage();
				infPackage.setName(packageObject.getString("name"));
				for(int j = 0; j<jsonArrayOfEntities.length();j++ ){
					JSONObject entityObject = jsonArrayOfEntities.getJSONObject(j);
					JSONArray jsonArrayOfAttributes = entityObject.getJSONArray("attributes");
					Entity entity = new Entity();
					entity.setName(entityObject.getString("name"));
					for(int k = 0; k<jsonArrayOfAttributes.length(); k++){
						JSONObject attributeObject = jsonArrayOfAttributes.getJSONObject(k);
						Attribute attribute = new Attribute();
						attribute.setName(attributeObject.getString("name"));
//						attribute.setType(entityObject.getString("type"));
//						attribute.setDescription(entityObject.getString("description"));
						entity.getAttributes().add(attribute);
					}
					
					infPackage.getEntities().add(entity);
					infPackage.add(entity);
				}
				storage.getPackages().add(infPackage);
				storage.add(infPackage);
			}
			br.close();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		
	
	return storage;
}
	public static void saveInPath(){
		
		  try{    
	           FileWriter fw=new FileWriter(MetaSchema.path);    
	           fw.write(MainFrame.getInstance().getJ().getJsonTextArea().getText());    
	           fw.close();    
	          }catch(Exception e){
	        	  System.err.println("Putanja je losa");
	          }    
	     }    
	

}
