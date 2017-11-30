package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.management.InstanceAlreadyExistsException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.InfRegisterLabelMouseAdapter;
import controller.LoginActionListener;
import controller.LoginKeyAdapter;
import interfaces.Initialize;
import interpreters.JSONStringInterpreter;
import net.miginfocom.swing.MigLayout;

public class LogIn extends JDialog implements Initialize {
	private JButton loginButton;
	private JPanel loginpanel;
	private JTextField userTextField;
	private JTextField passwordTextField;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JLabel registerLabel;
	private NewUser mydialog;
	private MigLayout migLayout;
	private JLabel wrongPassword;

	public LogIn() {
		organizeFrame();
		initialize();
		boundsSetting();
		addingOnComponent();

	}

	@Override
	public void initialize() {
		loginButton = new JButton(JSONStringInterpreter.interprateString("login"));
		loginpanel = new JPanel();
		userTextField = new JTextField(10);
		passwordTextField = new JPasswordField(10);
		registerLabel = new JLabel(JSONStringInterpreter.interprateString("register"));
		usernameLabel = new JLabel(JSONStringInterpreter.interprateString("username"));
		passwordLabel = new JLabel(JSONStringInterpreter.interprateString("password"));
		wrongPassword = new JLabel("");
		mydialog = new NewUser();
		migLayout = new MigLayout("", "40[]10[]10[]20", "20[]10[]10[]10[]10[]");
	}

	@Override
	public void addingOnComponent() {
		loginpanel.setLayout(migLayout);
		loginpanel.add(usernameLabel, "cell 0 1");
		loginpanel.add(passwordLabel, "cell 0 2");
		loginpanel.add(userTextField, "cell 1 1");
		loginpanel.add(passwordTextField, "cell 1 2");
		loginpanel.add(loginButton, "cell 1 3");
		loginpanel.add(wrongPassword, "cell 2 3");
		loginpanel.add(registerLabel, "cell 1 4");

		getContentPane().add(loginpanel);
		loginButton.addActionListener(new LoginActionListener());
		registerLabel.addMouseListener(new InfRegisterLabelMouseAdapter());
	}

	public void organizeFrame() {
		setResizable(false);
		setTitle(JSONStringInterpreter.interprateString("login"));
		setSize(300, 224);
		setLocationRelativeTo(null);
	}

	public void boundsSetting() {
		userTextField.setBounds(70, 30, 100, 20);
		passwordTextField.setBounds(70, 65, 100, 20);
		loginButton.setBounds(98, 119, 98, 20);
		registerLabel.setBounds(108, 152, 98, 20);
		usernameLabel.setBounds(20, 28, 80, 20);
		passwordLabel.setBounds(20, 63, 80, 20);
		userTextField.addKeyListener(new LoginKeyAdapter());
		passwordTextField.addKeyListener(new LoginKeyAdapter());
	}

	public JLabel getRegisterLabel() {
		return registerLabel;
	}

	public void setRegisterLabel(JLabel registerLabel) {
		this.registerLabel = registerLabel;
	}

	public JButton getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(JButton loginButton) {
		this.loginButton = loginButton;
	}

	public JPanel getLoginpanel() {
		return loginpanel;
	}

	public void setLoginpanel(JPanel loginpanel) {
		this.loginpanel = loginpanel;
	}

	public JTextField getUserTextField() {
		return userTextField;
	}

	public void setUserTextField(JTextField userTextField) {
		this.userTextField = userTextField;
	}

	public JTextField getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(JTextField passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	public JLabel getUsernameLabel() {
		return usernameLabel;
	}

	public void setUsernameLabel(JLabel usernameLabel) {
		this.usernameLabel = usernameLabel;
	}

	public JLabel getPasswordLabel() {
		return passwordLabel;
	}

	public void setPasswordLabel(JLabel passwordLabel) {
		this.passwordLabel = passwordLabel;
	}

	public NewUser getMydialog() {
		return mydialog;
	}

	public void setMydialog(NewUser mydialog) {
		this.mydialog = mydialog;
	}

}