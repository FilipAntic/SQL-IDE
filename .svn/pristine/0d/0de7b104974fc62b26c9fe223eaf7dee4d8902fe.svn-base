package view.aboutPanels;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import net.miginfocom.swing.MigLayout;

public class DescriptionTabPanel extends JPanel {

	private JTextArea descriptionArea = new JTextArea();

	private ImageIcon img1;

	private JLabel infLabel = new JLabel();

	public DescriptionTabPanel() {
		MigLayout migLayout = new MigLayout(
				"",
				"10[]5[]10",
				"10[]5[]10"
				);
		setLayout(migLayout);
		img1 = new ImageIcon("resources/images/developers/final.png");
		descriptionArea.setText("Infview predstavlja programski alat koji bi obezbedio manipulaciju sa informacionim resursima\n koji su smešteni u heterogeno skladište podataka.");
		Image image1 = img1.getImage();
		Image newimg1 = image1.getScaledInstance(550, 250, Image.SCALE_SMOOTH);
		img1 = new ImageIcon(newimg1);
		infLabel.setIcon(img1);
		add(infLabel, "wrap");
		add(descriptionArea, "wrap");
		descriptionArea.setPreferredSize(new Dimension(250, 24));
		descriptionArea.setEditable(false);
	}

	public JTextArea getDescriptionArea() {
		return descriptionArea;
	}

	public void setDescriptionArea(JTextArea descriptionArea) {
		this.descriptionArea = descriptionArea;
	}
}
