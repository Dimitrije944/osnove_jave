package d24_05_2022;

public class Transakcija {
//    Kreirati klasu Transakcija koja ima:
//    id transakcije
//    racun sa kog se prenose sredstva
//    racun na koji se prenose sredstva
//    gettere i settere
//            konstruktore
//    privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//    ako je prenos sredstava manji od 4500, provizija je fiksna 45
//    ako je prenos sredstava veci od 4500, provizija je 1%
//    S obzirom da se provizija racuna na osnovu visine transakcije,
//    znaci da metoda prima parametar koji predstavlja visinu transakcije
//    Ukoliko ne znate da resite ovu metodu,
//    u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//    metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//    Kao parametar funkcije se unosi vrednost koja se prebacuje.
//    Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//    a na drugi racun dodaje samo (trazena suma).
private String id;
    private Racun racunUplatioca;
    private Racun racunPrimaoca;
    private Racun racun;

    public Transakcija(String id, Racun racunUplatioca, Racun racunPrimaoca) {
        this.id = id;
        this.racunUplatioca = racunUplatioca;
        this.racunPrimaoca = racunPrimaoca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getRacunUplatioca() {
        return racunUplatioca;
    }

    public void setRacunUplatioca(Racun racunUplatioca) {
        this.racunUplatioca = racunUplatioca;
    }

    public Racun getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public void setRacunPrimaoca(Racun racunPrimaoca) {
        this.racunPrimaoca = racunPrimaoca;
    }
    private double provizija (double iznosTransakcije) {
        if (iznosTransakcije<4500){
            return 45;
        }
        else return 0.01 * iznosTransakcije;
    }
    public void izvrsiTransakciju (double iznosTransakcije) {
        racunPrimaoca.menjajStanje(iznosTransakcije);
        racunUplatioca.menjajStanje(-iznosTransakcije);
        racunUplatioca.menjajStanje(-provizija(iznosTransakcije));
    }
}
