package Uge10.enmu;

public class EnumTurial {
    public static void main(String[] args) {
    DaysOfTheWeek day = DaysOfTheWeek.Friday;

    if (day==DaysOfTheWeek.Friday){
        System.out.println("Ja tak det er friday og det betyder weekend");
    }

    for (DaysOfTheWeek myDay : DaysOfTheWeek.values()){
        System.out.println(myDay);
    }


    }
}

