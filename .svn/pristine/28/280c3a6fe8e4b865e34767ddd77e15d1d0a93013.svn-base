package view;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controller.CloseOperationWindowListener;
import controller.JsonValidatorDocumentListener;
import controller.SaveAction;
import model.MetaSchema;

public class JsonViewerDialog extends JDialog {

	private JTextArea jsonTextArea = new JTextArea(jsonFromFile(), 20, 20);
	private JButton saveButton = new JButton("Save");
	private JScrollPane scrollPane;
	private JsonValidatorDocumentListener validator = new JsonValidatorDocumentListener();
	private boolean changed = false;
	public JsonViewerDialog() {
		jsonTextArea.getDocument().addDocumentListener(validator);
		setSize(350, 350);
		saveButton.addActionListener(new SaveAction());
		setLayout(new BorderLayout());
		scrollPane = new JScrollPane(jsonTextArea);
		add(scrollPane, BorderLayout.CENTER);
		add(saveButton, BorderLayout.SOUTH);
		setLocationRelativeTo(null);
		setModal(true);
		addWindowListener(new CloseOperationWindowListener());
	}

	public JsonValidatorDocumentListener getValidator() {
		return validator;
	}

	public static String jsonFromFile() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(MetaSchema.path));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		String everything = "";
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return everything;
	}

	public JTextArea getJsonTextArea() {
		return jsonTextArea;
	}

	public JButton getSaveButton() {
		return saveButton;
	}
	
	public boolean isChanged() {
		return changed;
	}
	
	public void setChanged(boolean changed) {
		this.changed = changed;
	}
}
