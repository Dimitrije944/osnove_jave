package p03_06_2022;

import java.util.ArrayList;

public class DodatakMain {
    public static void main(String[] args) {

        Dodatak dodatak = new Dodatak("Kecap", 50.0);
        IcePoint icePoint = new IcePoint("testo", true);

        Pica pica = new Pica(35.0);
        ArrayList<Proizvod> proizvodi = new ArrayList<>();
        proizvodi.add(new IcePoint("testo", true));
        proizvodi.add(new Pica(35.0));
        proizvodi.add(new IcePoint("secer", false));
        proizvodi.add(new IcePoint("kvasac", true));
        proizvodi.add(new Pica(45.0));
        for(int i=0; i <proizvodi.size(); i++){
            proizvodi.get(i).stampaj();
        }
    }
}
