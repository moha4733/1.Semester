package Uge10.enmu;
import java.util.Scanner;


public class lys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vælg en farve (1 for Rød, 2 for Gul, 3 for Grøn):");

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("1, RØD");
                break;
            case 2:
                System.out.println("2, GUL");
                break;
            case 3:
                System.out.println("3, GRØN");
                break;
            default:
                System.out.println("Ugyldigt valg, prøv igen.");
        }

        scanner.close();
    }
}

