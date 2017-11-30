package controller;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import app.MainFrame;
import model.Attribute;
import model.Entity;
import model.InfPackage;
import model.MetaSchema;
import model.Storage;

public class JsonValidatorDocumentListener implements DocumentListener {
	private Storage storage = new Storage();

	@Override
	public void insertUpdate(DocumentEvent e) {
		MainFrame.getInstance().getJ().setChanged(true);
		if (checkValidity() == true) {
			MainFrame.getInstance().getJ().getJsonTextArea().setForeground(Color.BLACK);
			MainFrame.getInstance().getJ().getSaveButton().setEnabled(true);
			MainFrame.getInstance().getInfHorizontalSplitPane().getLeftScrollPane().getInfTree()
					.newRoot(readMetaSchema());
			MainFrame.getInstance().getJ().setChanged(true);
		} else {
			MainFrame.getInstance().getJ().getJsonTextArea().setForeground(Color.RED);
			MainFrame.getInstance().getJ().getSaveButton().setEnabled(false);
		}
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		MainFrame.getInstance().getJ().setChanged(true);
		if (checkValidity() == true) {
			MainFrame.getInstance().getJ().getJsonTextArea().setForeground(Color.BLACK);
			MainFrame.getInstance().getJ().getSaveButton().setEnabled(true);
			MainFrame.getInstance().getInfHorizontalSplitPane().getLeftScrollPane().getInfTree()
					.newRoot(readMetaSchema());
			MainFrame.getInstance().getJ().setChanged(true);
		} else {
			MainFrame.getInstance().getJ().getJsonTextArea().setForeground(Color.RED);
			MainFrame.getInstance().getJ().getSaveButton().setEnabled(false);
			// try {
			// string = string+e.getDocument().getText(e.getOffset(),
			// e.getLength());
			// } catch (BadLocationException e1) {
			// e1.printStackTrace();
			// }
		}
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		MainFrame.getInstance().getJ().setChanged(true);
		if (checkValidity() == true) {
			MainFrame.getInstance().getJ().getJsonTextArea().setForeground(Color.BLACK);
			MainFrame.getInstance().getJ().getSaveButton().setEnabled(true);
			MainFrame.getInstance().getInfHorizontalSplitPane().getLeftScrollPane().getInfTree()
					.newRoot(readMetaSchema());
			MainFrame.getInstance().getJ().setChanged(true);
		} else {
			MainFrame.getInstance().getJ().getJsonTextArea().setForeground(Color.RED);
			MainFrame.getInstance().getJ().getSaveButton().setEnabled(false);
		}

	}

	public Storage readMetaSchema() {
		Storage storage = new Storage();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(MetaSchema.path))));

			JSONTokener tokener = new JSONTokener(MainFrame.getInstance().getJ().getJsonTextArea().getText());
			JSONObject o = new JSONObject(tokener);
			storage.setName(o.getJSONObject("storage").getString("name"));
			JSONArray jsonArrayOfPackages = o.getJSONObject("storage").getJSONArray("packages");
			for (int i = 0; i < jsonArrayOfPackages.length(); i++) {
				JSONObject packageObject = jsonArrayOfPackages.getJSONObject(i);
				JSONArray jsonArrayOfEntities = packageObject.getJSONArray("entities");
				InfPackage infPackage = new InfPackage();
				infPackage.setName(packageObject.getString("name"));
				for (int j = 0; j < jsonArrayOfEntities.length(); j++) {
					JSONObject entityObject = jsonArrayOfEntities.getJSONObject(j);
					JSONArray jsonArrayOfAttributes = entityObject.getJSONArray("attributes");
					Entity entity = new Entity();
					entity.setName(entityObject.getString("name"));
					for (int k = 0; k < jsonArrayOfAttributes.length(); k++) {
						JSONObject attributeObject = jsonArrayOfAttributes.getJSONObject(k);
						Attribute attribute = new Attribute();
						attribute.setName(attributeObject.getString("name"));
						attribute.setType(attributeObject.getString("type"));
						attribute.setDescription(attributeObject.getString("description"));
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

	private boolean checkValidity() {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(MetaSchema.path))));

			JSONTokener tokener = new JSONTokener(MainFrame.getInstance().getJ().getJsonTextArea().getText());
			JSONObject o = new JSONObject(tokener);
			storage.setName(o.getJSONObject("storage").getString("name"));
			JSONArray jsonArrayOfPackages = o.getJSONObject("storage").getJSONArray("packages");
			for (int i = 0; i < jsonArrayOfPackages.length(); i++) {
				JSONObject packageObject = jsonArrayOfPackages.getJSONObject(i);
				JSONArray jsonArrayOfEntities = packageObject.getJSONArray("entities");
				InfPackage infPackage = new InfPackage();
				infPackage.setName(packageObject.getString("name"));
				for (int j = 0; j < jsonArrayOfEntities.length(); j++) {
					JSONObject entityObject = jsonArrayOfEntities.getJSONObject(j);
					JSONArray jsonArrayOfAttributes = entityObject.getJSONArray("attributes");
					Entity entity = new Entity();
					entity.setName(entityObject.getString("name"));
					for (int k = 0; k < jsonArrayOfAttributes.length(); k++) {
						JSONObject attributeObject = jsonArrayOfAttributes.getJSONObject(k);
						Attribute attribute = new Attribute();
						attribute.setName(attributeObject.getString("name"));
						attribute.setType(attributeObject.getString("type"));
						attribute.setDescription(attributeObject.getString("description"));
						entity.getAttributes().add(attribute);
					}

					infPackage.getEntities().add(entity);
					infPackage.add(entity);
				}
				storage.getPackages().add(infPackage);
				storage.add(infPackage);
			}
			br.close();
		} catch (ExceptionInInitializerError e1) {
			return false;
		} catch (JSONException e) {
			return false;
		} catch (IOException e) {
			return false;
		}

		return true;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

}
