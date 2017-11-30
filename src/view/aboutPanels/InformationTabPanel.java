package view.aboutPanels;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.WebsiteLinkMouseAdapter;
import net.miginfocom.swing.MigLayout;

public class InformationTabPanel extends JPanel {

	private JTextField nameTextField = new JTextField();
	private JTextField versionTextField = new JTextField();
	private JTextField authorTextField = new JTextField();
	private JTextArea emailTextArea = new JTextArea();
	private JLabel websiteLabelLink = new JLabel();
	private JLabel nameLabel = new JLabel("Name: ");
	private JLabel versionLabel = new JLabel("Version: ");
	private JLabel authorLabel = new JLabel("Author: ");
	private JLabel emailLabel = new JLabel("Email: ");
	private JLabel websiteLabel = new JLabel("Website: ");
	private JLabel infLabel = new JLabel();
	private ImageIcon img1;

	public InformationTabPanel() {
		MigLayout migLayout = new MigLayout(
				"",
				"10[]5[]10",
				"10[]5[]10"
				);
		setLayout(migLayout);
		nameTextField.setText("Infview");
		versionTextField.setText("1.0");
		authorTextField.setText("Tim 204.4");
		emailTextArea.setText("imijatovic16@raf.edu.rs\nfantic16@raf.edu.rs\nkmiric16@raf.edu.rs");
		websiteLabelLink.setText("https://student.ftn.uns.ac.rs/redmine/projects/tim-204-4?jump=welcome");
		websiteLabelLink.addMouseListener(new WebsiteLinkMouseAdapter());
		img1 = new ImageIcon("resources/images/developers/final.png");
		Image image1 = img1.getImage();
		Image newimg1 = image1.getScaledInstance(550, 250, Image.SCALE_SMOOTH);
		img1 = new ImageIcon(newimg1);
		infLabel.setIcon(img1);
		add(infLabel, "wrap");
		add(nameLabel, "split2");
		add(nameTextField,"wrap");
		add(versionLabel,"split2");
		add(versionTextField,"wrap");
		add(authorLabel,"split2");
		add(authorTextField,"wrap");
		add(emailLabel,"split2");
		add(emailTextArea,"wrap");
		add(websiteLabel,"split2");
		add(websiteLabelLink, "wrap");

		nameTextField.setPreferredSize(new Dimension(250, 24));
		nameTextField.setEditable(false);
		versionTextField.setPreferredSize(new Dimension(250, 24));
		versionTextField.setEditable(false);
		authorTextField.setPreferredSize(new Dimension(250, 24));
		authorTextField.setEditable(false);
		emailTextArea.setPreferredSize(new Dimension(250, 24));
		emailTextArea.setEditable(false);
		emailTextArea.setBackground(versionTextField.getBackground());
		emailTextArea.setBorder(versionTextField.getBorder());
		websiteLabelLink.setPreferredSize(new Dimension(250, 24));
//		websiteTextArea.setEditable(false);
		websiteLabelLink.setBackground(versionTextField.getBackground());
//		websiteTextArea.setBorder(versionTextField.getBorder());
	}

	public JLabel getAuthorLabel() {
		return authorLabel;
	}
	public JTextField getNameTextField() {
		return nameTextField;
	}

	public void setNameTextField(JTextField nameTextField) {
		this.nameTextField = nameTextField;
	}

	public JTextField getVersionTextField() {
		return versionTextField;
	}

	public void setVersionTextField(JTextField versionTextField) {
		this.versionTextField = versionTextField;
	}

	public JTextField getAuthorTextField() {
		return authorTextField;
	}

	public void setAuthorTextField(JTextField authorTextField) {
		this.authorTextField = authorTextField;
	}

	public JTextArea getEmailTextField() {
		return emailTextArea;
	}

	public void setEmailTextField(JTextArea emailTextField) {
		this.emailTextArea = emailTextField;
	}

	public JTextArea getEmailTextArea() {
		return emailTextArea;
	}

	public void setEmailTextArea(JTextArea emailTextArea) {
		this.emailTextArea = emailTextArea;
	}

	public JLabel getWebsiteTextArea() {
		return websiteLabelLink;
	}


}
