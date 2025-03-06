package Uge9;

public class Bank {
    // Privat felt for saldo
    private double saldo;

    // Getter metode for saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter metode for saldo
    public void setSaldo(double saldo) {
        if (saldo >= 0) { // Sikrer, at saldoen ikke kan være negativ
            this.saldo = saldo;
        } else {
            System.out.println("Saldo kan ikke være negativ.");
        }
    }

    // Metode for at indbetale penge
    public void indsaet(double beløb) {
        if (beløb > 0) {
            saldo += beløb;
        } else {
            System.out.println("Beløbet skal være positivt.");
        }
    }

    // Metode for at hæve penge
    public void hæv(double beløb) {
        if (beløb > 0 && saldo >= beløb) {
            saldo -= beløb;
        } else if (beløb > saldo) {
            System.out.println("Der er ikke nok penge på kontoen.");
        } else {
            System.out.println("Beløbet skal være positivt.");
        }
    }

    // Main metode til at teste klassen
    public static void main(String[] args) {
        Bank konto = new Bank();
        konto.setSaldo(1000);  // Sætter saldoen til 1000

        System.out.println("Saldo: " + konto.getSaldo()); // Udskriver saldoen

        konto.indsaet(500); // Indsætter 500
        System.out.println("Saldo efter indbetaling: " + konto.getSaldo());

        konto.hæv(200); // Hæver 200
        System.out.println("Saldo efter hævning: " + konto.getSaldo());

        konto.hæv(1500); // Forsøger at hæve mere end saldoen
        System.out.println("Saldo efter mislykket hævning: " + konto.getSaldo());
    }
}
