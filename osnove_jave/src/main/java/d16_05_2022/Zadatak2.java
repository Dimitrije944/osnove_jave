package d16_05_2022;

//Napisati funkciju koja za dva jednocifrena broja koja
// su ulazni parametri funkcije vraca novu
//vrednost koja se formira kao na primeru:
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

public class Zadatak2 {
    public static void main(String[] args) {
        int spojeniBroj = spojeniBrojevi(2, 3);
        System.out.println("Novo dobijeni broj je: " + spojeniBroj);

    }
    static int spojeniBrojevi(int prvi, int drugi) {
        int s = prvi * 10 + drugi;
        return s;

    }

}