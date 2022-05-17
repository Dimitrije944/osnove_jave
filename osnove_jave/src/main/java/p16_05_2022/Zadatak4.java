package p16_05_2022;

public class Zadatak4 {
//    Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik
//    za dva prosledjena broja.
//    Brojevi su ulazni parametri funkcije.
//    U gravnom programu pozvati nekoliko puta funkciju sa razlicitim
//    prosledjenim vrednostima.

    public static void main(String[] args) {
        operacije( 10, 5 );

    }
    static void operacije(int a, int b){
        System.out.println("Zbir je: " + (a+b));
        System.out.println("Razlika je: " + (a-b));
        System.out.println("Prozvod je: " + (a*b));
        System.out.println("Kolicnik je: " + (a/b));
    }
}
