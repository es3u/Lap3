import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        User u1 = new User("Es3u" , "easa-01@hotmail.com" );
        User u2 = new User("obaid1" , "obaid@hotmail.com" );
        User u3 = new User("muqrin1" , "muqrin@hotmail.com" );

        Store s1 = new Store();
        s1.addUser(u1);
        s1.addUser(u2);
        s1.addUser(u2);
        ArrayList<Review> r1 =new ArrayList<>();
        Review r = new Review();


        System.out.println(s1.displayUsers());;
        Book b1 = new Book("Muhammed", "1234", 10.50,"the desert",  100 );
        Book b2 = new Book("raid", "2939", 9.9,"eirth",  5);
        System.out.println(b1.toString());

        Movie mo1 = new Movie("obaid", "54321", 27.3, "weekend", 148);
        System.out.println(mo1.toString());;
        Music mu1 = new Music("saleh", "2323", 10.4, "Queen", "Queen");
        System.out.println(mu1.toString());



        s1.addMedia(b1);
        s1.addMedia(b2);
        s1.addMedia(mo1);
        s1.addMedia(mu1);
        System.out.println(s1.displayMedia());;







    }
}
