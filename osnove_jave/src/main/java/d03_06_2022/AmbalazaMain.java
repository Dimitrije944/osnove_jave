package d03_06_2022;

public class AmbalazaMain {
    public static void main(String[] args) {
        Korpa k = new Korpa();

        Ambalaza staklena = new StaklenaAmbalaza("555-4444-3333",
                "Sirce",
                15,
                40,
                50,
                true, 55);

        Ambalaza tetrapak = new Tetrapak("11-1115-0000",
                "Mleko",
                15,
                40,
                false,
                55);


        SuperKartica korisnik = new SuperKartica("1111-22222-7890", "Dimitrije Petronijevic", 19);

        k.dodajAmbalazu(staklena);
        k.dodajAmbalazu(tetrapak);
        korisnik.stampaKartica();
        System.out.println();
        staklena.stampaj();
        System.out.println();
        tetrapak.stampaj();
        System.out.println("Ukupna vrednost korpe je: " + k.racunajUkupnuCenu(korisnik));



    }
}
