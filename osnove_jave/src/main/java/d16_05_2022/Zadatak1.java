package d16_05_2022;

public class Zadatak1 {
    //    Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa
//    prosledjena vrednost za 10 veca.
//    Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
    public static void main(String[] args) {
        stampajVrednostZa10Vecu(25);
        stampajVrednostZa10Vecu(50);
        stampajVrednostZa10Vecu(15);
        stampajVrednostZa10Vecu(110);
    }
    static void  stampajVrednostZa10Vecu(int vrednost) {
        System.out.println("Vrednost za 10 veca je: " + (vrednost + 10));
    }

}

