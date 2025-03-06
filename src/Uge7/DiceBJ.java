package Uge7;

import java.util.Scanner;
import java.util.Random;

public class DiceBJ {
    static Random random = new Random();
    public static int rollDice () {
        return random.nextInt(6) + 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String velkomstBesked = "Velkommen til BlackJack Dice Game";
        System.out.println(velkomstBesked);

        int spillerSum = rollDice() + rollDice();
        System.out.println("Du Har " + spillerSum);

        while (spillerSum < 21) {
            System.out.println("Vil du kast igen? (ja eller nej)");
            String spillernsValg = scanner.nextLine();

            if ("ja".equalsIgnoreCase(spillernsValg)) {
                int newRoll = rollDice() + rollDice();
                spillerSum += newRoll;
                System.out.println("Du slog " + newRoll + " og er op på " + spillerSum);
            } else if ("nej".equalsIgnoreCase(spillernsValg)) {
                System.out.println("Du valgte at stoppe på: " + spillerSum);
                break;
            } else {
                System.out.println("Forkert indtast. Kun 'ja' og 'nej' accepteres.");
            }
        }

        if (spillerSum == 21) {
            System.out.println("Tillykke! Du har Blackjack! Du har præcis 21!");
        } else if (spillerSum > 21) {
            System.out.println("Du tabte! Din sum blev over 21.");
        } else {
            maskinensTur(spillerSum);
        }
        System.out.println("Tak for spillet!");

    }

    private static void maskinensTur(int spillerSum) {
        int maskinensSum = rollDice() + rollDice();
        System.out.println("Maskinen start sum: " + maskinensSum);

        while (maskinensSum <= 16) {
            int newRoll = rollDice() + rollDice();
            maskinensSum += newRoll;
            System.out.println("Maskinen fik " + newRoll + " og er på " + maskinensSum);
        }

        if (maskinensSum > 21) {
            System.out.println("Tillykke! Du har vundet!");
        } else if (maskinensSum < spillerSum) {
            System.out.println("Tillykke! Du har vundet!");
        } else {
            System.out.println("Maskinen har vundet!");
        }

    }
}