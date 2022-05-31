package p30_05_2022;

public class InstagramMain {
    public static void main(String[] args) {
        InstagramUser Jovana = new InstagramUser("Jo", "Jovana Delic", "jdelic@gmail.com");
        InstagramUser Saska = new InstagramUser("Sashka", "Aleksandra Nesovic", "sashka@hotmail.com");
        InstagramUser Cira = new InstagramUser("Cira", "Ognjen Ciric", "ogi@gmail.com");

        InstagramTag x = new InstagramTag(5, 6);
        InstagramImage slika1 = new InstagramImage("1000mpx", "instagram.com/korisnik-Saska/profilna.jpg");

    }
}
