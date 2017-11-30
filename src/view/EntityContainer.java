package view;

import java.awt.Container;

import javax.swing.JScrollPane;

import model.Entity;
import model.InfTableModel;

public class EntityContainer extends JScrollPane {

	private Entity entity;
	private InfTable table;

	public EntityContainer(InfTable table, Entity entity) {
		super(table);
		this.entity = entity;
		this.table = table;
		this.entity.getInfFile().setModel((InfTableModel) this.table.getModel());
	}

	public void closeTab() {
		Container cont = getParent();
		cont.remove(this);
		cont.revalidate();
		cont.repaint();

	}

	public Entity getEntity() {
		return entity;
	}

	public InfTable getTable() {
		return table;
	}
	
}
