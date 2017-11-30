package controller;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import app.MainFrame;
import model.Storage;
import view.JsonViewerDialog;

public class CloseOperationWindowListener extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		Storage storage = new Storage();
		
		if(MainFrame.getInstance().getJ().isChanged()){
			 if (JOptionPane.showConfirmDialog(e.getWindow(), 
			            "Do you want to save meta schema?", "Saving Meta schema?", 
			            JOptionPane.YES_NO_OPTION,
			            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
			            SaveAction.saveInPath();
			            storage = SaveAction.readMetaSchema();
			    		MainFrame.getInstance().getInfHorizontalSplitPane().getLeftScrollPane().getInfTree().newRoot(storage);
			        }else{
			        	MainFrame.getInstance().getJ().getJsonTextArea().setCaretPosition(0);
			        	MainFrame.getInstance().getJ().getJsonTextArea().setText(JsonViewerDialog.jsonFromFile());
			        	MainFrame.getInstance().getJ().getJsonTextArea().revalidate();
			        	MainFrame.getInstance().getJ().getJsonTextArea().repaint();
			        }
		}
		super.windowClosing(e);
	}

	
}
