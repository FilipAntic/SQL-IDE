package controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import app.MainFrame;
import view.JsonViewerDialog;

public class OpenMetaSchemaAction extends AbstractInfAction{

	
	public OpenMetaSchemaAction() {
		putValue(NAME, "Open meta Schema");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		MainFrame.getInstance().getJ().getJsonTextArea().setCaretPosition(0);
		MainFrame.getInstance().getJ().setVisible(true);
	}

}
