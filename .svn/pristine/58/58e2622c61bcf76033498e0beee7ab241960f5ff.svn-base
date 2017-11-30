package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import org.omg.PortableServer.ServantRetentionPolicyValue;

import view.adminPanel.PromoteUserTabPanel;
import view.adminPanel.RegisterRequestTabPanel;

public class AdminDialog extends JDialog {
	private JTabbedPane tabPane = new JTabbedPane();
	private RegisterRequestTabPanel registerRequestTabPanel = new RegisterRequestTabPanel();
	private PromoteUserTabPanel promoteUserTabPanel = new PromoteUserTabPanel();

	public AdminDialog() {
		setModal(true);
		setTitle("Admin");
		setSize(400, 400);
		getContentPane().setLayout(new BorderLayout());
		tabPane.addTab("Register request", registerRequestTabPanel);
		tabPane.addTab("Promote user", promoteUserTabPanel);
		getContentPane().add(tabPane, BorderLayout.CENTER);
		registerRequestTabPanel.setBackground(Color.WHITE);
		promoteUserTabPanel.setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

	}
	/*
	public static void main(String[] args) {
		AdminDialog a = new AdminDialog();
		a.setVisible(true);
	}
 */
	public JTabbedPane getTabPane() {
		return tabPane;
	}

	public void setTabPane(JTabbedPane tabPane) {
		this.tabPane = tabPane;
	}

	public RegisterRequestTabPanel getRegisterRequestTabPanel() {
		return registerRequestTabPanel;
	}

	public void setRegisterRequestTabPanel(RegisterRequestTabPanel registerRequestTabPanel) {
		this.registerRequestTabPanel = registerRequestTabPanel;
	}

	public PromoteUserTabPanel getPromoteUserTabPanel() {
		return promoteUserTabPanel;
	}

	public void setPromoteUserTabPanel(PromoteUserTabPanel promoteUserTabPanel) {
		this.promoteUserTabPanel = promoteUserTabPanel;
	}

}
