package d26_05_2022;

import java.util.ArrayList;

public class Pasta {
    ArrayList<Sastojak> nizSastojaka = new ArrayList<>();

    public ArrayList<Sastojak> dodajSastojak(Sastojak sastojak) {

        nizSastojaka.add(sastojak);

        return nizSastojaka;
    }

    public Pasta() {
    }

    public int racunajCenu() {
        int ukupnaCena = 0;
        for (int i = 0; i < nizSastojaka.size(); i++) {
            ukupnaCena = ukupnaCena + nizSastojaka.get(i).getCena();
        }
        return ukupnaCena;
    }

    public void stampa() {
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < nizSastojaka.size(); i++) {

            System.out.print(nizSastojaka.get(i).getNaziv() + " - " +
                    nizSastojaka.get(i).getCena());
            System.out.println(".rsd");

        }
        System.out.println("Cena paste je " + racunajCenu() + ".rsd");
    }

    public ArrayList<Sastojak> brisanjeSastojaka(String naziv) {
        for (int i = 0; i < nizSastojaka.size(); i++) {
            if (nizSastojaka.get(i).getNaziv().equals(naziv)) {
                nizSastojaka.remove(nizSastojaka.get(i));
            }
        }
        return nizSastojaka;
    }
}
