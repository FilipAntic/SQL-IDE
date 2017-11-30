
package view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import app.MainFrame;
import controller.FetchNextBlockAction;

public class InfToolBar extends JToolBar {

	private JButton changeFetchButton;
	private JTextField fetchAmountTextField;

	public InfToolBar() {
		initialize();
		setFloatable(false);
		add(MainFrame.getInstance().getActionsContainer().getAddAction());
		addSeparator();
		add(MainFrame.getInstance().getActionsContainer().getDeleteAction());
		addSeparator();
		add(MainFrame.getInstance().getActionsContainer().getFindAction());
		addSeparator();
		add(MainFrame.getInstance().getActionsContainer().getChangeAction());
		addSeparator();
		add(fetchAmountTextField);
		addSeparator();
		add(changeFetchButton);
		addSeparator();
		add(MainFrame.getInstance().getActionsContainer().getFetchNextBlockAction());
		addSeparator();
		add(MainFrame.getInstance().getActionsContainer().getFetchPreviousBlockAction());
		addSeparator();
		add(MainFrame.getInstance().getActionsContainer().getUpdateAction());
		addSeparator();
		add(MainFrame.getInstance().getActionsContainer().getSortAction());
	}

	private void initialize() {
		changeFetchButton = new JButton("Change fetch number");
		fetchAmountTextField = new JTextField("100");
		fetchAmountTextField.setMaximumSize(new Dimension(100, 26));
		fetchAmountTextField.setMinimumSize(new Dimension(100, 26));
	}

	public JButton getChangeFetchButton() {
		return changeFetchButton;
	}

	public JTextField getFetchAmountTextField() {
		return fetchAmountTextField;
	}

}
