package p20_05_2022;

public class FacebookPost {
    //    Kreirati klasu FacebookPost
//            opis
//    korisnik (referenca na korisnika koji je kreirao post)
//    konstrukore koje mislite da su vam potrebni
//    metoda print, stampa u formatu:
//            (ime) (prezime)
//            (opis post-a)
//
//    U main metodi, kreirati jedan facebook post
//    i jednog korisnika i pozvati svaku od metoda
    private String opis;
    private Korisnik autor;
    public Korisnik getAutor(){
        return this.autor;
    }
    public void setAutor(Korisnik autor) {
        this.autor = autor;
    }

    public String getOpis() {
        return this.opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
    public FacebookPost(){}
    public FacebookPost(String opis, Korisnik autor){
        this.opis = opis;
        this.autor = autor;
    }

    public void stampaj() {
        this.autor.stampaj();
        System.out.println("Opis "+ this.opis);
    }
}
