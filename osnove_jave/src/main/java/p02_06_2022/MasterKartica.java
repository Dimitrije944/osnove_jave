package p02_06_2022;

public class MasterKartica extends PlatnaKartica{
    public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }
    @Override
    public void izvrsiTransakciju(double iznos){
        double provizija = 1.5/100.0*iznos;
        this.suma = this.suma - iznos - provizija;
    }
    @Override
    public void stampaj(){
        System.out.println("MasterCard");
        System.out.println(this.mesec + this.godina+ ", $ " + this.suma + " , "+ this.brojKartice);
    }
    public void naplatiOdrzavanje(){
        this.suma-=2;
    }
}
