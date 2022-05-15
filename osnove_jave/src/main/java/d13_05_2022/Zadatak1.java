package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji ima niz brojeva od 25 elemenata,
//        koji izgleda kao tabela 5x5.
//        Niz je fiksnih vrednosti (ne unosi ih korisnik)
//        zatim korisnik unosi poziciju za koju se racuna suma.
//        Suma za poziciju se racuna
//        tako sto se na vrednost tog polja dodaju vrednosti elemenata iznad,
//        ispod, sleve i sdesne strane tog elementa
//        (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
//        Za racunanje sume, nije potrebna petlja!
//        U projektu kreirati paket za ovaj domaci d13_05_2022 i
//        u njemu klasu Zadatak1.java
//        i postavite tekst zadataka u komentaru
//        a zatim commit-ujte promenu
//        i push-ujte na github sa porukom “Domaci 13.05.2022 Zadatak 1”
//
//        Primer izvrsenja:
//                2,4,6,7,4,
//                4,2,5,1,4,
//                1,4,9,4,5,
//                4,8,5,4,7,
//                4,4,7,4,1,
//                Unesite poziciju: 12
//        Suma je 27 (Objasnjenje: jer se sumira 9+5+4+4+5, pogledaj sliku)
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(7);
        brojevi.add(4);
        brojevi.add(4);
        brojevi.add(2);
        brojevi.add(5);
        brojevi.add(1);
        brojevi.add(4);
        brojevi.add(1);
        brojevi.add(4);
        brojevi.add(9);
        brojevi.add(4);
        brojevi.add(5);
        brojevi.add(4);
        brojevi.add(8);
        brojevi.add(5);
        brojevi.add(4);
        brojevi.add(7);
        brojevi.add(4);
        brojevi.add(4);
        brojevi.add(7);
        brojevi.add(4);
        brojevi.add(1);

        System.out.println("Unesite poziciju: ");
        int suma = 0;
        int i = s.nextInt();
        int pozicija = brojevi.get(i);
        int levo = brojevi.get(i-1);
        int desno = brojevi.get(i+1);
        int gore = brojevi.get(i-5);
        int dole = brojevi.get(i+5);
        if (i % 5 != 0 && i > 4 && i % 5 != 4 && i < 20) {
            suma = suma + pozicija + levo + desno + gore + dole;
        }

        System.out.println("Suma je " + suma);
    }
}

