package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import app.MainFrame;

public class ChangeBtnAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> objects = new ArrayList<>();
		for(JTextField tf: MainFrame.getInstance().getAddOrSortDialog().getTextFieldArrayList()){
				objects.add(tf.getText());
		}
		MainFrame.getInstance().getCurrentRightPanel().getEntityContainer().getEntity().getInfFile().update(objects);
		MainFrame.getInstance().getAddOrSortDialog().dispose();
	}

}
