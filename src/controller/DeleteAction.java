package controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import app.MainFrame;
import view.InfToolBar;
import view.RightPanel;

public class DeleteAction extends AbstractInfAction {

	public DeleteAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("/images/delete/delete.png"));
		putValue(SHORT_DESCRIPTION, "Delete");
		putValue(LARGE_ICON_KEY, loadIcon("/images/delete/delete.png"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		RightPanel rightPanel = ((RightPanel)((InfToolBar)e.getSource()).getParent());
		rightPanel.getEntityContainer().getEntity().getInfFile().delete();
	}
}
