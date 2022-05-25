package p20_05_2022;

public class Proizvod {
//    Kreirati klasu Proizvod koja ima
//    Naziv proizvoda
//    kupca/musteriju
//    cenu izrade proizvoda
//    gettere i settere
//            konstruktore
//    Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//    cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//    Metodu za stampanje proizvoda u formatu:
//    naziv proizvoda - cena
//    ime i prezime - broj kartice
    private String naziv;
    private Kupac kupac;
    private double cenaIzradeProizvoda;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public double getCenaIzradeProizvoda() {
        return cenaIzradeProizvoda;
    }

    public void setCenaIzradeProizvoda(double cenaIzradeProizvoda) {
        this.cenaIzradeProizvoda = cenaIzradeProizvoda;
    }
    public double racunajCenu(){
        return this.cenaIzradeProizvoda * 1.9 * (100 - this.kupac.getKartica().getPopust())/100;
    }
    public void stampaj(){
        System.out.println(this.naziv+ " - "+this.racunajCenu());
        this.kupac.stampaj();
    }
}
