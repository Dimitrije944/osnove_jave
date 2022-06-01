package d31_05_2022;

import java.util.ArrayList;

public class Trener extends Osoba {
//    Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//    godine iskustva
//    tip trenera (kondicioni, za igru, pomocni, personalni)
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//    U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
public Trener(String imeIprezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
    super(imeIprezime, jmbg, godinaRodjenja);
    this.godineIskustva = godineIskustva;
    this.tipTrenera = tipTrenera;
    this.nizTrenera = nizTrenera;
}
    public Trener (){

    }
    public ArrayList<Trener> getNizTrenera() {
        return nizTrenera;
    }

    public void setNizTrenera(ArrayList<Trener> nizTrenera) {
        this.nizTrenera = nizTrenera;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    private ArrayList<Trener> nizTrenera = new ArrayList<>();

    private int godineIskustva;
    private String tipTrenera;

    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println("Godine iskustva: " + godineIskustva);
        System.out.println("Tip trenera: " + tipTrenera);
    }

}
