package controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import app.MainFrame;
import view.ASUFDialog;
import view.InfToolBar;
import view.RightPanel;

public class FindAction extends AbstractInfAction {

	public FindAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("/images/find/view.png"));
		putValue(SHORT_DESCRIPTION, "Find");
		putValue(LARGE_ICON_KEY, loadIcon("/images/find/view.png"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MainFrame.getInstance().setAddOrSortDialog(new ASUFDialog());
		MainFrame.getInstance().getAddOrSortDialog().makeGUI(ASUFDialog.FIND);
		MainFrame.getInstance().getAddOrSortDialog().setVisible(true);
		MainFrame.getInstance().getCurrentRightPanel().getEntityContainer().getEntity().getInfFile().find(null);
		MainFrame.getInstance().getAddOrSortDialog().dispose();
	}
}

