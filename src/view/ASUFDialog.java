package view;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import app.MainFrame;
import controller.AddButtonAction;
import controller.ChangeBtnAction;
import controller.SortButtonAction;
import model.Attribute;
import model.Entity;
import net.miginfocom.swing.MigLayout;

public class ASUFDialog extends JDialog {

	public static final int ADD = 0;
	public static final int SORT = 1;
	public static final int UPDATE = 2;
	public static final int FIND = 3;
	
	private ArrayList<JCheckBox> checkBoxArrayList = new ArrayList<>();
	private ArrayList<JComboBox<String>> comboBoxArrayList = new ArrayList<>();
	private ArrayList<JTextField> textFieldArrayList = new ArrayList<>();
	private ArrayList<String> oldValue = new ArrayList<>();
	private String[] ascOrdesc = { "Ascending", "Descending" };
	private String[] value = {">","<","="};
	public ASUFDialog() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(500, 500);
	}

	public void makeGUI(int number) {
		JPanel panel = new JPanel();
		switch (number) {
		case ADD:
			panel = addPanel();
			setTitle("Add dialog");
			break;

		case SORT:
			panel = sortPanel();
			setTitle("Sort dialog");
			break;
		case UPDATE:
			panel = updatePanel();
			setTitle("Update dialog");
			break;
		case FIND:
			panel = findPanel();
			break;
		default:
			break;
		}
		add(panel);
		pack();
	}

	private JPanel findPanel() {
		checkBoxArrayList.clear();
		comboBoxArrayList.clear();
		textFieldArrayList.clear();
		Entity entity = MainFrame.getInstance().getCurrentRightPanel().getEntityContainer().getEntity();
		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout());
		int i = 0;
		for (Attribute a : entity.getAttributes()) {
			panel.add(new JLabel(a.getName()), "cell 0 " + i);
			
			JComboBox<String> comboBox = new JComboBox<>(value);
			comboBox.setSelectedIndex(0);
			panel.add(comboBox, "cell 1 " + i);
			comboBoxArrayList.add(comboBox);
			JTextField checkBox = new JTextField(20);
			panel.add(checkBox, "cell 2 " + i);
			textFieldArrayList.add(checkBox);
			

			i++;
		}
		JButton sortBtn = new JButton("Sort");
		sortBtn.addActionListener(new SortButtonAction());
		JButton cancel = new JButton("Cancel");
		panel.add(sortBtn, "cell 0 " + i);
		panel.add(cancel, "cell 1 " + i);
		return panel;
	}

	private JPanel sortPanel() {
		checkBoxArrayList.clear();
		comboBoxArrayList.clear();
		Entity entity = MainFrame.getInstance().getCurrentRightPanel().getEntityContainer().getEntity();
		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout());
		int i = 0;
		for (Attribute a : entity.getAttributes()) {
			panel.add(new JLabel(a.getName()), "cell 0 " + i);

			JCheckBox checkBox = new JCheckBox();
			panel.add(checkBox, "cell 1 " + i);

			if (a.isPrimaryKey()) {
				checkBox.setSelected(true);
			}
			checkBoxArrayList.add(checkBox);
			JComboBox<String> comboBox = new JComboBox<>(ascOrdesc);
			comboBox.setSelectedIndex(0);
			panel.add(comboBox, "cell 2 " + i);
			comboBoxArrayList.add(comboBox);

			i++;
		}
		JButton sortBtn = new JButton("Sort");
		sortBtn.addActionListener(new SortButtonAction());
		JButton cancel = new JButton("Cancel");
		panel.add(sortBtn, "cell 0 " + i);
		panel.add(cancel, "cell 1 " + i);
		return panel;
	}

	private JPanel addPanel() {
		textFieldArrayList.clear();
		Entity entity = MainFrame.getInstance().getCurrentRightPanel().getEntityContainer().getEntity();
		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout());
		int i = 0;
		for (Attribute a : entity.getAttributes()) {
			if (a.isPrimaryKey()) {
				panel.add(new JLabel(a.getName() + "*"), "cell 0 " + i);
			} else {
				panel.add(new JLabel(a.getName()), "cell 0 " + i);
			}

			JTextField textField = new JTextField(20);
			textField.setToolTipText(a.getType());
			panel.add(textField, "cell 1 " + i);
			textFieldArrayList.add(textField);
			i++;
		}
		JButton addBtn = new JButton("Add");
		addBtn.addActionListener(new AddButtonAction());
		JButton cancel = new JButton("Cancel");
		panel.add(addBtn, "cell 0 " + i);
		panel.add(cancel, "cell 1 " + i);
		return panel;
	}

	private JPanel updatePanel() {
		textFieldArrayList.clear();
		Entity entity = MainFrame.getInstance().getCurrentRightPanel().getEntityContainer().getEntity();
		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout());
		int i = 0;
		for (Attribute a : entity.getAttributes()) {
			if (a.isPrimaryKey()) {
				panel.add(new JLabel(a.getName() + "*"), "cell 0 " + i);
			} else {
				panel.add(new JLabel(a.getName()), "cell 0 " + i);
			}

			JTextField textField = new JTextField(20);
			textField.setToolTipText(a.getType());
			panel.add(textField, "cell 1 " + i);
			textFieldArrayList.add(textField);
			i++;
		}
		JButton updateBtn = new JButton("Update");
		updateBtn.addActionListener(new ChangeBtnAction());
		JButton cancel = new JButton("Cancel");
		panel.add(updateBtn, "cell 0 " + i);
		panel.add(cancel, "cell 1 " + i);
		return panel;
	}
	public void addTextFieldText(ArrayList<String> list){
		int i = 0;
		for(String s: list){
			textFieldArrayList.get(i).setText(s);
			i++;
		}
		oldValue = list;
	}

	public ArrayList<JTextField> getTextFieldArrayList() {
		return textFieldArrayList;
	}

	public ArrayList<JCheckBox> getCheckBoxArrayList() {
		return checkBoxArrayList;
	}

	public ArrayList<JComboBox<String>> getComboBoxArrayList() {
		return comboBoxArrayList;
	}
	
	public ArrayList<String> getOldValue() {
		return oldValue;
	}

}