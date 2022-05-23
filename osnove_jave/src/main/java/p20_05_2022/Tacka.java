package p20_05_2022;

public class Tacka {
//    1.Zad
//    Za klasu Tacka, koja ima privatne atribute:
//    x - x koordinata
//    y - y koordinata
//    metodu stampaj
//    imamo difoltni konstruktor
//    imamo konstuktor koji prima obe koordinate za kreiranje objekta
//    U glavnom programu kreirati objekte

    public int x;
    public  int y;
    public Tacka(){

    }

    public Tacka (int x, int y){
        this.x=x;
        this.y=y;

    }

    public void stampaj(){
        System.out.println("X je "+ x + " vece od y " +y);
    }


}
