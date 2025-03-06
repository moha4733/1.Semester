package Uge6;

import java.util.Scanner;
public class Lommeregner {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);



    // Udfør menuvalg for operationer
    // System.out.println("Vælg en operation:");
    System.out.println("1: Addition");
    System.out.println("2: Subtraktion");
    System.out.println("3: Multiplikation");
    System.out.println("4: Division");

    // Læs brugerens valg
    int valg = scanner.nextInt();

    // Læs to tal fra brugeren
    System.out.print("Indtast første tal: ");
    double tal1 = scanner.nextDouble();
    System.out.print("Indtast andet tal: ");
    double tal2 = scanner.nextDouble();

    double resultat = 0;
    boolean gyldigOperation = true;

    // Udfør operation baseret på brugerens valg
    switch (valg) {
        case 1:
            resultat = tal1 + tal2;
            System.out.println("Resultat af addition: " + resultat);
            break;
        case 2:
            resultat = tal1 - tal2;
            System.out.println("Resultat af subtraktion: " + resultat);
            break;
        case 3:
            resultat = tal1 * tal2;
            System.out.println("Resultat af multiplikation: " + resultat);
            break;
        case 4:
            // Håndter division og check for division med 0
            if (tal2 == 0) {
                System.out.println("Fejl: Division med 0 er ikke tilladt.");
                gyldigOperation = false;
            } else {
                resultat = tal1 / tal2;
                System.out.println("Resultat af division: " + resultat);
            }
            break;
        default:
            System.out.println("Ugyldigt valg. Vælg et tal mellem 1 og 4.");
            gyldigOperation = false;
            break;
    }

    // Hvis operationen var gyldig, vis resultatet
    if (gyldigOperation) {
        System.out.println("Resultatet er: " + resultat);
    }

    // Luk scanner
    scanner.close();

    }
}