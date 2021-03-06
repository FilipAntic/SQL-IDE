package controller;

import java.awt.event.ActionEvent;

import app.MainFrame;
import model.InfTableModel;
import view.RightPanel;

public class FetchNextBlockAction extends AbstractInfAction {

	public FetchNextBlockAction() {
		putValue(LARGE_ICON_KEY, loadIcon("/images/fetchArrows/downArrow.png"));
		putValue(SHORT_DESCRIPTION, "Fetch next block");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		RightPanel rightPanel = MainFrame.getInstance().getCurrentRightPanel();
//		InfTableModel model = (InfTableModel) rightPanel.getEntityContainer().getTable().getModel();
//		model.fetchNext();
		rightPanel.getEntityContainer().getEntity().getInfFile().fetchNext();
	}

}
