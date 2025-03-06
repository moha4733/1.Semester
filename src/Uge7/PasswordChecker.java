package Uge7;

import java.util.Scanner;

public class PasswordChecker {

    public static boolean isCharAlphaNumeric(char ch) {
        return ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'));
    }
    public static boolean isAlphaNumeric(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!isCharAlphaNumeric(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static boolean isSecurePassword(String password) {
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }
        if (password.equalsIgnoreCase("secret") || password.equalsIgnoreCase("qwerty")) {
            return false;
        }
        if (!isAlphaNumeric(password)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast dit password: ");
        String password = scanner.nextLine();

        if (isSecurePassword(password)) {
            System.out.println("Dit password er sikkert.");
        } else {
            System.out.println("Dit password er ikke sikkert.");
        }

        scanner.close();
    }
}


