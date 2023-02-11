/**
 * RegistrationSimulator is a brief demonstration on how the RegSimUserData objects are built from and stored using JSON
 * Author: Jeff Schowe
 */
package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class RegistrationSimulator {
    static Scanner scanner = new Scanner(System.in);
    public static void greetUser(Map uMap, ObjectMapper cMapper) {
        System.out.println("Would you like to login(1) or register(2)?");
        String input = scanner.nextLine();
        if (Objects.equals(input, "1")) {
            loginPortal(uMap, cMapper);
        }
        if (Objects.equals(input, "2")) {
            registerUser(uMap, cMapper);
        }
    }
    private static void registerUser(Map uMap, ObjectMapper cMapper) {

        System.out.println("Welcome to the DiskoTek Beta Registration!\nEnter your desired username: ");
        String desiredUsername = scanner.nextLine();
        try {
            if (uMap.get(desiredUsername) == null) {
                buildUser(desiredUsername, uMap, cMapper);
            }
            System.out.println("That username already exists, please try again");
            registerUser(uMap, cMapper);
        } catch (Exception e) {
            System.out.println("That username already exists, please try again");
            registerUser(uMap,cMapper);
        }
    }
    //TODO error checking, hash passwords/research JWT
    private static void buildUser(String uName, Map uMap, ObjectMapper cMapper) {
        /**
         *Handles all the input from new user and calls the instantiateUser method
         */
        RegSimUserData cRegSimUserData = new RegSimUserData();
        String finalPW = null;
        System.out.println("Enter password for " + uName);
        String pw1 = scanner.nextLine();
        System.out.println("Re-enter your password");
        String pw2 = scanner.nextLine();
        if (Objects.equals(pw1, pw2)) {finalPW = pw2;} else {buildUser(uName, uMap, cMapper);}
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your e-mail address: ");
        String userEmail = scanner.nextLine();
        System.out.println("Enter your Age");
        int age = scanner.nextInt();
        instantiateUser(uMap, cRegSimUserData, name, age, finalPW, uName, userEmail);
        System.exit(0);
        }
    private static void instantiateUser(Map uMap, RegSimUserData regSimUserDataToInstantiate, String n, int a, String p, String uname, String email) {
        /**
         * This actually builds the new user and calls Proto.addUserToMap()
         */
        regSimUserDataToInstantiate.userName = uname;
        regSimUserDataToInstantiate.password = p;
        regSimUserDataToInstantiate.isAdmin = false;
        regSimUserDataToInstantiate.name = n;
        regSimUserDataToInstantiate.age = a;
        regSimUserDataToInstantiate.email = email;
        Proto.addUserToMap(uMap, regSimUserDataToInstantiate);
    }
    //TODO build registry for da club I ran out of time figuring out JSON, but the rest should be less painful. I need to
    // encapsulate the logic from here and from Main to reuse the IO and object notation.
    private static void registerEstablishment() {
        System.out.println("This is where we will charge the business owner money and require them to prove they are who they say they are somehow.");
        System.out.println("For now though, this is unimplemented, but will work much the same way as the buildUser method in this class, unfortunately I ran out of time..");
    }
    //TODO Bug I can't seem to figure out, it runs through the cycle twice after registration.
    private static void loginPortal(Map uMap, ObjectMapper cMapper) {
        System.out.println("Enter your username");
        String userNameInput = scanner.nextLine();

        try {
            RegSimUserData regSimUserData = (RegSimUserData) uMap.get(userNameInput);
            System.out.print("enter your password: ");
            String passwordInput = scanner.nextLine();
                                                                //Program exits in this block after logging in. Further features will move this elsewhere.
            if (Objects.equals(passwordInput, regSimUserData.password)) {
                System.out.println("Welcome to DiskoTek, first round is on us! ***CLING***");
                System.out.println("debug RegSim.loginPortal -- write to file (yes): ");
                String write = scanner.nextLine();
                Proto.WriteJSON(cMapper,uMap);
            } else  {
                System.out.println("Invalid password or username not found.");
                //loginPortal(uMap, cMapper);
            }
        } catch (Exception e){

            System.out.println("RegSimUserData name not found, please try again.");
            loginPortal(uMap, cMapper);
        }
    }
}
