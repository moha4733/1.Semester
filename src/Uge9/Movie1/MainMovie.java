package Uge9.Movie1;

public class MainMovie {
    public static void main(String[] args) {
        Movie movie=new Movie();
        movie.setDirector("pele");
        movie.setDuration(37);
        movie.setTiltle("Ronaldo");
        System.out.println(movie.getMovieDetails());
    }
}
