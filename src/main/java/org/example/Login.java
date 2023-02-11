package org.example;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Login {
    public static void login() {
        //Scanner initialized
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = sc.nextLine(); //saves what's entered to username String variable
        System.out.print("Enter your password: ");
        String password = sc.nextLine(); //saves what's entered to String password variable

        //DummyUser array holding all the hard-coded users at this point, with roles assigned, and passwords
        DummyUser[] users = {
                new DummyUser("Bertram Gilfoyle", new DummyRole[]{DummyRole.PATRON, DummyRole.BARTENDER}, "12kldasjhgflkhkldfn"),
                new DummyUser("John Cena", new DummyRole[]{DummyRole.SECURITY}, "password"),
                new DummyUser("Maurice Moss", new DummyRole[]{DummyRole.ADMINISTRATOR}, "0118 999 881 999 119 725 3"),
                new DummyUser("Douglas Reynholm", new DummyRole[]{DummyRole.MANAGER}, "jen"),
                new DummyUser("Tiesto", new DummyRole[]{DummyRole.TALENT}, "whoami?diplo?")};

        try {
            //check if username or password is empty
            if (username.isEmpty() || password.isEmpty()) {
                //if either is empty, print message
                System.out.println("Username and password cannot be empty");
                return;
            }

            //try to authenticate the user with the given username and password
            DummyUser user = authenticate(username, password, users);
            //check if authentication was successful
            if (user != null) {
                //if it was successful, call the method to print the user's role
                printUserRole(user);
            } else {
                //if authentication failed, print error messages
                System.out.println("Invalid username or password. Please try again.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("No input found, please try again.");
        }
    }

    //Method to check login
    private static DummyUser authenticate(String username, String password, DummyUser[] users) {
        for (DummyUser user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals((password))) {
                return user;
            }
        }
        return null;
    }

    //Method to print the usernames, roles and operations associated with those roles or each user
    private static void printUserRole(DummyUser user) {
        System.out.println("RegSimUserData: " + user.getUsername()); //print the username
        for (DummyRole role : user.getRoles()) { //loop through all the roles of that user
            System.out.println("\t\tRole: " + role.getRoleName()); //print the role name
            for (ClubOperation operation : role.getOperations()) {  //loop through the operations associated with each role
                System.out.println("\t\t\tOperation: " + operation.name()); //print the operation name
            }
        }
    }
}
