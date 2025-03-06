package Uge6;

import java.util.Scanner;
        public class Tommebergener {
        public static void main(String[] args) {

                final double Tommer_til_centemeter = 2.54;
                Scanner scanner = new Scanner(System.in);

        System.out.println("TommeBegregner til centemeter:");
        System.out.println("Indsæt længde i tommer");

        double tommer = scanner.nextDouble();
        double centemeter = tommer * Tommer_til_centemeter;

        System.out.println("Resultatet er " + centemeter + " centemeter ");

                scanner.close();

    }
}