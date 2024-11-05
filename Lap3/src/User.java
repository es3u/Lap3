import java.util.ArrayList;

public class User {

    private String userName , email ;
    private ArrayList<Media>purchaseMediaList = new ArrayList<>();
    private ArrayList<Media> shoppingCart = new ArrayList<>();

    public User() {
    }

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;

    }

    public User(String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart, String userName) {
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
        this.userName = userName;
    }


    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        if(userName.length()>2)
        this.userName = userName;
        else
            System.out.println("Pleas enter user name > 2 word");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if(email.matches(emailRegex))
        this.email = email;
        else
            System.out.println("the email is incorrect");
    }

    public void addToCart(Media media){
        shoppingCart.add(media);
    }
    public void removeFromCart(Media media){
        shoppingCart.remove( media) ;
    }
    public void checkOut(){
        for (Media media : shoppingCart) {
            if (media instanceof Book) {

            }
        }
    }
    public void addPurchaseMediaList(Media media) {
        purchaseMediaList.add(media);
    }

    public void position(){
        System.out.println("*User*");
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", purchaseMediaList=" + purchaseMediaList +
                ", shoppingCCart=" + shoppingCart +
                '}';
    }
}
