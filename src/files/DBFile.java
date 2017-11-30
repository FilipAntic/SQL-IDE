package files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import app.MainFrame;
import interpreters.StringUtil;
import model.Attribute;

public class DBFile extends InfAbstractFile {

	

	@Override
	public int find(ArrayList<String> list) {
		String sql = "SELECT";
		int i = 0;
		for (Attribute a : getEntity().getAttributes()) {
			if (getEntity().getAttributes().size() - 1 == i) {
				sql += " " + StringUtil.normalToDBname(a.getName()) + " ";
			} else {
				sql += " " + StringUtil.normalToDBname(a.getName()) + ",";
			}
			i++;
		}
		sql += "FROM " + StringUtil.normalToDBname(getEntity().getName());
		sql+=" WHERE POREZ_NA_DOBIT > 10";
		Statement statement = null;
		try {

			statement = MainFrame.getInstance().getConn().createStatement();
			getModel().removeAll();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Object[] object = new Object[getEntity().getAttributes().size()];
				int k = 0;
				for (Attribute a : getEntity().getAttributes()) {
					switch (a.getType().toUpperCase()) {
					case "INTEGER":
						Integer intFromBase = result.getInt(StringUtil.normalToDBname(a.getName()));
						object[k] = intFromBase;
						break;
					case "VARCHAR" :
						String stringFromBase = result.getString(StringUtil.normalToDBname(a.getName()));
						object[k] = stringFromBase;
						break;
					case "BOOLEAN":
						Boolean booleanFromBase = result.getBoolean(StringUtil.normalToDBname(a.getName()));
						object[k] = booleanFromBase;
						break;
					case "DATE":
						Date dateFromBase = result.getDate(StringUtil.normalToDBname(a.getName()));
						object[k] = dateFromBase;
						break;
					}
					k++;
				}
//				getModel().removeAll();
				getModel().addRow(object);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}catch(NullPointerException e1){
			try {
				Class.forName("net.sourceforge.jtds.jdbc.Driver");
			} catch (ClassNotFoundException e13) {
				e1.printStackTrace();
			}
			String url = "jdbc:jtds:sqlserver://" + "147.91.175.155" + "/" + "ui-2016-tim204.4";

			try {
				Connection conn = DriverManager.getConnection(url, "ui-2016-tim204.4", "ui-2016-tim204.4.SwK930");
				MainFrame.getInstance().setDataBaseMetaData(conn.getMetaData());
				MainFrame.getInstance().setConn(conn);
			} catch (SQLException e12) {
				e1.printStackTrace();
			}
		}
		
		return 1;
	}

	@Override
	public void add() {

	}

	@Override
	public void change() {

	}

	@Override
	public void delete() {

	}

