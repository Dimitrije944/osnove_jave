package d18_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
        Proizvod artikl = new Proizvod();
        artikl.naziv = "Sladoled";
        artikl.cena = 99.9;
        artikl.tezina = 49.9;

        System.out.print(artikl.naziv + ", " + artikl.cena + ", ");
        System.out.println(artikl.tezina + " grama");

        Proizvod pakovanje = new Proizvod();
        pakovanje.naziv = "Pirinac";
        pakovanje.cena = 69.9;
        pakovanje.tezina = 499.9;

        System.out.print(pakovanje.naziv + ", " + pakovanje.cena + ", ");
        System.out.println(pakovanje.tezina + " grama");


    }
}
