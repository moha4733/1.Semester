package Uge7;

import java.util.Scanner;
public class futureAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = getName(scanner);
        int birthYear = getBirthYear(scanner);
        int ageInFuture = calculateAgeInFuture(birthYear, 2050);
        printMessage(name, ageInFuture);
        scanner.close();
    }
    // TODO:
    // Lav en metode getName der:
    // - Modtager et scanner objekt som parameter
    public static String getName(Scanner scanner){
        // - Spørg brugeren om et navn
        System.out.println("Hvad hedder du");
        // - Returner navnet som String
    return scanner.nextLine();
    }

    // TODO:
    // Lav en metode getBirthYear der:
    // - Modtager et scanner objekt som parameter
    public static int getBirthYear (Scanner scanner) {
        // - Spørg brugeren om deres fødselsår
        System.out.println("Hvornår er du født");
        // - Returner fødselsåret som int
        return scanner.nextInt();
    }



    public static int calculateAgeInFuture(int birthYear, int futureYear) {
        return futureYear - birthYear;
    }
    public static void printMessage(String name, int ageInFuture) {
        System.out.println(name + ", du vil være " + ageInFuture + " år gammel i 2050.");
    }
}