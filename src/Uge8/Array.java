package Uge8;

import java.util.Arrays; // Importerer Arrays-klassen for at kunne bruge metoder som Arrays.toString().

// Opretter en klasse ved navn "Array"
public class Array {

    // Main-metoden, som kører, når programmet starter.
    public static void main(String[] args) {

        // Deklarerer et array af heltal med navnet 'data'
        int[] data;
        // Initialiserer arrayet med plads til 5 elementer
        data = new int[5];
        // Tildeler værdier til hvert element i 'data'
        data[0] = 27;  // Første element får værdien 27
        data[1] = 51;  // Andet element får værdien 51
        data[2] = 33;  // Tredje element får værdien 33
        data[3] = -1;  // Fjerde element får værdien -1
        data[4] = 101; // Femte element får værdien 101

        // Udskriver værdien af det første element i 'data'
        System.out.println(data[0]); // Output: 27

        // Opretter et nyt array 'data2' med plads til 3 elementer
        int[] data2 = new int[3];
        // Tildeler værdien 5 til det sidste element i 'data2'
        data2[data2.length - 1] = 5;  // 'data2.length - 1' refererer til det sidste element i arrayet

        // Initialiserer et array 'data3' med værdier
        int[] data3 = {27, 33, 51, -1, 101}; // Arrayet initialiseres direkte med værdier

        // Gemmer værdien af det tredje element i 'data3' i variablen 'myNum'
        int myNum = data3[2];  // 'myNum' får værdien 51, da det er værdien af 'data3[2]'

        // Udskriver hele 'data3'-arrayet
        System.out.println(data3);  // Output: En hukommelsesadresse, ikke læsbar for mennesker.

        // Udskriver 'data3' i en læsbar format ved hjælp af Arrays.toString() metoden
        System.out.println(Arrays.toString(data3)); // Output: [27, 33, 51, -1, 101]

        // Opretter et array af chars med plads til 3 elementer
        char[] charArr = new char[3]; // Arrayet 'charArr' er initialiseret med 3 pladser til char værdier
        // Opretter et array af booleans med plads til 3 elementer
        boolean[] boolArr = new boolean[3]; // Arrayet 'boolArr' er initialiseret med 3 pladser til boolean værdier
        // Opretter et array af Strings med plads til 3 elementer
        String[] starArr = new String[3]; // Arrayet 'starArr' er initialiseret med 3 pladser til String værdier

        // Udskriver hele 'starArr' arrayet. Bemærk at standardværdien for uinitialiserede Strings er 'null'
        System.out.println(starArr);  // Output: En hukommelsesadresse, som ikke er læsbar for mennesker.

        // Udskriver 'charArr' arrayet i en læsbar format ved hjælp af Arrays.toString() metoden
        System.out.println(Arrays.toString(charArr)); // Output: [ ,  ,  ] (tomtegn '\u0000' for hver char)
    }
}
