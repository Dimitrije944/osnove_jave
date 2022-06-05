package d03_06_2022;

import java.util.ArrayList;

public class Korpa {
//    Kreirati klasu Korpa koja ima:
//    niz ambalaza
//    metodu dodaj ambalazu
//    metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String)
//    koju treba izbaciti
//    privatnu metodu koja vraca cenu svih ambalaza sa popustom,
//    metoda kao parametar prima popust.
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//    kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
//    U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko
//    Ambalaza razlicitih tipova i istestirati sve metode i
//    ispisati ukupnu cenu sa popustom.
private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza ambalaza) {
        nizAmbalaza.add(ambalaza);
    }

    public void izbaciAmbalazu(String barKod) {
        for (int i = 0; i < nizAmbalaza.size(); i++) {

            if (nizAmbalaza.get(i).getBarKod().equals(barKod)) {
                nizAmbalaza.remove(i);
            }

        }
    }
    public int racunajUkupnuCenu (SuperKartica popust){
        int ukupnaSuma = 0;
        for (int i = 0; i < nizAmbalaza.size() ; i++) {
            ukupnaSuma += nizAmbalaza.get(i).cenaArtikla() - popust.getPopust();
        }
        return ukupnaSuma;
    }

}
