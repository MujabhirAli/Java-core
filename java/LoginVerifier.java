import java.io.Console;
public class LoginVerifier {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java LoginVerifier <mei> <ABC@123>");
            System.exit(1);
        }

        String validUsername = args[0];
        String validPassword = args[1];

        Console console = System.console();
        String enteredUsername = console.readLine("Enter username: ");
        char[] enteredPassword = console.readPassword("Enter password: ");

        while (!validUsername.equals(enteredUsername) || !validPassword.equals(new String(enteredPassword))) {
            System.out.println("Invalid credentials. Please try again.");
            enteredUsername = console.readLine("Enter username: ");
            enteredPassword = console.readPassword("Enter password: ");
        }

        System.out.println("Login successful!");
    }
}