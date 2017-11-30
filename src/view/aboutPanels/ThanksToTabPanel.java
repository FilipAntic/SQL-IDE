package view.aboutPanels;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class ThanksToTabPanel extends JPanel {

	private ImageIcon img1;
	private JLabel ivanaLabel = new JLabel();
	private JLabel about1Label = new JLabel("Ivana Mijatovic RM 60/2015");

	private ImageIcon img2;
	private JLabel filipLabel = new JLabel();
	private JLabel about2Label = new JLabel("Filip Antic RM 67/2015");

	private ImageIcon img3;
	private JLabel ketLabel = new JLabel();
	private JLabel about3Label = new JLabel("Katarina Miric RM 71/2015");

	public ThanksToTabPanel() {
		MigLayout migLayout = new MigLayout("align 50% 50%");
		setLayout(migLayout);

		img1 = new ImageIcon(getClass().getResource("/images/developers/Ivana.jpg"));
		Image image1 = img1.getImage();
		Image newimg1 = image1.getScaledInstance(175, 175, Image.SCALE_SMOOTH);
		img1 = new ImageIcon(newimg1);
		ivanaLabel.setIcon(img1);

		img2 = new ImageIcon(getClass().getResource("/images/developers/Filip.png"));
		Image image2 = img2.getImage();
		Image newimg2 = image2.getScaledInstance(175, 175, Image.SCALE_SMOOTH);
		img2 = new ImageIcon(newimg2);
		filipLabel.setIcon(img2);

		img3 = new ImageIcon(getClass().getResource("/images/developers/Ket.jpg"));
		Image image3 = img3.getImage();
		Image newimg3 = image3.getScaledInstance(175, 175, Image.SCALE_SMOOTH);
		img3 = new ImageIcon(newimg3);
		ketLabel.setIcon(img3);

		add(ivanaLabel, "wrap");
		add(about1Label, "wrap");
		add(filipLabel, "wrap");
		add(about2Label, "wrap");
		add(ketLabel, "wrap");
		add(about3Label);

	}
}
