package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ConnectButton;
import net.miginfocom.swing.MigLayout;

public class DataBaseConnection extends JDialog {

	private JLabel serverNameLabel;
	private JTextField serverNameTextField;
	private JLabel dataBaseNameLabel;
	private JTextField dataBaseNameTextField;
	private JLabel loginLabel;
	private JTextField loginTextField;
	private JLabel passwordLabel;
	private JTextField passwordTextField;
	private JButton connectButton;
	private JButton cancelButton;
	private JPanel centerPanel;

	public DataBaseConnection() {
		setDialog();
	}

	private void organizeDialog() {
		initialize();
		centerPanel.setLayout(new MigLayout("gap 20"));
		centerPanel.add(serverNameLabel, "cell 0 0");
		centerPanel.add(serverNameTextField, "cell 1 0");
		centerPanel.add(dataBaseNameLabel, "cell 0 1");
		centerPanel.add(dataBaseNameTextField, "cell 1 1");
		centerPanel.add(loginLabel, "cell 0 2");
		centerPanel.add(loginTextField, "cell 1 2");
		centerPanel.add(passwordLabel, "cell 0 3");
		centerPanel.add(passwordTextField, "cell 1 3");
		centerPanel.add(connectButton, "cell 0 4");
		centerPanel.add(cancelButton, "cell 1 4");
		add(centerPanel,BorderLayout.CENTER);

	}

	private void initialize() {
		serverNameLabel = new JLabel("Server name: ");
		serverNameTextField = new JTextField(20);
		dataBaseNameLabel = new JLabel("Data base name: ");
		dataBaseNameTextField = new JTextField(20);
		loginLabel = new JLabel("Login: ");
		loginTextField = new JTextField(20);
		passwordLabel = new JLabel("Password: ");
		passwordTextField = new JTextField(20);
		connectButton = new JButton("Connect");
		cancelButton = new JButton("Cancel");
		centerPanel = new JPanel();
		connectButton.addActionListener(new ConnectButton());
	}

	private void setDialog() {
		setModal(true);
		setSize(500, 500);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		organizeDialog();
		setTitle("Connect to database");
		pack();
	}

	public JLabel getServerNameLabel() {
		return serverNameLabel;
	}

	public JTextField getServerNameTextField() {
		return serverNameTextField;
	}

	public JLabel getDataBaseNameLabel() {
		return dataBaseNameLabel;
	}

	public JTextField getDataBaseNameTextField() {
		return dataBaseNameTextField;
	}

	public JLabel getLoginLabel() {
		return loginLabel;
	}

	public JTextField getLoginTextField() {
		return loginTextField;
	}

	public JLabel getPasswordLabel() {
		return passwordLabel;
	}

	public JTextField getPasswordTextField() {
		return passwordTextField;
	}

	public JButton getConnectButton() {
		return connectButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public JPanel getCenterPanel() {
		return centerPanel;
	}
	
	

}
