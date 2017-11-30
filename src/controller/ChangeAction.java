package controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.KeyStroke;

import app.MainFrame;
import files.InfFile;
import view.ASUFDialog;
import view.InfToolBar;
import view.RightPanel;

public class ChangeAction extends AbstractInfAction {

	public ChangeAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("/images/change/pencil.png"));
		putValue(SHORT_DESCRIPTION, "Change");
		putValue(LARGE_ICON_KEY, loadIcon("/images/change/pencil.png"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(	);
		int selRow = MainFrame.getInstance().getCurrentRightPanel().getEntityContainer().getTable().getSelectedRow();
		if(selRow == -1){
			return;
		}
		ArrayList<String> strings = new ArrayList<>();
		for(int i = 0; i< MainFrame.getInstance().getCurrentRightPanel().getEntityContainer().getEntity().getAttributes().size();i++){
			strings.add(""+MainFrame.getInstance().getCurrentRightPanel().getEntityContainer().getEntity().getInfFile().getModel().getValueAt(selRow, i));
		}
		MainFrame.getInstance().setAddOrSortDialog(new ASUFDialog());
		MainFrame.getInstance().getAddOrSortDialog().makeGUI(ASUFDialog.UPDATE);
		MainFrame.getInstance().getAddOrSortDialog().addTextFieldText(strings);
		MainFrame.getInstance().getAddOrSortDialog().setVisible(true);
	}
	
	
}

