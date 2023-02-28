package org.example;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * Entry point to new features.
 */
public class Main {
    //
    //Registration option ends in Registry.WriteJSON, I can't figure out how to bring it back here but want to leave a clear entry point.
    public static final String blue = "\u001B[34m";
    public static final String resetColor = "\u001B[0m";

    public static void firstSprintDemo() {
        Scanner scanny = new Scanner(System.in);
        System.out.println("1 demo login - 2 demo user registration - 3 demo Club Registration 4 exit");
        String answer = scanny.nextLine();
        if (Objects.equals(answer, "1")) {
            Login.login(Registry.userMap);
        } else if (Objects.equals(answer, "2")){
            Registry.registerUser();
        } else if (Objects.equals(answer, "4")) {
            System.out.println("Goodbye");
            System.exit(0);
        } else {
            firstSprintDemo();
        }
    }
    public static void registerClubDemo() throws IOException {

//        AdminUser testAdminUser = new UserFactory().buildAdminUser(testAdminUserData);
//        Map<String, UserData> clubEmployeData = new HashMap<>();
//        TestMenu testMenu = new TestMenu(dMap);
//        ItemFactory itemFactory = new ItemFactory();
//        TestClub testClub = new TestClub("club 5crum", testMenu, itemFactory, clubEmployeData, testAdminUser);
//        testClub.adminPortal();
    }
    public static void main(String[] args) throws IOException {
        firstSprintDemo();
    }
}
