package controller;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import app.MainFrame;
import interpreters.JSONTreeInterpreter;
import interpreters.TryingParser;

public class OpenFile extends AbstractInfAction {

	private JFileChooser jfc;
	private int returnValue;
	private File selectedFile;
	private FileNameExtensionFilter filter;

	public OpenFile() {
		putValue(NAME, "Open File");
		putValue(SHORT_DESCRIPTION, "Open File");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		filter = new FileNameExtensionFilter(".sek, .ind, .ser", "sek", "ser", "ind");
		jfc = new JFileChooser(MainFrame.getInstance().getStorageFile());
		jfc.setFileFilter(filter);
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		jfc.setDialogTitle("Please choose file");
		returnValue = jfc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			selectedFile = jfc.getSelectedFile();
			MainFrame.getInstance().setStorageFile(selectedFile.getParentFile().getParentFile());
			JSONTreeInterpreter.readFileStorage(selectedFile);
		}
		
	}

}
