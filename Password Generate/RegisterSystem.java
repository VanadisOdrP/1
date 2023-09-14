import java.util.Scanner;

public class RegisterSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Registration System");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        RegisterInterface register = new RegisterFile();

        boolean registercheck = register.registerUser(username, password);

        if (!registercheck) {
            System.out.println("Registration failed.");
        }

        scanner.close();
    }
}

