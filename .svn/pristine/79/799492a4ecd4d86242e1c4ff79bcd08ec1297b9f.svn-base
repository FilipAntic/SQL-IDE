package controller;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.Map;

import app.MainFrame;

public class InfRegisterLabelMouseAdapter extends MouseAdapter {

	Font original;

	@Override
	public void mouseEntered(MouseEvent e) {
		MainFrame.getInstance().getLogin().getRegisterLabel().setForeground(Color.BLUE);
		original = e.getComponent().getFont();
		Map attributes = original.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		MainFrame.getInstance().getLogin().getRegisterLabel().setFont(original.deriveFont(attributes));
		MainFrame.getInstance().getLogin().getRegisterLabel().setCursor(new Cursor(Cursor.HAND_CURSOR));

		super.mouseEntered(e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		MainFrame.getInstance().getLogin().getRegisterLabel().setForeground(Color.BLACK);
		original = e.getComponent().getFont();
		Map attributes = original.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, -1);
		MainFrame.getInstance().getLogin().getRegisterLabel().setFont(original.deriveFont(attributes));
		MainFrame.getInstance().getLogin().getRegisterLabel().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		super.mouseExited(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		MainFrame.getInstance().getLogin().getMydialog().setSize(new Dimension(400, 350));
		MainFrame.getInstance().getLogin().getMydialog().setVisible(true);
		super.mouseReleased(e);
	}

}
