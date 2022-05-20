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

        cetvorotockas.stampa();
        if(cetvorotockas.prekoracenje(90)){
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
    }
}
