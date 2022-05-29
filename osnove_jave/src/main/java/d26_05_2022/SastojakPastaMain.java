package d26_05_2022;

public class SastojakPastaMain {
    public static void main(String[] args) {
        Sastojak kecap = new Sastojak("Kecap", 30);
        Sastojak majonez = new Sastojak("Majonez", 40);
        Sastojak pavlaka = new Sastojak("Pavlaka", 30);

        Pasta testenina = new Pasta();

        testenina.dodajSastojak(kecap);
        testenina.dodajSastojak(majonez);
        testenina.dodajSastojak(pavlaka);

        testenina.stampa();
        testenina.brisanjeSastojaka("Kecap");
        testenina.stampa();


    }
}
