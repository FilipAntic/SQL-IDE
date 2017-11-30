package view;

import javax.swing.JTable;

import controller.InfRowFilter;
import model.InfTableModel;


public class InfTable extends JTable{
	
	public InfTable() {
		super(new InfTableModel());
		getSelectionModel().addListSelectionListener(new InfRowFilter());
	}
	

}
