package Uge6;

import java.util.Scanner;
public class Opskrift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hvor mange cookies du at bage");

       int antalCookies = scanner.nextInt();
        double melpercooie = 50.0;

        double totalmel = antalCookies * melpercooie;


        System.out.println("for bage " + antalCookies + " cookie, skal du bruge " + totalmel + " gram mel ");


        scanner.close();


    }
}

