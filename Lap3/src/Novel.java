public class Novel extends Book{


    private String genre ;

    public Novel() {
    }

    public Novel(String genre) {
        this.genre = genre;
    }

    public Novel(Review[] review, int sock, String genre) {
        super(review, sock);
        this.genre = genre;
    }

    public Novel(String auteur, String ISBN, double price, String title, Review[] review, int sock, String genre) {
        super(auteur, ISBN, price, title, sock);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String getMedia() {
        if(getAverageRating()>=4.5)
        return "Bestselling Novel";
        else return  "Novel";

    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
