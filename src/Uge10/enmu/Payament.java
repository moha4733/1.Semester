package Uge10.enmu;

public class Payament {
    private int status;



    public Payament(int status){
        this.status=status;
    }
    public boolean isCompleted(){
        return status ==1;
    }

    public static class Lys {
        public static void main(String[] args) {

        }
    }
}
