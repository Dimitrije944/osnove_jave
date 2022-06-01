package p31_05_2022;

public class Profesor extends Osoba {
    private String predmet;
    private int plata;

    public Profesor(String punoIme, String jmbg, String predmet, int plata) {
        super(punoIme, jmbg);
        this.plata = plata;
        this.predmet = predmet;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Predmet: " + this.predmet);
        System.out.println("Plata: " + this.plata);
    }

    public void povecajPlatu(int procenat) {
        this.plata = this.plata * (100 + procenat) / 100;
    }


}
