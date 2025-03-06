package Uge6;

import java.util.Scanner;

    public class Iamhappy {
    public static void main(String[] args) {
    // Ved at skkrive scanner, udskriver jeg en besked til brugen
        Scanner scanner = new Scanner(System.in);
    // Her printer jeg
        System.out.println("I\uD83D\uDC4FAM\uD83D\uDC4FHAPPY\uD83D\uDC4FTODAY");
        System.out.println("Indtast en sætning:");
    //
        String inputSentence = scanner.nextLine();
        String modifiedSentence = inputSentence.replace(" ", "👏");
    //
        System.out.println("Den ændrede sætning: " + modifiedSentence);
    //
        scanner.close();
    }
}
