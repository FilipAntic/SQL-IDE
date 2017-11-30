package view.adminPanel;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.PromoteAction;
import interfaces.Initialize;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PromoteUserTabPanel extends JPanel implements Initialize {
	private JRadioButton userRadioButton = new JRadioButton();
	private JRadioButton securityRadioButton = new JRadioButton();
	private JRadioButton oUserRadioButton = new JRadioButton();
	private JComboBox korisnici = new JComboBox();
	private JComboBox rang = new JComboBox();
	private JButton promoteButton = new JButton();

	public PromoteUserTabPanel() {
		initialize();
		setLayout(new MigLayout("", "[154.00,grow][108.00][162.00,grow]", "[88.00][85.00][103.00]"));
		
		userRadioButton.setText("User");
		userRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(userRadioButton, "cell 0 0,alignx right");

		securityRadioButton.setText("Security");
		securityRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(securityRadioButton, "cell 1 0,alignx center");

		oUserRadioButton.setText("Operating User");
		oUserRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(oUserRadioButton, "cell 2 0");

		korisnici = new JComboBox();
		korisnici.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(korisnici, "cell 0 1,growx");

		rang = new JComboBox();
		rang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(rang, "cell 2 1,growx");
		rang.addItem("User");
		rang.addItem("Security");
		rang.addItem("Operating User");

		promoteButton = new JButton("Promote");
		promoteButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(promoteButton, "cell 1 2,growx,aligny center");

		promoteButton.addActionListener(new PromoteAction());

		userRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (userRadioButton.isSelected()) {
					promoteButton.setEnabled(true);
				}
			}

		});

		securityRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (securityRadioButton.isSelected()) {
					promoteButton.setEnabled(true);
				}

			}
		});

		oUserRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (oUserRadioButton.isSelected()) {
					promoteButton.setEnabled(true);
				}

			}
		});
		ButtonGroup bg = new ButtonGroup();
		bg.add(userRadioButton);
		bg.add(securityRadioButton);
		bg.add(oUserRadioButton);

	}

	public JRadioButton getUserRadioButton() {
		return userRadioButton;
	}

	public void setUserRadioButton(JRadioButton userRadioButton) {
		this.userRadioButton = userRadioButton;
	}

	public JRadioButton getSecurityRadioButton() {
		return securityRadioButton;
	}

	public void setSecurityRadioButton(JRadioButton securityRadioButton) {
		this.securityRadioButton = securityRadioButton;
	}

	public JRadioButton getoUserRadioButton() {
		return oUserRadioButton;
	}

	public void setoUserRadioButton(JRadioButton oUserRadioButton) {
		this.oUserRadioButton = oUserRadioButton;
	}

	public JComboBox getKorisnici() {
		return korisnici;
	}

	public void setKorisnici(JComboBox korisnici) {
		this.korisnici = korisnici;
	}

	public JComboBox getRang() {
		return rang;
	}

	public void setRang(JComboBox rang) {
		this.rang = rang;
	}

	public JButton getPromoteButton() {
		return promoteButton;
	}

	public void setPromoteButton(JButton promoteButton) {
		this.promoteButton = promoteButton;
	}

	@Override
	public void initialize() {
		userRadioButton = new JRadioButton();
		securityRadioButton = new JRadioButton();
		oUserRadioButton = new JRadioButton();
		korisnici = new JComboBox();
		rang = new JComboBox();
		promoteButton = new JButton();

	}

	@Override
	public void addingOnComponent() {
		// TODO Auto-generated method stub

	}

}
