import java.util.Scanner;

public class Vezbanje2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite tezinu: ");
        int tezina = s.nextInt();
        System.out.println("Unesite visinu: ");
        double visina = s.nextDouble();
        double bMi = tezina/ (visina*visina);
        System.out.println(bMi);
        if( bMi < 18.5){
            System.out.println("Neuhranjenost");
        }else if( bMi >= 18.5 && bMi <= 24.99){
            System.out.println("Normalna tezina");
        }else if( bMi >= 25 && bMi <= 29.99){
            System.out.println("Prekomerna tezina");
        }else{
            System.out.println("Gojaznost");
        }


    }
}
