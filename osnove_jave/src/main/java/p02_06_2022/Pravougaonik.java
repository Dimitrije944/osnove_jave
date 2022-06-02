package p02_06_2022;

public class Pravougaonik extends Figura{
    //    Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//    stranice a i b
//    gettere/settere/konstruktore
//    implementira metodu povrsina
//    implementira metodu obim
//
//    U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika)
//    zatim sabrati sve povrsine i obime i za svaku figuru ispisati ponaosob
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double povrsina(double broj){
        return broj=a*b;

    }
    @Override
    public double obim(double b){
        return b = a*a + b*b;

    }
}
