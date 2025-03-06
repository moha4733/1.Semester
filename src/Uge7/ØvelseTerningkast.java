package Uge7;

import java.util.Random;

public class ØvelseTerningkast {

    public static int getDieRoll(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int dice = getDieRoll();
            System.out.println(dice);
        }
    }

}
