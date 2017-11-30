package model;

import java.util.ArrayList;

public class InfPackage extends InfomationalResource {

	private ArrayList<Entity> entities;

	public InfPackage() {
		entities = new ArrayList<>();
	}

	public void addEntity(Entity entity){
		entities.add(entity);
		add(entity);
	}
	public ArrayList<Entity> getEntities() {
		return entities;
	}
	
	public Entity getEntityByName(String string){
		for(Entity e: entities){
			if(e.getName().equals(string)){
				return e;
			}
		}
		return null;
	}
}
