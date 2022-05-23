package p19_05_2022;

public class AutoMain {
    public static void main(String[] args) {
        Auto cetvorotockas = new Auto();
        cetvorotockas.vlasnik = "Dimitrije Petronijevic";
        cetvorotockas.marka = "BMW";
        cetvorotockas.broj = 5;
        cetvorotockas.potrosnja = 10;
        cetvorotockas.brzina = 200;
        cetvorotockas.registarcija = "132425";
        cetvorotockas.daLiJeUkljucenaKlima = true;
        cetvorotockas.godinaProizvodnje = 2005;
        cetvorotockas.registrovanDo = 3;
        cetvorotockas.kubikaza = 1500;
        cetvorotockas.kapacitetRezervoara = 50;
        cetvorotockas.trenutnoURezervoaru = 20;



        cetvorotockas.stampa();
        if (cetvorotockas.prekoracenje(90)) {
            System.out.println("Kazna za prekoracenje je " + cetvorotockas.kazna(90));
        }
        System.out.println();
        cetvorotockas.dodajGas();
        cetvorotockas.dodajGas();
        cetvorotockas.dodajGas();
        System.out.println("Stampa nakon 3 puta dodaje gas");
        cetvorotockas.stampa();
        cetvorotockas.koci();
        System.out.println("Stampaj nakon kocenja");
        cetvorotockas.stampa();

        System.out.println("Trenutna potrosnja je " + cetvorotockas.trenutnaPotrosnja());

        if (cetvorotockas.oldTimer()) {
            System.out.println("Auto je oldtimer");
        }

        if (cetvorotockas.isteklaRegistracija(7)) {
            System.out.println("Registracija je istekla");
        }

        System.out.println("Cena registracije je "+ cetvorotockas.cenaRegistacije());

        System.out.println("Cena goriva nakon dolivanja 5l " + cetvorotockas.natociGorivo(5));



    }
}
