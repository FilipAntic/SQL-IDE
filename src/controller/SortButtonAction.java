package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import app.MainFrame;

public class SortButtonAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> string = new ArrayList<>();
		ArrayList<Integer> integer = new ArrayList<>();
		int i = 0;
		System.out.println(MainFrame.getInstance().getAddOrSortDialog().getComboBoxArrayList().isEmpty());
		System.out.println(MainFrame.getInstance().getAddOrSortDialog().getCheckBoxArrayList().isEmpty());
		for (JComboBox<String> c : MainFrame.getInstance().getAddOrSortDialog().getComboBoxArrayList()) {
			string.add((String) c.getSelectedItem());
			i++;
		}
		i = 0;
		for (JCheckBox c : MainFrame.getInstance().getAddOrSortDialog().getCheckBoxArrayList()) {
			if (c.isSelected()) {
				int j = 0;
				integer.add(i);
				j++;
			}
			i++;
		}
		MainFrame.getInstance().getCurrentRightPanel().getEntityContainer().getEntity().getInfFile().sort(string,
				integer);
		MainFrame.getInstance().getAddOrSortDialog().dispose();
	}

}
