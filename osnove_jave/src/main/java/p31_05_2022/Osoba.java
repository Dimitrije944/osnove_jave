package p31_05_2022;

public class Osoba {
    protected String punoIme;
    protected String jmbg;

    public Osoba(String punoIme, String jmbg) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
    }

    public void stampaj() {
        System.out.println(this.punoIme + ", jmbg: " + this.jmbg);
    }

}
