public class Media {
    private String title , auteur , ISBN ;
    private double price ;

    public Media() {
    }

    public Media(String auteur, String ISBN, double price, String title) {
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.price = price;
        this.title = title;
    }


    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getMedia(){

        return"Media";
    }


    @Override
    public String toString() {
        return "Media{" +
                "auteur='" + auteur + '\'' +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price +
                '}';
    }
}
