package taskapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Task {
	private String name;
	private boolean completed;

	public Task(String name , boolean completed) {
		this.name = name;
		this.completed = completed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public boolean isValid() {
		return name != null && !name.trim().isEmpty();
	}
}

class User {
	private String username;
	private String email;

	public User(String username, String email) {
		this.username = username;
		this.email = email;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isValid() {
		return username != null && !username.trim().isEmpty() && email != null && !email.trim().isEmpty();
	}
}

interface TaskUserInterface {
	void displayAllTasks(List<Task> taskList);

	void displayAllUsers(List<User> userList);

	Task findTaskByName(String taskName);

	void deleteUser(User user);
}

public class TaskUser implements TaskUserInterface {
	private static List<Task> taskList = new ArrayList<>();
	private static List<User> userList = new ArrayList<>();

	public boolean addTask(Task task) {
		if (task.isValid()) {
			taskList.add(task);
			return true;
		}
		return false;
	}

	public boolean addUser(User user) {
		if (user.isValid()) {
			userList.add(user);
			return true;
		}
		return false;
	}

	public void displayAllTasks(List<Task> taskList) {
		for (Task task : taskList) {
			System.out.println(task.getName() + " - " + (task.isCompleted() ? "Completed" : "Incomplete"));
		}
	}

	public void displayAllUsers(List<User> userList) {
		for (User user : userList) {
			System.out.println(user.getUsername());
		}
	}

	public Task findTaskByName(String taskName) {
		for (Task task : taskList) {
			if (task.getName().equals(taskName)) {
				return task;
			}
		}
		return null;
	}

	public void deleteUser(User user) {
		Iterator<User> iterator = userList.iterator();
		while (iterator.hasNext()) {
			User currentUser = iterator.next();
			if (currentUser.getUsername() == user.getUsername()) {
				iterator.remove();
				System.out.println("User " + currentUser.getUsername() + " deleted successfully");
			}
		}
	}
	public static void main(String[] args) {
		
		int loop = 0;
		do {
			Scanner sc = new Scanner(System.in);
			TaskUser ob = new TaskUser();
			

			System.out.println("enter 1 to insert the task details ");
			System.out.println("enter 2 to display all the task  ");
			System.out.println("enter 3 to display all the users ");
			System.out.println("enter 4 to find Task By Name");
			System.out.println("enter 5 to delete any user from the userList ");
			System.out.println("enter anyother number to exit");
			int i = sc.nextInt();
			
			if (i == 1) {
				System.out.println("enter the task name: ");
				String name = sc.nextLine();
				System.out.println("enter the status 0/1: ");
				boolean status = sc.hasNext();
				Task t = new Task(name,status);
				ob.addTask(t);
				
				System.out.println("enter the user name: ");
				String user = sc.nextLine();
				System.out.println("enter email id: ");
				String email = sc.nextLine();
				User u = new User(user,email);
				ob.addUser(u);
				
				loop=0;
			}
			else if (i == 2) {
				ob.displayAllTasks(taskList);
			}
			else if (i == 3) {
				ob.displayAllUsers(userList);
			}
			else if (i == 4) {
				System.out.println("enter the user name: ");
				String username = sc.next();
				ob.findTaskByName(username);
			}
			else if (i == 5) {
				System.out.println("enter the user name: ");
				String username = sc.next();
				User u = new User(username,null);
				ob.deleteUser(u);
			}
			else {
				loop = 1;
			}
		} while (loop == 0);
	}
}
