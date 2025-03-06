package Uge6;

public class TemperaturOmregner {

    public static double FahrToCels (double Fahr) {

        double cels = (Fahr - 32)* 5 / 9;
        return cels;
    }
    public static double celsToFahr(double cels) {
        double Fahr = (cels * 9 /5) + 32;
        return Fahr;
    }

    public static void main(String[] args) {

        double fahrenheit = 37.4;
        double celsius = FahrToCels(fahrenheit);
        System.out.println(fahrenheit + " Fahreheit er " + celsius + " celcius ");

        double celciusTemp = 3.0;
        double fahrenheitTemp = celsToFahr(celciusTemp);
        System.out.println(celciusTemp + " celsius er " + fahrenheitTemp + " Fahrenheit ");


    }
}


