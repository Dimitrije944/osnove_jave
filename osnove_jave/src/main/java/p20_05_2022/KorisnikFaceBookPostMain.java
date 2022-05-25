package p20_05_2022;

import p23_05_2022.Film;

public class KorisnikFaceBookPostMain {
    public static void main(String[] args) {

        FacebookPost post = new FacebookPost();
        post.setOpis("Hello");

        Korisnik a = new Korisnik();

        a.setIme("Dimitrije");
        a.setPrezime("Petronijevic");
        post.setAutor(a);
        post.stampaj();
    }
}
