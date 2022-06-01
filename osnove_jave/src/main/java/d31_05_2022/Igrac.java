package d31_05_2022;

import java.util.ArrayList;

public class Igrac extends Osoba {
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
public Igrac(String imeIprezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean daLiJeKapiten) {
    super(imeIprezime, jmbg, godinaRodjenja);
    this.broj = broj;
    this.pozicija = pozicija;
    this.daLiJeKapiten = daLiJeKapiten;
    this.nizIgraca = nizIgraca;
}

    public ArrayList<Igrac> getNizIgraca() {
        return nizIgraca;
    }

    public void setNizIgraca(ArrayList<Igrac> nizIgraca) {
        this.nizIgraca = nizIgraca;
    }

    private ArrayList<Igrac> nizIgraca = new ArrayList<>();
    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }



    private int broj;
    private String pozicija;
    private boolean daLiJeKapiten;
    public Igrac () {

    }
    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println("Broj koji igrac nosi: " + broj);
        System.out.println("Pozicija na kojoj igra: " + pozicija);
        System.out.println("Da li je igrac kapiten: " + daLiJeKapiten);
    }

}
