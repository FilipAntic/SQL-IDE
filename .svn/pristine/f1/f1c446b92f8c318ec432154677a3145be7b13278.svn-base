package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import model.Entity;

public class RightPanel extends JPanel {

	private EntityContainer entityContainer;
	public RightPanel(InfTable infTable, Entity entity) {
		entityContainer = new EntityContainer(infTable, entity);
		setLayout(new BorderLayout());
		add(new InfToolBar(), BorderLayout.NORTH);
		add(entityContainer, BorderLayout.CENTER);
	}

	public EntityContainer getEntityContainer() {
		return entityContainer;
	}
	
	
}
