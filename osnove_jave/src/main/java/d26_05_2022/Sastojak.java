package d26_05_2022;

public class Sastojak {
//    Kreirati klasu Sastojak koja ima:
//    naziv
//    cenu
//    gettere i settere
//    konstruktore
//    metodu za stampanje koja stampa  podatke u formatu:
//    naziv - cena.din
//
//    Kreirati klasu Pasta koja ima:
//    niz sastojaka
//    metodu za dodavanje sastojka
//            (ostavite za kraj) metodu za brisanje sastojka.
//            U metodu se salje naziv sastojka koji se brise.
//            defaultni konstruktor
//    metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//    metodu za stampu koja stampa podatke u formatu:
//    Pasta je sa sastojcima:
//    naziv - cena.din
//    naziv - cena.din
//    naziv - cena.din
//    Cena paste je cena.din
//
//    U glavnom programu kreirati objekte i testirati funkcionalnosti
    private String naziv;
    private int cena;

    public Sastojak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void stampaj() {
        System.out.println(naziv + " - " + cena + ".rsd");
    }

}
