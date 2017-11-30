package controller;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import app.MainFrame;
import view.RightUpperTabbedPane;

public class EntityChangeListener implements ChangeListener {

	@Override
	public void stateChanged(ChangeEvent e) {
		RightUpperTabbedPane tabbedPane = (RightUpperTabbedPane) e.getSource();
		MainFrame.getInstance().setCurrentRightPanel(tabbedPane.getSelectedPanel());
	}

}
