package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueUserCheckerUpdated {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("dummyUsername", "dummyEmail@example.com");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        if (!users.containsKey(username)) {
            System.out.println("Incorrect username.");
        } else if (!users.get(username).equals(email)) {
            System.out.println("Incorrect email address.");
        } else {
            System.out.println("Access granted!");
        }
    }
}