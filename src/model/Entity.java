package model;

import java.util.ArrayList;

import files.InfAbstractFile;
import files.InfFileFactory;

public class Entity extends InfomationalResource {

	private ArrayList<Attribute> attributes;
	private InfAbstractFile infFile;
	private String relation;
	private ArrayList<String> relations;
	private String relationName;

	public Entity() {
		attributes = new ArrayList<>();
		relations = new ArrayList<>();
	}

	public ArrayList<String> getRelations() {
		return relations;
	}

	public void addAttribute(Attribute attribute) {
		attributes.add(attribute);
	}

	public ArrayList<Attribute> getAttributes() {
		return attributes;
	}

	public void setInfFile(String string, String path) {
		this.infFile = InfFileFactory.getFile(string);
		this.infFile.setFields(attributes);
		this.infFile.setFileName(getName());
		this.infFile.setPath(path);
		this.infFile.setEntity(this);
	}

	public InfAbstractFile getInfFile() {
		return infFile;
	}

	public void setAttributes(ArrayList<Attribute> attributes) {
		this.attributes = attributes;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public void setInfFile(InfAbstractFile infFile) {
		this.infFile = infFile;
	}

	public String getRelationName() {
		return relationName;
	}

	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

}
