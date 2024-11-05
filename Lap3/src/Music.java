import java.util.ArrayList;

public class Music extends Media{

    private String artist;

    public Music() {
    }

    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String auteur, String ISBN, double price, String title, String artist) {
        super(auteur, ISBN, price, title);
        this.artist = artist;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    public void listen(User user){
        user.addPurchaseMediaList(this);

    }

    public ArrayList<Music> generalPlayList(ArrayList<Music> musicCatalog){
        ArrayList<Music> a = new ArrayList();
        for(Music music : musicCatalog){
            if(this.getAuteur().equals(music.getAuteur()))
                  a.add(music);
        }
        return a ;
    }

    @Override
    public String getMedia() {
        if (getPrice() >=10)
        return "Premium Music" ;
        else
            return "Music" ;}

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                "} " + super.toString();
    }
}
