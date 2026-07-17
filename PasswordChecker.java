// 88.	Password checker. 

import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";
        String password;

        do {
            System.out.print("Enter Password: ");
            password = sc.nextLine();

            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect Password! Try Again.\n");
            }

        } while (!password.equals(correctPassword));

        System.out.println("Login Successful!");

        sc.close();
    }
}