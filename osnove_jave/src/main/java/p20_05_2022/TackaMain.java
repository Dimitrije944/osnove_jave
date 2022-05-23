package p20_05_2022;

public class TackaMain {
    public static void main(String[] args) {
        Tacka a = new Tacka();
        a.x = 3;
        a.y = 2;
        a.stampaj();

        Tacka b = new Tacka(4, 1);
        b.stampaj();

    }
}
