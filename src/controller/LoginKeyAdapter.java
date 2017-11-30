package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

import app.MainFrame;

public class LoginKeyAdapter extends KeyAdapter {

	private JTextField userTextField;

	@Override
	public void keyReleased(KeyEvent e) {
		userTextField = (JTextField) e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			MainFrame.getInstance().getUserManager().login(
					MainFrame.getInstance().getLogin().getUserTextField().getText(),
					MainFrame.getInstance().getLogin().getPasswordTextField().getText());

		}

		super.keyReleased(e);
	}

}
