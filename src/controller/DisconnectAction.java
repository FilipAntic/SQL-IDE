package controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class DisconnectAction extends AbstractInfAction {

	public DisconnectAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("/images/small/disconnectBase.png"));
		putValue(NAME, "disconnect");
		putValue(SHORT_DESCRIPTION, "disconnect");
		putValue(LARGE_ICON_KEY, loadIcon("/images/small/disconnectBase.png"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}

