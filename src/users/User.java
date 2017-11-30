package users;

import java.io.Serializable;

import app.MainFrame;

public class User implements Serializable{
	private String name;
	private String surname;
	private String email;
	private String username;
	private String password;
	private boolean canChange;
	private boolean canAddUsers;
	private boolean canAddAdmins;
	private boolean isUser;//da li je na listi cekanja za registraciju
	public User() {
		this.canChange = false;
		this.canAddUsers = false;
		this.canAddAdmins = false;
		this.isUser = false;
	}

	public User(String name, String surname, String email, String username, String password) {
		this.name = name.trim();
		this.surname = surname.trim();
		this.email = email.trim();
		this.username = username.trim();
		this.password = password.trim();
		this.canChange = false;
		this.canAddUsers = false;
		this.canAddAdmins = false;
		this.isUser = false;
	}

	public void showGUI() {
		if (canChange) {
			if (canAddUsers) {
				if(canAddAdmins){
					showHeadAdminGUI();
					return;
				}
				showAdminGUI();
				return;
			}
			showUserGui();
		} else{
			showGusetGUI();
		}
		
	}

	private void showUserGui() {
		MainFrame.getInstance().user();
		System.out.println("user");
	}

	private void showHeadAdminGUI() {
		MainFrame.getInstance().headAdmin();
		System.out.println("head");
	}

	private void showAdminGUI() {
		MainFrame.getInstance().admin();
		System.out.println("admin");
	}

	private void showGusetGUI() {
		MainFrame.getInstance().guest();
		System.out.println("guest");
	}

	public void improve() {
		if (canChange == false) {
			canChange = true;
		} else if (canAddUsers == false) {
			canAddUsers = true;
		} else {
			canAddAdmins = true;
		}
		MainFrame.getInstance().getUserManager().writeUsers();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isCanChange() {
		return canChange;
	}

	public void setCanChange(boolean canChange) {
		this.canChange = canChange;
	}

	public boolean isCanAddUsers() {
		return canAddUsers;
	}

	public void setCanAddUsers(boolean canAddUsers) {
		this.canAddUsers = canAddUsers;
	}

	public boolean isCanAddAdmins() {
		return canAddAdmins;
	}

	public void setCanAddAdmins(boolean canAddAdmins) {
		this.canAddAdmins = canAddAdmins;
	}
	
	public boolean isUser() {
		return isUser;
	}

	public void setIsUser(boolean isUser) {
		this.isUser = isUser;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", email=" + email + ", username=" + username
				+ ", password=" + password + "]";
	}

	
}
