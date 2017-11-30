package users;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserManager {
	private ArrayList<User> users;
	private User currentUser;

	public UserManager() {

	}

	public void start() {
		try {
			readUsers();
			printUsers();
		} catch (Exception e) {
			this.users = new ArrayList<>();
			addNewUser("admin", "admin", "admin", "admin", "admin");
			writeUsers();
			System.out.println(currentUser);
		}
	}

	public void addNewUser(User user) {
		if (doesUserExists(user.getUsername())) {
			return;
		}
		users.add(user);
		writeUsers();
	}

	public void addNewUser(String name, String surname, String email, String username, String password) {
		if (doesUserExists(username)) {
			return;
		}
		User user = new User(name, surname, email, username, password);
		users.add(user);
		writeUsers();
	}

	public void writeUsers() {
		try {
			FileOutputStream fOut = new FileOutputStream("resources/otherFiles/users.ser");
			ObjectOutputStream oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(users);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readUsers() {
		try {
			FileInputStream fIn = new FileInputStream("resources/otherFiles/users.ser");
			ObjectInputStream oIn = new ObjectInputStream(fIn);
			users = (ArrayList<User>) oIn.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public User findUser(String username) {

		for (User user : users) {
			if (user.getUsername().equals(username.trim())) {
				return user;
			}
		}
		System.err.println("User ne postoji");
		return null;
	}

	public boolean doesUserExists(User user) {
		for (User user1 : users) {
			if (doesUserExists(user.getUsername())) {
				if (user1.getPassword().equals(user.getPassword())) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean doesUserExists(String username, String password) {
		for (User user1 : users) {
			if (doesUserExists(username.trim())) {
				if (user1.getPassword().equals(password.trim())) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean doesUserExists(String username) {
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				return true;
			}
		}
		return false;
	}

	public void printUsers() {
		for (User user : users) {
		}
	}

	public boolean checkData(User user) {
		if (doesUserExists(user)) {
			return true;
		}
		return false;
	}

	public boolean checkData(String username, String password) {
		if (doesUserExists(username, password)) {
			return true;
		}
		return false;
	}

	public void login(User user) {
		if (checkData(user)) {
			setCurrentUser(user);
		}
		System.err.println("Pogresni podaci");
	}

	public void login(String username, String password) {
		if (checkData(username.trim(), password.trim())) {
			setCurrentUser(findUser(username.trim()));
			findUser(username.trim()).showGUI();
			return;
		}
		System.err.println("Pogresni podaci");
	}

	public void register(String name, String surname, String email, String username, String password) {
		addNewUser(name, surname, email, username, password);
	}

	public void logout() {
		currentUser = null;
	}

	public ArrayList<User> registerList() {
		ArrayList<User> registerList = new ArrayList<>();
		for (User user : users) {
			if (!user.isUser()) {
				registerList.add(user);
			}
		}

		return registerList;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
}
