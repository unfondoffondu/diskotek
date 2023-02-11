import java.util.HashMap;
import java.util.Scanner;

public class UniqueUserEmailChecker {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a username: ");
            String username = scanner.nextLine();

            if (username.equals("stop")) {
                break;
            }

            System.out.print("Enter an email address: ");
            String email = scanner.nextLine();

            if (users.containsKey(username)) {
                System.out.println("The username is already taken.");
            } else if (users.containsValue(email)) {
                System.out.println("The email address is already in use.");
            } else {
                users.put(username, email);
                System.out.println("The username and email address are unique.");
            }
        }
    }
}
