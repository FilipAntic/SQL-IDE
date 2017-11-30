package view;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import model.InfTableModel;

public class RightDownerPanel extends JTabbedPane {
	private JScrollPane scrollPane;
	InfTable infTable;
	private ArrayList<RightPanel> tableContainers;

	public RightDownerPanel() {
		tableContainers = new ArrayList<>();
	}

	public void addRelation(RightPanel rightPanel) {
		add(rightPanel.getEntityContainer().getEntity().getName(), rightPanel);
		tableContainers.add(rightPanel);
	}

	public ArrayList<RightPanel> getTableContainers() {
		return tableContainers;
	}

	public void setModel(InfTableModel infTableModel) {
		infTable = new InfTable();

		infTable.setModel(infTableModel);
		infTable.revalidate();
		infTable.repaint();
		scrollPane = new JScrollPane(infTable);
		add(scrollPane);
	}

	public InfTable getInfTable() {
		return infTable;
	}

}
