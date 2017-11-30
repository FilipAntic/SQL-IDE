package controller;

import java.awt.event.ActionEvent;

import app.MainFrame;
import model.InfTableModel;
import view.RightPanel;

public class FetchPreviousBlockAction extends AbstractInfAction{

	public FetchPreviousBlockAction() {
		putValue(LARGE_ICON_KEY, loadIcon("/images/fetchArrows/upArrow.png"));
		putValue(SHORT_DESCRIPTION, "Fetch previous block");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		RightPanel rightPanel = MainFrame.getInstance().getCurrentRightPanel();
//		InfTableModel model = (InfTableModel) rightPanel.getEntityContainer().getTable().getModel();
//		model.fetchBack();
		rightPanel.getEntityContainer().getEntity().getInfFile().fetchBack();
	}

}
