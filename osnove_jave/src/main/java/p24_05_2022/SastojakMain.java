package p24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class SastojakMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Sastojak> sastojci = new ArrayList<>();
        System.out.println("Unesite N:");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite naziv:");
            String naziv = s.next();
            System.out.print("Unesite cenu: ");
            int cena = s.nextInt();

            Sastojak x = new Sastojak(naziv, cena);
            sastojci.add(x);
        }
        int suma = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            suma = suma + sastojci.get(i).getCena();
        }

        System.out.println("SUma sastojaka je " + suma);



    }

    }
