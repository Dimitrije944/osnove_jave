package d19_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
        Proizvod p1 = new Proizvod();

        p1.naziv = "Krem";
        p1.cena = 324.99;
        p1.tezina = 1300;
        p1.stampa();
        p1.povecajCenu(13);
        System.out.println("Posle povecanja rezultat je: " + p1.cena);
        double popust1 = p1.vratiCenuSaPopustom(30);
        System.out.println("Cena posle obracunatog popusta je: " + popust1 + "RSD");
        int postarina1 = p1.racunajPostarinu();
        System.out.println("Postarina za vas proizvod je: " + postarina1);

        System.out.println();

        Proizvod p2 = new Proizvod();

        p2.naziv = "Sladoled";
        p2.cena = 113.59;
        p2.tezina = 450;
        p2.stampa();
        p2.povecajCenu(16);
        System.out.println("Posle povecanja rezultat je: " + p2.cena);
        double popust2 = p2.vratiCenuSaPopustom(30);
        System.out.println("Cena posle obracunatog popusta je: " + popust2 + "RSD");
        int postarina2 = p2.racunajPostarinu();
        System.out.println("Postarina za vas proizvod je: " + postarina2);



    }
    }
