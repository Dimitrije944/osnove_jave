package p20_05_2022;

public class KupacKarticaMain {
    public static void main(String[] args) {
        ClanskaKarta kartica = new ClanskaKarta(10,"24135235");
        Kupac kupac = new Kupac(kartica);
        kupac.setImeIPrezime("Dimitrije Petronijevic");
        Proizvod starke = new Proizvod();
        starke.setNaziv("Starke");
        starke.setCenaIzradeProizvoda(234);
        starke.setKupac(kupac);

        starke.stampaj();
    }
}
