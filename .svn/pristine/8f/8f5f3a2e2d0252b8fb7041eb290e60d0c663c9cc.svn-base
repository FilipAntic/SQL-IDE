package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import app.MainFrame;
import interpreters.JSONStringInterpreter;


public class InfMenu extends JMenuBar {

	private JMenu fileMenu;
	private JMenu helpMenu;

	public InfMenu() {
		initialize();
		addingOnMenu();
	}

	public void initialize() {

		fileMenu = new JMenu(JSONStringInterpreter.interprateString("file"));
		helpMenu = new JMenu(JSONStringInterpreter.interprateString("help"));
	}

	public void addingOnMenu() {
		fileMenu.add(MainFrame.getInstance().getActionsContainer().getOpenFile());
		fileMenu.add(MainFrame.getInstance().getActionsContainer().getConnectAction());
		fileMenu.addSeparator();
		fileMenu.add(MainFrame.getInstance().getActionsContainer().getDisconnectAction());
		fileMenu.addSeparator();
		fileMenu.add(MainFrame.getInstance().getActionsContainer().getSwitchAction());
		fileMenu.add(MainFrame.getInstance().getActionsContainer().getOpenMetaSchemaAction());
		helpMenu.add(MainFrame.getInstance().getActionsContainer().getAboutInfAction());
		
		add(fileMenu);
		add(helpMenu);

	}

	public JMenu getFileMenu() {
		return fileMenu;
	}

	public JMenu getHelpMenu() {
		return helpMenu;
	}

}