	@Override
	public void fetchNext() {
		String sql = "SELECT";
		int i = 0;
		for (Attribute a : getEntity().getAttributes()) {
			if (getEntity().getAttributes().size() - 1 == i) {
				sql += " " + StringUtil.normalToDBname(a.getName()) + " ";
			} else {
				sql += " " + StringUtil.normalToDBname(a.getName()) + ",";
			}
			i++;
		}
		sql += "FROM " + StringUtil.normalToDBname(getEntity().getName());
		
		Statement statement = null;
		try {

			statement = MainFrame.getInstance().getConn().createStatement();
			getModel().removeAll();
			String sql1 = "SELECT TOP 1 MAGACIN_ID , STANJE_PROIZVODA , DATUM FROM Mesecno_stanje WHERE Mesecno_stanje.DATUM < DATEADD(day,30,2017-02-15) GROUP BY MAGACIN_ID";
			ResultSet result = statement.executeQuery(sql1);
			while (result.next()) {
				Object[] object = new Object[getEntity().getAttributes().size()];
				int k = 0;
				for (Attribute a : getEntity().getAttributes()) {
					switch (a.getType().toUpperCase()) {
					case "INTEGER":
						Integer intFromBase = result.getInt(StringUtil.normalToDBname(a.getName()));
						object[k] = intFromBase;
						break;
					case "VARCHAR" :
						String stringFromBase = result.getString(StringUtil.normalToDBname(a.getName()));
						object[k] = stringFromBase;
						break;
					case "BOOLEAN":
						Boolean booleanFromBase = result.getBoolean(StringUtil.normalToDBname(a.getName()));
						object[k] = booleanFromBase;
						break;
					case "DATE":
						Date dateFromBase = result.getDate(StringUtil.normalToDBname(a.getName()));
						object[k] = dateFromBase;
						break;
					}
					k++;
				}
				
				getModel().addRow(object);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}catch(NullPointerException e1){
			try {
				Class.forName("net.sourceforge.jtds.jdbc.Driver");
			} catch (ClassNotFoundException e13) {
				e1.printStackTrace();
			}
			String url = "jdbc:jtds:sqlserver://" + "147.91.175.155" + "/" + "ui-2016-tim204.4";

			try {
				Connection conn = DriverManager.getConnection(url, "ui-2016-tim204.4", "ui-2016-tim204.4.SwK930");
				MainFrame.getInstance().setDataBaseMetaData(conn.getMetaData());
				MainFrame.getInstance().setConn(conn);
			} catch (SQLException e12) {
				e1.printStackTrace();
			}
		}
		
	}

	@Override
	public void sort(ArrayList<String> string, ArrayList<Integer> integer) {

		String sql = "SELECT";
		int i = 0;
		for (Attribute a : getEntity().getAttributes()) {
			if (getEntity().getAttributes().size() - 1 == i) {
				sql += " " + StringUtil.normalToDBname(a.getName()) + " ";
			} else {
				sql += " " + StringUtil.normalToDBname(a.getName()) + ",";
			}
			i++;
		}

		sql += "FROM " + StringUtil.normalToDBname(getEntity().getName()) + " ORDER BY";
		for (int j = 0; j < integer.size(); j++) {
			if ((integer.size() - 1) == j) {
				sql += " " + StringUtil.normalToDBname(getEntity().getAttributes().get(integer.get(j)).getName()) + " "
						+ StringUtil.ascOrDesc(string.get(integer.get(j)));
			} else {
				sql += " " + StringUtil.normalToDBname(getEntity().getAttributes().get(integer.get(j)).getName()) + " "
						+ StringUtil.ascOrDesc(string.get(integer.get(j))) + ",";
			}

		}
		System.out.println(sql);
		Statement statement = null;
		try {

			statement = MainFrame.getInstance().getConn().createStatement();
			getModel().removeAll();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Object[] object = new Object[getEntity().getAttributes().size()];
				int k = 0;
				for (Attribute a : getEntity().getAttributes()) {
					switch (a.getType().toUpperCase()) {
					case "INTEGER":
						Integer intFromBase = result.getInt(StringUtil.normalToDBname(a.getName()));
						object[k] = intFromBase;
						break;
					case "VARCHAR" :
						String stringFromBase = result.getString(StringUtil.normalToDBname(a.getName()));
						object[k] = stringFromBase;
						break;
					case "BOOLEAN":
						Boolean booleanFromBase = result.getBoolean(StringUtil.normalToDBname(a.getName()));
						object[k] = booleanFromBase;
						break;
					case "DATE":
						Date dateFromBase = result.getDate(StringUtil.normalToDBname(a.getName()));
						object[k] = dateFromBase;
						break;
					}
					k++;
				}
				
				getModel().addRow(object);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(sql);
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(ArrayList<String> objects) {
		String sql = "INSERT INTO " + StringUtil.normalToDBname(getEntity().getName())+"(";
		int i = 0;
		for (Attribute a : getEntity().getAttributes()) {
			if (getEntity().getAttributes().size() - 1 == i) {
				sql += StringUtil.normalToDBname(a.getName()) + ") ";
			} else {
				sql += StringUtil.normalToDBname(a.getName()) + ", ";
			}
			i++;
		}
		
		sql+="VALUES(";
		i = 0;
		for (Attribute a : getEntity().getAttributes()) {
			if (getEntity().getAttributes().size() - 1 == i) {
				sql += "?" + ")";
			} else {
				sql += "?" + ", ";
			}
			i++;
		}
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = MainFrame.getInstance().getConn().prepareStatement(sql);
			System.out.println(objects.isEmpty());
			int k = 0;
			for (Attribute a : getEntity().getAttributes()) {
				switch (a.getType().toUpperCase()) {
				case "INTEGER":
					prepareStatement.setInt(k+1, Integer.parseInt(objects.get(k)));
					break;
				case "VARCHAR" :
					prepareStatement.setString(k+1, objects.get(k));
					break;
				case "BOOLEAN":
					prepareStatement.setBoolean(k+1, Boolean.parseBoolean(objects.get(k)));
					break;
				case "DATE":
					prepareStatement.setDate(k+1, new java.sql.Date(k) );
					break;
				}
				k++;
			}
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, "Izgleda da podatak sa tim kljucem vec postoji");
		}
		
	}

	@Override
	public void update(ArrayList<String> objects) {
		String sql = "UPDATE  " + StringUtil.normalToDBname(getEntity().getName())+" SET ";
		int i = 0;
		for (Attribute a : getEntity().getAttributes()) {
			if (getEntity().getAttributes().size() - 1 == i) {
				sql += StringUtil.normalToDBname(a.getName()) + " = ? ";
			} else {
				sql += StringUtil.normalToDBname(a.getName()) + " = ?, ";
			}
			i++;
		}
		
		sql += "WHERE ";
		i=0;
		for (Attribute a : getEntity().getAttributes()) {
			if (getEntity().getAttributes().size() - 1 == i) {
				sql += StringUtil.normalToDBname(a.getName()) + " = ? ";
			} else {
				sql += StringUtil.normalToDBname(a.getName()) + " = ?, ";
			}
			i++;
		}
		System.out.println(sql);
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = MainFrame.getInstance().getConn().prepareStatement(sql);
			System.out.println(objects.isEmpty());
			int k = 0;
			for (Attribute a : getEntity().getAttributes()) {
				switch (a.getType().toUpperCase()) {
				case "INTEGER":
					prepareStatement.setInt(k+1, Integer.parseInt(objects.get(k)));
					break;
				case "VARCHAR" :
					prepareStatement.setString(k+1, objects.get(k));
					break;
				case "BOOLEAN":
					prepareStatement.setBoolean(k+1, Boolean.parseBoolean(objects.get(k)));
					break;
				case "DATE":
					prepareStatement.setDate(k+1, new java.sql.Date(k) );
					break;
				}
				k++;
				
				
			}
			
			int j = 0;
			
			for (Attribute a : getEntity().getAttributes()) {
				switch (a.getType().toUpperCase()) {
				case "INTEGER":
					prepareStatement.setInt(k+1, Integer.parseInt(MainFrame.getInstance().getAddOrSortDialog().getOldValue().get(j)));
					break;
				case "VARCHAR" :
					prepareStatement.setString(k+1, MainFrame.getInstance().getAddOrSortDialog().getOldValue().get(j));
					break;
				case "BOOLEAN":
					prepareStatement.setBoolean(k+1, Boolean.parseBoolean(MainFrame.getInstance().getAddOrSortDialog().getOldValue().get(j)));
					break;
				case "DATE":
					prepareStatement.setDate(k+1, new java.sql.Date(k) );
					break;
				}
				k++;
				j++;
				
			}
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
//			JOptionPane.showMessageDialog(null, "Izgleda da podatak sa tim kljucem vec postoji");
			e.printStackTrace();
		}
	}

	@Override
	public void update() {
		fetchNext();
		
	}



}
