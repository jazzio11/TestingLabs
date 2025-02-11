package controller;

import model.User;

import java.util.Vector;

public class UserController {
    private Vector<User> users;

    public UserController() {
        this.users = new Vector<>();
        loadUserData();
    }

    private void loadUserData() {
        users.add(new User("mike", "my_passwd", "Mike", "Smith", "07771234567"));
        users.add(new User("james.cameron@gmail.com", "angel", "James", "Cameron", "07777654321"));
        users.add(new User("julia.roberts@gmail.com", "change_me", "Julia", "Roberts", "07770123456"));
    }

    public Vector<User> getUsers() {
        return new Vector<>(users); // Return a copy to prevent modification from outside
    }

    public void printAllUsers() {
        System.out.println("There are: " + users.size() + " users in the system.");

        //Print headers
        System.out.println(String.format("%-25s| %-15s| %-15s| %-15s| %-15s",
                "Username", "Password", "First Name", "Last Name", "Mobile Number"));
        System.out.println("-------------------------------------------------------------------------------------------");

        //Print user details
        users.forEach(user -> System.out.println(user));
        System.out.println();
    }
}