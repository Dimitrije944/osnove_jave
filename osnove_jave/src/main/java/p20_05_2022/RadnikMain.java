package p20_05_2022;

public class RadnikMain {
    public static void main(String[] args) {
        Radnik neko = new Radnik();

        neko.jmbg = "123123123213";
        neko.imeIPrezime = "Neko Nekovic";
        neko.brojDece = 3;
        neko.stepenSSpreme = 6;
        neko.godineRadnogStaza = 18;

        double minuliRad = neko.minuliRad();

        System.out.println("Minuli rad zaposlenog je: " + minuliRad);

        neko.koeficijentSlozenosti();

        double koeficijentSlozenosti = neko.koeficijentSlozenosti();

        System.out.println("Koeficijent slozenosti zaposlenog je: " + koeficijentSlozenosti);

        neko.plata();

        double plata = neko.plata();

        System.out.println("Plata zaposlenog je: " + plata);

        neko.jesteKreditnoSposoban();

        boolean jesteKreditnoSposoban = neko.jesteKreditnoSposoban();

        if (jesteKreditnoSposoban){
            System.out.println("Zaposleni je kreditno sposoban");
        } else {
            System.out.println("Zaposleni nije kreditno sposoban");

        }

        neko.brojSlobodnihDana();

        int brojSlobodnihDana = neko.brojSlobodnihDana();

        System.out.println("Zaposleni ima: " + brojSlobodnihDana + " slobodnih dana");


        System.out.println("---------------------------------------------------");


        Radnik niko = new Radnik();

        niko.jmbg = "092393440444";
        niko.imeIPrezime = "Niko Nikovic";
        niko.brojDece = 0;
        niko.stepenSSpreme = 8;
        niko.godineRadnogStaza = 27;

        minuliRad = niko.minuliRad();

        System.out.println("Minuli rad zaposlenog je: " + minuliRad);

        niko.koeficijentSlozenosti();

        koeficijentSlozenosti = niko.koeficijentSlozenosti();

        System.out.println("Koeficijent slozenosti zaposlenog je: " + koeficijentSlozenosti);

        niko.plata();

        plata = niko.plata();

        System.out.println("Plata zaposlenog je: " + plata);

        niko.jesteKreditnoSposoban();

        jesteKreditnoSposoban = niko.jesteKreditnoSposoban();

        if (jesteKreditnoSposoban){
            System.out.println("Zaposleni je kreditno sposoban");
        } else {
            System.out.println("Zaposleni nije kreditno sposoban");

        }

        niko.brojSlobodnihDana();

        brojSlobodnihDana = niko.brojSlobodnihDana();

        System.out.println("Zaposleni ima: " + brojSlobodnihDana + " slobodnih dana");

        System.out.println("---------------------------------------------------");

        Radnik nuko = new Radnik();

        nuko.jmbg = "34274782323748";
        nuko.imeIPrezime = "Nuko Nukovic";
        nuko.brojDece = 5;
        nuko.stepenSSpreme = 2;
        nuko.godineRadnogStaza = 7;

        minuliRad = nuko.minuliRad();

        System.out.println("Minuli rad zaposlenog je: " + minuliRad);

        nuko.koeficijentSlozenosti();

        koeficijentSlozenosti = nuko.koeficijentSlozenosti();

        System.out.println("Koeficijent slozenosti zaposlenog je: " + koeficijentSlozenosti);

        nuko.plata();

        plata = nuko.plata();

        System.out.println("Plata zaposlenog je: " + plata);

        nuko.jesteKreditnoSposoban();

        jesteKreditnoSposoban = nuko.jesteKreditnoSposoban();

        if (jesteKreditnoSposoban){
            System.out.println("Zaposleni je kreditno sposoban");
        } else {
            System.out.println("Zaposleni nije kreditno sposoban");

        }

        nuko.brojSlobodnihDana();

        brojSlobodnihDana = nuko.brojSlobodnihDana();

        System.out.println("Zaposleni ima: " + brojSlobodnihDana + " slobodnih dana");
    }
}

