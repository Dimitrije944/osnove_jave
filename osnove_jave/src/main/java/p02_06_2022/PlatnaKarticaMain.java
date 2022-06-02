package p02_06_2022;

public class PlatnaKarticaMain {
    public static void main(String[] args) {
        VisaKartica visa = new VisaKartica(1000, "2424", 2010, 5, "Dusan");
        visa.dodajSredstva(200);
        visa.izvrsiTransakciju(150);
        visa.stampaj();

        MasterKartica master = new MasterKartica(2000, "4254", 2020, 7);
        master.dodajSredstva(100);
        master.izvrsiTransakciju(200);
        master.naplatiOdrzavanje();
        master.stampaj();
    }
}
