package controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import app.MainFrame;

public class ConnectAction extends AbstractInfAction {

	public ConnectAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("/images/small/connectBase.png"));
		putValue(NAME, "connect");
		putValue(SHORT_DESCRIPTION, "connect");
		putValue(LARGE_ICON_KEY, loadIcon("/images/small/connectBase.png"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MainFrame.getInstance().getDataBaseConnection().setVisible(true);

	}
}
