package p16_05_2022;


public class Zadatak7 {
//    Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
//    Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//    Primer: Ako se metoda pozove za N=10, vraca -10
//    Ako se metoda pozove za N=-11, vraca 11

    public static void main(String[] args) {
        int a =10;
        int x=broj(a);
        System.out.println("Broj je" +x);

    }
    static int broj(int a){
        int s = -a;
        return s;
    }
}
