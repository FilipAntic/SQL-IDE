package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import app.Main;
import app.MainFrame;

public class ConnectButton implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		String url = "jdbc:jtds:sqlserver://" + "147.91.175.155" + "/" + "ui-2016-tim204.4";

		try {
			Connection conn = DriverManager.getConnection(url, "ui-2016-tim204.4", "ui-2016-tim204.4.SwK930");
			MainFrame.getInstance().setDataBaseMetaData(conn.getMetaData());
			MainFrame.getInstance().setConn(conn);
			String sql = "INSERT INTO SKLADISTE(SK_OZNAKA,SK_VELICINA2,SK_ADRESA2,SK_KAPACITET2) VALUES(?,?,?,?)";
			
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setString(1, "PRA");
//			ps.setInt(2, 2);
//			ps.setString(3, "ssadsadad");
//			ps.setBoolean(4, true);
//			ps.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		MainFrame.getInstance().getDataBaseConnection().dispose();
	}

}
