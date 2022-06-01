package p31_05_2022;

public class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected int godina;
    protected int mesec;

    public double getSuma() {
        return suma;
    }
    public String getBrojKartice() {
        return brojKartice;
    }
    public int getGodina() {
        return godina;
    }
    public int getMesec() {
        return mesec;
    }

    public PlatnaKartica(double suma, String brojKartice, int godina, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    public void dodajSredstva(double iznos) {
        this.suma += iznos; // this.suma = this.suma + iznos;
    }

    public void izvrsiTransakciju(double iznos) {
        this.suma -= iznos;
    }

    public void stampaj() {
        System.out.println(this.brojKartice + "$" + this.suma);
    }

}
