package p24_05_2022;

public class Ugovor {
//    Kreirati klasu Ugovor koja ima:
//    godinu, dan i mesec sklapanja ugovora
//    osobu koja prodaje nekretninu (fizicko lice)
//    osobu koja kupuje nekretninu (fizicko lice)
//    cenu za koju se prodaje nekretnina
//    adresu nekretnine (ulica br., grad)
//    metodu koja vraca procenat zarade
//    za osobu koja je vec kupovale nekretninu
//    preko agencije je 0.02 dok je za one koji nisu 0.03
//    metodu koja racuna zaradu agencije pri prodaji nekretninte
//    koja ukljucujei poreze, takse i usluge agencije, prema formuli:
//            1000 + cena za koju se prodaje * procenat zarade
//    metodu koja stampa ugovor u formatu:
//    Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i
//    (print kupca) o kupovini nekretnine (adresa)
//    po ceni od (cena nekretnin) pri cemu je kupac
//    u obavezi da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)
private String datum;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cena;
    private String adresa;

    public Ugovor(String datum,
                  FizickoLice prodavac,
                  FizickoLice kupac,
                  int cena,
                  String adresa) {
        this.datum = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }

    //    public double procenatZarade() {
//        if (this.kupac.isVecKupovao()){
//            return 0.02;
//        }
//        return 0.03;
//    }
    public double procenatZarade() {
        return this.kupac.isVecKupovao() ? 0.02 : 0.03;
    }

    public double racunajZaradu() {
        return 1000 + this.cena * this.procenatZarade();
    }

    public void stampajUgovor() {
        String print = String.format("Dana %s god sklopljen je ugovor" +
                        " izmedju %s i %s o kupovini nekretnine" +
                        " %s po ceni od %s pri cemu je kupac u " +
                        "obavezi da agenciji isplati novcanu vrednost u " +
                        "iznosu od %s",
                this.datum,
                this.prodavac.getPunoIme(),
                this.kupac.getPunoIme(),
                this.adresa,
                this.cena,
                this.racunajZaradu());
        System.out.println(print);
    }


}
