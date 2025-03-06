package Uge6;

import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hvilken måned er du født i");
        int måned = scanner.nextInt();
        System.out.println("Hvilken dag er du født i");
        int dato =scanner.nextInt();

        String Stjernetegn = "";

        if ((måned == 3 && dato >= 21) ||  (måned == 4 && dato <= 19)) {
            Stjernetegn = "Vædderen";
        } else if ((måned == 4 && dato >= 20) || (måned == 5 && dato <= 20)) {
            Stjernetegn = "Tyren";
        } else if ((måned == 5 && dato >= 21) ||  (måned == 6 && dato <= 20)) {
            Stjernetegn = "Tvillingerne";
        } else if ((måned == 6 && dato >= 21) ||  (måned == 7 && dato <= 22)) {
            Stjernetegn = "Krebsen";
        } else if ((måned == 7 && dato >= 23) || (måned == 8 && dato <= 22)) {
            Stjernetegn = "Løven";
        } else if ((måned == 8 && dato >= 23) || (måned == 9 && dato <= 22)) {
            Stjernetegn = "Jomfruen";
        } else if ((måned == 9 && dato >= 23) ||  (måned == 10 && dato <= 22)) {
            Stjernetegn = "Vægten";
        } else if ((måned == 10 && dato >= 23) || (måned == 11 && dato <= 21)) {
            Stjernetegn = "Skorpionen";
        } else if ((måned == 11 && dato >= 22) || (måned == 12 && dato <= 21)) {
            Stjernetegn = "Skytten";
        } else if ((måned == 12 && dato >= 22) || (måned == 1 && dato <= 19)) {
            Stjernetegn = "Stenbukken";
        } else if ((måned == 1 && dato >= 20) || (måned == 2 && dato <= 18)) {
            Stjernetegn = "Vandmanden";
        } else if ((måned == 2 && dato >= 19) || (måned == 3 && dato <= 20)) {
            Stjernetegn = "Fiskene"; {
            }
        }

        System.out.println(" dit stjernetegn" + Stjernetegn);


        scanner.close();


    }
}