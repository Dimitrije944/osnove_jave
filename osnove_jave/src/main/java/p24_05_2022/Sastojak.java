package p24_05_2022;

public class Sastojak {
//    Kreirati klasu Sastojak koja ima:
//    naziv sastojka
//    cenu
//    gettere i settere
//            konstuktore
//
//   U glavnom programu kreirati 3 sastojka.
//   U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika.
//   Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

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
        System.out.println("Sastojak " + this.naziv +", " + this.cena + ".din");
    }
}
