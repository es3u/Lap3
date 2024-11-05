import java.util.ArrayList;

public class Movie extends Media{
    private int duration ;

    public Movie() {
    }

    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String auteur, String ISBN, double price, String title, int duration) {
        super(auteur, ISBN, price, title);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void Watch(User user){
        user.addPurchaseMediaList(this);
    }

    public ArrayList<Movie> recommenSimilarMovies(ArrayList<Movie> movieCatalog) {
        ArrayList<Movie> a = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if (this.getAuteur().equals(movie.getAuteur())) {
                a.add(movie);
            }
        }
        return a;
    }

    @Override
    public String getMedia() {
        if(duration>=120)
            return "Long Movie";
            else
                return "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                "} " + super.toString();
    }
}
