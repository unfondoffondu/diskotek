package org.example;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Entry point to new features.
 */
public class Main {
    //
    //Registration option ends in Registry.WriteJSON, I can't figure out how to bring it back here but want to leave a clear entry point.
    public static void firstSprintDemo() {
        Scanner scanny = new Scanner(System.in);
        System.out.println("1 demo login - 2 demo registration - 3 exit");
        String answer = scanny.nextLine();
        if (Objects.equals(answer, "1")) {
            Login.login(Registry.userMap);
        } else if (Objects.equals(answer, "2")){
            Registry.registerUser();
        } else if (Objects.equals(answer, "3")) {
            System.out.println("Goodbye");
            System.exit(0);
        } else {
            firstSprintDemo();
        }
    }
    public static void main(String[] args) throws IOException {
        firstSprintDemo();
    }
}
