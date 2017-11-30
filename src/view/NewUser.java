package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class NewUser extends JDialog {
	private JLabel nameLabel;
	private JLabel surnameLabel;
	private JLabel emailLabel;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JTextField nameTextField;
	private JTextField surnameTextField;
	private JTextField emailTextField;
	private JTextField usernameTextField;
	private JTextField passwordTextField;
	private JButton registerButton;
	JDialog mydialog;

	public NewUser() {

		setResizable(false);

		setTitle("Register");
		getContentPane().setLayout(null);
		nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(118, 63, 46, 14);
		getContentPane().add(nameLabel);

		surnameLabel = new JLabel("Surname: ");
		surnameLabel.setBounds(110, 113, 64, 14);
		getContentPane().add(surnameLabel);

		emailLabel = new JLabel("Email: ");
		emailLabel.setBounds(118, 169, 46, 14);
		getContentPane().add(emailLabel);

		usernameLabel = new JLabel("Username: ");
		usernameLabel.setBounds(118, 169, 46, 14);
		getContentPane().add(usernameLabel);
		
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(118, 169, 46, 14);
		getContentPane().add(passwordLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(174, 60, 107, 20);
		getContentPane().add(nameTextField);
		nameTextField.setColumns(10);

		surnameTextField = new JTextField();
		surnameTextField.setBounds(174, 110, 107, 20);
		getContentPane().add(surnameTextField);
		surnameTextField.setColumns(10);

		emailTextField = new JTextField();
		emailTextField.setBounds(174, 166, 107, 20);
		getContentPane().add(emailTextField);
		emailTextField.setColumns(10);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(174, 166, 107, 20);
		getContentPane().add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordTextField = new JTextField();
		passwordTextField.setBounds(174, 166, 107, 20);
		getContentPane().add(passwordTextField);
		passwordTextField.setColumns(10);
		
		registerButton = new JButton("Register now");
		registerButton.setBounds(128, 248, 135, 23);
		getContentPane().add(registerButton);
		
		
		setLocationRelativeTo(null);

	}

	public JLabel getNameLabel() {
		return nameLabel;
	}

	public void setNameLabel(JLabel nameLabel) {
		this.nameLabel = nameLabel;
	}

	public JLabel getSurnameLabel() {
		return surnameLabel;
	}

	public void setSurnameLabel(JLabel surnameLabel) {
		this.surnameLabel = surnameLabel;
	}

	public JLabel getEmailLabel() {
		return emailLabel;
	}

	public void setEmailLabel(JLabel emailLabel) {
		this.emailLabel = emailLabel;
	}

	public JTextField getNameTextField() {
		return nameTextField;
	}

	public void setNameTextField(JTextField nameTextField) {
		this.nameTextField = nameTextField;
	}

	public JTextField getSurnameTextField() {
		return surnameTextField;
	}

	public void setSurnameTextField(JTextField surnameTextField) {
		this.surnameTextField = surnameTextField;
	}

	public JTextField getEmailTextField() {
		return emailTextField;
	}

	public void setEmailTextField(JTextField emailTextField) {
		this.emailTextField = emailTextField;
	}

	public JButton getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(JButton registerButton) {
		this.registerButton = registerButton;
	}

	public JDialog getMydialog() {
		return mydialog;
	}

	public void setMydialog(JDialog mydialog) {
		this.mydialog = mydialog;
	}

}
