package test;

public class Zadatak4 {
//    Zadatak (Metode)
//    Napisati metodu koja vrsi konverziju metara u cm, dm, km.
//    Metoda kao parametre prima
//    vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju
//    i vraca konvertovanu vrednost.
//
//    Podsetnik za konverziju jedinica:
//            1m = 100 cm
//1m = 10 dm
//1m = 0.001 km
//    Primer poziva metode
//    Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//    Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
//
//    U glavnom programu pozvati metodu
//    za konverziju cm, dm i km i ispisati odgovarajuce poruke na ekranu.
//
//    Primer izvrsenja programa:
//            3.5m je 350cm
//3.5m je 35dm
//3.5m je 0.0035km


    public static void main(String[] args) {
    double jed = konvertuj(3.5, "km");
        System.out.println(jed);
    }
    static double konvertuj (double vrednostUMetrima, String jedinica){
        if(jedinica.equals("dm")){
            return vrednostUMetrima * 10;
        }else if (jedinica.equals("cm")){
            return vrednostUMetrima * 100;
        }else{
            return vrednostUMetrima * 0.001;
        }

    }
}
