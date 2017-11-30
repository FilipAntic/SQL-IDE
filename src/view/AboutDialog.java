package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import view.aboutPanels.DescriptionTabPanel;
import view.aboutPanels.InformationTabPanel;
import view.aboutPanels.ThanksToTabPanel;

public class AboutDialog extends JDialog {

	private JTabbedPane tabPane = new JTabbedPane();
	private DescriptionTabPanel descriptionTabPanel = new DescriptionTabPanel();
	private InformationTabPanel informationTabPanel = new InformationTabPanel();
	private ThanksToTabPanel thanksToTabPanel = new ThanksToTabPanel();

	public AboutDialog() {
		setModal(true);
		setTitle("About");
		setSize(600, 700);
		getContentPane().setLayout(new BorderLayout());
		tabPane.addTab("Description", descriptionTabPanel);
		tabPane.addTab("Information", informationTabPanel);
		tabPane.addTab("Thanks to", thanksToTabPanel);
		getContentPane().add(tabPane, BorderLayout.CENTER);
		//getContentPane().setBackground(Color.darkGray);
		descriptionTabPanel.setBackground(Color.WHITE);
		informationTabPanel.setBackground(Color.WHITE);
		thanksToTabPanel.setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

	}

	public DescriptionTabPanel getDescriptionTabPanel() {
		return descriptionTabPanel;
	}

	public InformationTabPanel getInformationTabPanel() {
		return informationTabPanel;
	}

	public ThanksToTabPanel getThanksToTabPanel() {
		return thanksToTabPanel;
	}

	public JTabbedPane getTabPane() {
		return tabPane;
	}

}
