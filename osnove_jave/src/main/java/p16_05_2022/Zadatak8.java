package p16_05_2022;

public class Zadatak8 {
//    Napisati metodu koja proverava da li je trougao pravougli.
//    Metoda prima stranice trougla i hipotenuzu trougla.
//    Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//    Trougao je pravougli ukoliko je a*a+b*b=c*c

    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=4;
        boolean x = trougao(a,b,c);
        System.out.println(x);

    }
    static boolean trougao(int a, int b, int c){
        if(a*a + b*b == c*c){
            return true;
        }else{
            return false;
        }
    }
}
