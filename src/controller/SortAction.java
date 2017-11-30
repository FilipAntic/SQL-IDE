package controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import app.MainFrame;
import view.ASUFDialog;

public class SortAction extends AbstractInfAction {

	public SortAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("/images/small/sort.png"));
		putValue(NAME, "sort");
		putValue(SHORT_DESCRIPTION, "Sort");
		putValue(LARGE_ICON_KEY, loadIcon("/images/small/sort.png"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MainFrame.getInstance().setAddOrSortDialog(new ASUFDialog());
		MainFrame.getInstance().getAddOrSortDialog().makeGUI(ASUFDialog.SORT);
		MainFrame.getInstance().getAddOrSortDialog().setVisible(true);
	}
}
