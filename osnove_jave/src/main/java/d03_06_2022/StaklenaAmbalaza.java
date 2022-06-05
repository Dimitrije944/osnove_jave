package d03_06_2022;

public class StaklenaAmbalaza extends Ambalaza{
//    Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//    kaucija za flasu
//    atribut koji kaze da li se za flasu placa kaucija
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu
//    ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//    ako se ne placa, (osnovna cena) * 1.2
//    metoda stampaj stampa sve podatke iz klase staklena flasa.
private int kaucija;
    private boolean saKaucijom;
    private int osnovnaCena;

    public StaklenaAmbalaza(String barKod, String nazivArtikla, int tezina, int brutoTezina, int kaucija, boolean saKaucijom, int osnovnaCena) {
        super(barKod, nazivArtikla, tezina, brutoTezina);
        this.kaucija = kaucija;
        this.saKaucijom = saKaucijom;
        this.osnovnaCena = osnovnaCena;
    }

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isSaKaucijom() {
        return saKaucijom;
    }

    public void setSaKaucijom(boolean saKaucijom) {
        this.saKaucijom = saKaucijom;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        //ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
        //ako se ne placa, (osnovna cena) * 1.2

        return isSaKaucijom() ? osnovnaCena * 1.2 + kaucija : osnovnaCena * 1.2;
    }

    @Override
    public void stampaj() {
        System.out.println("Naziv artikla: " + nazivArtikla);
        System.out.println("Osnovna cena: " + osnovnaCena);
        System.out.println("Bar kod: " + barKod);
        System.out.println("Neto tezina: " + tezina);
        System.out.println("Bruto tezina: " + brutoTezina);
        System.out.println("Da li je potrebna kaucija: " + saKaucijom);
        System.out.println("Krajnja cena artikla: " + cenaArtikla());

    }


}
