package p24_05_2022;

public class Korisnik {
//    Zadatak
//
//    Kreirati klasu Korisnik koja ima:
//    ime i prezime
//    tip licence (basic/pro/premium)
//    konstruktore. Po difoltu korisnik ima basic licencu.
//    gettere i settere za sve atribute,
//    sem za tip licence koja ne moze da se menja
//    metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//    ako je uplata 100, postavlja licencu na “pro”
//    ako je uplata 150, postavlja licencu na “premium”
//    Metoda kao parametar prima vrednost uplate $100 ili $150
//    metodu ponisti pretplatu koja postavlja licencu na basic
//    metodu koja vraca maksimalnu duzinu trajanja video poziva
//    u zavisnosti od licence
//    ako je basic, vraca 40min
//    ako je pro, vraca 240min
//    ako je  premium, vraca 1440min
//    metodu za stampu koja stampa u formatu:
//    ime i prezime
    private String punoIme;
    private String licenca;

    public Korisnik() {
        this.licenca = "basic";
    }

    public Korisnik(String punoIme) {
        this.punoIme = punoIme;
        this.licenca = "basic";
    }


    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getLicenca() {
        return licenca;
    }

    public void pretplatiSe(int uplata) {
        if (uplata == 100) {
            this.licenca = "pro";
        } else if (uplata == 150) {
            this.licenca = "premium";
        }
    }

    public void ponistiPretplatu() {
        this.licenca = "basic";
    }

    public int maximalnaDuzinaPoziva() {
        if (this.licenca.equals("basic")) {
            return 40;
        } else if (this.licenca.equals("pro")) {
            return 240;
        } else if (this.licenca.equals("premium")) {
            return 1440;
        }
        return 0;
    }

    public void stampaj() {
        System.out.println(this.punoIme);
    }
}

