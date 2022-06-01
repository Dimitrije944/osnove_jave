package p31_05_2022;

public class Student extends Osoba {
    private String index;
    private int dug;

    public Student(String punoIme, String jmbg, String index, int dug) {
        super(punoIme, jmbg);
        this.index = index;
        this.dug = dug;
    }

    @Override
    public void stampaj() {
        System.out.println("Student " + this.punoIme + ", " + this.index);
        System.out.println("Dug: " + this.dug);
        System.out.println("Jmbg" + this.jmbg);
    }

    public void uplatiSkolarinu(int iznos) {
        this.dug = this.dug - iznos;
        if (this.dug < 0 ) {
            this.dug = 0;
        }
    }
}
