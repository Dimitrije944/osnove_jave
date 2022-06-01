package d31_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class OsobaMain {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        ArrayList<Igrac> nizIgraca = new ArrayList<Igrac>();
        System.out.println("Unesite broj igraca koji zelite da dodate: ");
        int n = s.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite ime i prezime: ");
            String imeIPrezime = s.next();

            System.out.println("Unesite JMBG: ");
            String jmbg = s.next();

            System.out.println("Unesite godinu rodjenja: ");
            int godina = s.nextInt();

            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            System.out.println("Unesite poziciju: ");
            String pozicija = s.next();

            System.out.println("Da li je igrac kapiten: ");
            boolean daLiJeKapiten = s.nextBoolean();



            Igrac p = new Igrac();
            p.setImeIprezime(imeIPrezime);
            p.setJmbg(jmbg);
            p.setGodinaRodjenja(godina);
            p.setBroj(broj);
            p.setPozicija(pozicija);
            p.setDaLiJeKapiten(daLiJeKapiten);
            nizIgraca.add(p);
            p.stampaj();
        }

        ArrayList<Trener> nizTrenera = new ArrayList<>();
        System.out.println("Unesite broj trenera koji zelite da dodate: ");
        int n1 = s.nextInt();

        for (int i = 0; i < n1; i++) {
            System.out.println("Unesite ime i prezime: ");
            String imeIPrezime = s.next();

            System.out.println("Unesite JMBG: ");
            String jmbg = s.next();

            System.out.println("Unesite godinu rodjenja: ");
            int godina = s.nextInt();

            System.out.println("Unesite godine iskustva: ");
            int iskustvo = s.nextInt();

            System.out.println("Unesite tip trenera: ");
            String tipTrenera = s.next();

            Trener trener3 = new Trener();
            trener3.setImeIprezime(imeIPrezime);
            trener3.setJmbg(jmbg);
            trener3.setGodinaRodjenja(godina);
            trener3.setGodineIskustva(iskustvo);
            trener3.setTipTrenera(tipTrenera);
            nizTrenera.add(trener3);
            trener3.stampaj();
        }

    }
}
