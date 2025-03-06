package Uge10.enmu;
import java.util.Scanner;
public class Marked {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("vælge en vare ved at skrive et tal.");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("1, Nutella, 39 kr -,");
                break;
            case 2:
                System.out.println("2, Mælk, 16 kr-,");
                break;
            case 3:
                System.out.println("3, Sodavand, 24 kr ,-");
                break;
            default:
                System.out.println("Ugyldigt valg, prøv igen.");
        }

        scanner.close();

    }

}
