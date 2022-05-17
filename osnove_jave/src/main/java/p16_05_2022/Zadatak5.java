package p16_05_2022;

public class Zadatak5 {
//    Napisati metodu stampajApsolutnuVrednost,
//    koja stampa apsolutnu vrednost   prosledjene vrednosti.

    public static void main(String[] args) {
        int a=-10;
      printApsolutnuVrednost(a);

    }
    static void printApsolutnuVrednost(int a){
        if(a>0){
            System.out.println("Apsolutna vrednost " + a);
        }else
            a=-a;
        System.out.println("Apsolutna vrednost je " + a);
    }
}
