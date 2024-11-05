public class Review {

    private String userName , comment ;
    private double rating;
    public Review() {
    }

    public Review(String comment, double rating, String userName) {
        this.comment = comment;
        this.rating = rating;
        this.userName = userName;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }





}
