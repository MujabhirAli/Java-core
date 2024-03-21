// Custom exception class
class InvalidUserNameException extends Exception {
    public InvalidUserNameException(String message) {
        super(message);
    }
}

// Example class using the custom exception
class User {
    private String userName;

    public User(String userName) throws InvalidUserNameException {
        if (userName == null || userName.trim().isEmpty()) {
            throw new InvalidUserNameException("Invalid user name provided: " + userName);
        }
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        try {
            User user1 = new User("Alice");
            System.out.println("User 1: " + user1.getUserName());

            // This will throw an InvalidUserNameException
            User user2 = new User("");
            System.out.println("User 2: " + user2.getUserName());
        } catch (InvalidUserNameException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

