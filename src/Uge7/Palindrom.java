package Uge7;

import java.util.Scanner;


// 2. Programmet skal fjerne store bogstaver og mellemrum, så fx "A Santa at NASA" også genkendes som et palindrom
// 3. Programmet skal bruge en metode isPalindrome(String input),der returnerer trueeller false.
// 4. Udskriv en passende besked til brugeren baseret på resultatet.


public class Palindrom {

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase().replaceAll("\\s", "");
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
        reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Indtast en streng: ");
            String userInput = scanner.nextLine();

            if (isPalindrome(userInput)) {
                System.out.println("Teksten er et palindrome!");
            } else {
                System.out.println("Teksten er ikke et palindrome.");
            }

            scanner.close();
        }
    }
