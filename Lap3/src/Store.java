import java.util.ArrayList;

public class Store {

    private ArrayList<User> user = new ArrayList<>();
    private ArrayList<Media> media = new ArrayList<>();

    public Store() {
    }

    public Store(ArrayList<User> user, ArrayList<Media> media) {
        this.user = user;
        this.media = media;
    }


    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }

    public void addUser(User user){
        this.user.add(user);

    }

    public ArrayList<User> displayUsers(){

            if(this.user.isEmpty()){
                 System.out.println(" No users");
        return user ;}
            else {
                return this.user;}
    }

    public void addMedia(Media media){
        this.media.add(media);

    }

    public ArrayList<Media> displayMedia(){

        if(this.media.isEmpty()){
            System.out.println(" No media");
            return media ;}
        else {
            return this.media;}
    }

    public Book searchBook(String title) {
        for (Media media : media) {
            if (media instanceof Book) {
                if (media.getTitle().equalsIgnoreCase(title)) {
                    return (Book) media;
                }
            }
        }
        return null;
    }







}
