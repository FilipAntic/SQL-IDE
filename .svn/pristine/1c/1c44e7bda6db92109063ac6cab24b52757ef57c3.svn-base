package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import app.MainFrame;

public class AddButtonAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> objects = new ArrayList<>();
		System.out.println(MainFrame.getInstance().getAddOrSortDialog().getTextFieldArrayList().size());
		for(JTextField tf: MainFrame.getInstance().getAddOrSortDialog().getTextFieldArrayList()){
				objects.add(tf.getText());
		}
		
		MainFrame.getInstance().getCurrentRightPanel().getEntityContainer().getEntity().getInfFile().add(objects);
		MainFrame.getInstance().getAddOrSortDialog().dispose();
	}

}
