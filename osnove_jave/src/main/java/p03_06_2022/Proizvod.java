package p03_06_2022;

import java.util.ArrayList;

public abstract class Proizvod {
//    Kreirati abstraktnu klasu Proizvod koja ima:
//    niz dodataka
//    metodu ubaciDodatak koja dodaje dodatak u niz
//    metodu koja vraca cenu svih dodataka koje ima proizvod
//    abstraktnu metodu ukupnu racunaj cenu
//    abstraktnu metodu stampaj
    protected ArrayList<Dodatak>dodaci = new ArrayList<>();
    public void ubaciDodatak( Dodatak dodatak){
        this.dodaci.add(dodatak);
    }
    public abstract double racunajCenu();
    public abstract void stampaj();



}
