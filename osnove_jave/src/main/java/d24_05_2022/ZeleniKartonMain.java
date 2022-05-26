package d24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeleniKartonMain {
    public static void main(String[] args) {

                ArrayList<ZeleniKarton> nizZelenihKartona = new ArrayList<>();
                Scanner s = new Scanner(System.in);
                System.out.println("Unesite broj zelenih kartona: ");
                int n = s.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("Unesite ime i prezime: ");
                    String student = s.next();
                    System.out.println("Unesite broj indeksa: ");
                    int indeks = s.nextInt();
                    System.out.println("Unesite predmet: ");
                    String ispit = s.next();
                    System.out.println("Unesite profesora: ");
                    String profesor = s.next();
                    System.out.println("Unesite ocenu: ");
                    int grades = s.nextInt();
                    nizZelenihKartona.add(new ZeleniKarton(student, indeks, ispit, profesor, grades));

                }

                int zbir = 0;
                for (int i = 0; i < nizZelenihKartona.size(); i++) {
                    nizZelenihKartona.get(i).stampaj();
                    zbir = zbir + nizZelenihKartona.get(i).getOcena();
                }
                double prosek = zbir / nizZelenihKartona.size();
                System.out.println("Prosecna ocena je " + prosek);
            }
    }

