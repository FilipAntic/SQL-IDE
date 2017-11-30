package controller;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.net.URL;
import java.util.Map;

import app.MainFrame;

public class WebsiteLinkMouseAdapter extends MouseAdapter{

	Font original;

	@Override
	public void mouseEntered(MouseEvent e) {
		MainFrame.getInstance().getAboutFrame().getInformationTabPanel().getWebsiteTextArea().setForeground(Color.BLUE);
		original = e.getComponent().getFont();
		Map attributes = original.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		MainFrame.getInstance().getAboutFrame().getInformationTabPanel().getWebsiteTextArea().setFont(original.deriveFont(attributes));
		MainFrame.getInstance().getAboutFrame().getInformationTabPanel().getWebsiteTextArea().setCursor(new Cursor(Cursor.HAND_CURSOR));

		super.mouseEntered(e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		MainFrame.getInstance().getAboutFrame().getInformationTabPanel().getWebsiteTextArea().setForeground(MainFrame.getInstance().getAboutFrame().getInformationTabPanel().getAuthorLabel().getForeground());
		original = e.getComponent().getFont();
		Map attributes = original.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, -1);
		MainFrame.getInstance().getAboutFrame().getInformationTabPanel().getWebsiteTextArea().setFont(original.deriveFont(attributes));
		MainFrame.getInstance().getAboutFrame().getInformationTabPanel().getWebsiteTextArea().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		super.mouseExited(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		  try {
		        Desktop.getDesktop().browse(new URL("https://student.ftn.uns.ac.rs/redmine/projects/tim-204-4?jump=welcome").toURI());
		  } catch (Exception e2) {
		        e2.printStackTrace();
		    }
		super.mouseReleased(e);
	}
}
