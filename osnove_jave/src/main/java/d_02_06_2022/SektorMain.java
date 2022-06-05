package d_02_06_2022;

public class SektorMain {
    public static void main(String[] args) {
        Sektor upravni = new Sektor("Upravni", 63000);
        Sektor poreski = new Sektor("Poreski", 91000);
        Sektor poslovni = new Sektor("Poslovni", 50000);
        Sektor radnicki = new Sektor("Radnicki", 26000);

        Menadzer glavni = new Menadzer("Aca Ackovic");
        glavni.zaposliUSektor(upravni);
        glavni.zaposliUSektor(poreski);
        glavni.zaposliUSektor(poslovni);

        Magacioner dimitrije = new Magacioner("Dimitrije Petronijevic");
        dimitrije.zaposliUSektor(radnicki);
        dimitrije.zaposliUSektor(poreski);
        dimitrije.zaposliUSektor(upravni);


        System.out.println(glavni.plataRadnika());

        System.out.println(dimitrije.plataRadnika());




    }
}
