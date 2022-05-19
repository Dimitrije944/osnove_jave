package p18_05_2022;

import java.util.Scanner;

public class MainRacun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Racun posiljalac = new Racun();
        posiljalac.broj = "840-23932-323";
        posiljalac.vlasnik = "Milan Jovanovic";
        posiljalac.stanje = 1000;

        System.out.print("Vlasnik: " + posiljalac.vlasnik+ ", ");
        System.out.println(posiljalac.broj + ", " + posiljalac.stanje);

        Racun primalac = new Racun();
        primalac.broj= "324-24242-423";
        primalac.vlasnik = "Dragan Draganic";
        primalac.stanje = 200;

        System.out.print("Vlasnik: " + primalac.vlasnik+ ", ");
        System.out.println(primalac.broj + ", " + primalac.stanje);

        System.out.println("Unesite transakciju: ");
        int transakcija = s.nextInt();

        posiljalac.stanje = posiljalac.stanje - transakcija;
        primalac.stanje = primalac.stanje + transakcija;

        System.out.print("Vlasnik: " + posiljalac.vlasnik+ ", ");
        System.out.println(posiljalac.broj + ", " + posiljalac.stanje);
        System.out.print("Vlasnik: " + primalac.vlasnik+ ", ");
        System.out.println(primalac.broj + ", " + primalac.stanje);


    }
}
