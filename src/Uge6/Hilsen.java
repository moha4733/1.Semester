package Uge6;

public class Hilsen {
    public static void main(String[] args) {
        String Name= "Signe";
        String word = "hej";
        String wow = "rsamus";
        String fullTekst = getFullTekst (Name,word);
        String hej = getFullTekst("Poul","BO");
        String ged = getFullTekst("Anne", "Hej");
        String hej_metode = getFullTekst("Simon","hej");
        System.out.println(hej);
        System.out.println(fullTekst);
    }
    public static String getFullTekst (String Name, String Word){
        String fullTekst= Word + " " + Name;
        return fullTekst;
    }
}