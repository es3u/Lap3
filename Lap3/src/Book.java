import java.util.ArrayList;

public class Book extends Media{

    private int sock ;
    private ArrayList <Review> review  = new ArrayList() ;


    public Book() {
    }

    public Book(Review[] review, int sock) {

        this.sock = sock;
    }

    public Book(String auteur, String ISBN, double price, String title,  int sock) {
        super(auteur, ISBN, price, title);

        this.sock = sock;

    }

    public ArrayList<Review> getReview() {
        return review;
    }

    public void addReview(Review r) {
        review.add(r) ;
    }

    public int getSock() {
        return sock;
    }

    public void setSock(int sock) {
        this.sock = sock;
    }

    public double getAverageRating() {
        if (review.isEmpty()) {
            return 0;}
        double sum = 0;
        for (Review review : review) {
            sum +=  review.getRating();
        }
        return sum / review.size();
    }


    public void purchase(User user){
        if (sock > 0) {
            user.addPurchaseMediaList(this);
            sock--;
        } else {
            System.out.println("Out of stock!");
        }
    }

public boolean isBestSeLler(){
        if(getAverageRating() >= 4.5)
            return true ;
        else return false ;
}

public void restock(int quantity){
        this.sock= sock +quantity ;
    System.out.println("Restocked: " + quantity + "of: " + getTitle());
}

    @Override
    public String getMedia() {
        if(getAverageRating() >= 4.5)
            return "Bestselling Book";
        else
            return "Book";
    }

    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Book{" +
                "sock=" + sock +
                ", review=" + review +
                "} " + super.toString();
    }

}
