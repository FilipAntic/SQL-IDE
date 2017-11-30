package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import app.MainFrame;

public class InfTableModel extends DefaultTableModel {
	private Entity entity;

	public InfTableModel() {

		Object object = MainFrame.getInstance().getInfHorizontalSplitPane().getLeftScrollPane().getInfTree()
				.getLastSelectedPathComponent();

		entity = (Entity) object;
		setDataVector(null, arrayOfAttributes(entity.getAttributes()));
		// fetchNext();
	}

	public Object[][] matrixOfNothing2() {
		Object[][] objects = { { "" } };
		return objects;
	}

	public Object[][] matrixOfNothing() {
		Object[][] objects = { { "aa" }, { "bb" }, { "cc" }, { "dd" }, { "ee" }, { "ff" } };
		return objects;
	}

	public Object[][] matrixOfNothingProba() throws IOException {
		Object[][] objects = new Object[7838][5];
		BufferedReader br = new BufferedReader(new FileReader(new File("resources/metaSchema/n.txt")));
		String line = "";
		for (int j = 0; j < 7838; j++) {
			line = br.readLine();
			objects[j][0] = line.substring(0, 1);
			objects[j][1] = line.substring(2, 6);
			objects[j][2] = line.substring(7, 86);
			objects[j][3] = line.substring(87, 88);
			objects[j][4] = line.substring(89, 91);

		}

		return objects;
	}

	public Object[] arrayOfAttributes(ArrayList<Attribute> attributes) {
		Object[] objects = attributes.toArray(new Object[attributes.size()]);
		return objects;
	}
	
	public void removeAll(){
		Entity entity = MainFrame.getInstance().getCurrentRightPanel().getEntityContainer().getEntity();
		setDataVector(null, arrayOfAttributes(entity.getAttributes()));
	}

}
