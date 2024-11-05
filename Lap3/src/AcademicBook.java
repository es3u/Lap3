public class AcademicBook extends Book {

    private String subject ;

    public AcademicBook() {
    }

    public AcademicBook(String subject) {
        this.subject = subject;
    }

    public AcademicBook(Review[] review, int sock, String subject) {
        super(review, sock);
        this.subject = subject;
    }

    public AcademicBook(String auteur, String ISBN, double price, String title, Review[] review, int sock, String subject) {
        super(auteur, ISBN, price, title,  sock);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    @Override
    public String getMedia() {
        if(getAverageRating()>=4.5)
            return "Bestselling AcademicBook";
        else return "AcademicBook";
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }
}
