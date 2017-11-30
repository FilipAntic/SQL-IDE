package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import app.MainFrame;

public class PromoteAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showConfirmDialog(null, "Are you sure?");
	}

}
