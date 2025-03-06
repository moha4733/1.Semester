package Uge9.Movie1;

public class Movie {
    private String tiltle;
    private String director;
    private double duration;


    public String getTiltle(){
        return tiltle;
    }
    public void setTiltle(String tiltle){
        this.tiltle=tiltle;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public double getDuration(){
        return duration;
    }
    public void setDuration(double duration){
        this.duration=duration;
    }
    public String getMovieDetails(){
        return "title" + tiltle + " director " + director + " duration " + duration + " minut ";
    }
}
