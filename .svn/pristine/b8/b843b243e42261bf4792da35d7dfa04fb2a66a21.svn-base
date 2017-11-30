package controller;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import app.MainFrame;
import model.Entity;
import view.EntityContainer;
import view.RightPanel;

public class InfTreeSelectionListener implements TreeSelectionListener {

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		Object o = (Object) MainFrame.getInstance().getInfHorizontalSplitPane().getLeftScrollPane().getInfTree()
				.getLastSelectedPathComponent();

		if (o instanceof Entity) {
			Entity entity = (Entity) o;
			for (RightPanel ec : MainFrame.getInstance().getInfHorizontalSplitPane().getInfVerticalSplitPane()
					.getRightUpperPanel().getEntityContainers()) {
				if(ec.getEntityContainer().getEntity().equals(entity)){
					MainFrame.getInstance().setCurrentRightPanel(ec);
					MainFrame.getInstance().getInfHorizontalSplitPane().getInfVerticalSplitPane()
					.getRightUpperPanel().setSelectedComponent(ec);
				}
			}

		}
	}

}
