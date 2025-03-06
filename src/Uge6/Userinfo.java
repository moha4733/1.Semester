package Uge6;

import java.util.Scanner;
    public class Userinfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv dit Navn");
        String inputSentence = scanner.nextLine();


        System.out.println("Hvad er din yndlingsfarve");
        String Ynglingsfarve = scanner.next();


        System.out.println("Navn:"+ "" + inputSentence +" " + "Farve:" + " " + Ynglingsfarve);
        scanner.close();
    }
}
