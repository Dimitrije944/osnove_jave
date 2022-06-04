package p03_06_2022;

public class IcePoint extends Proizvod{

//    Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
//    tip sladoleda (vanila, cokolada)
//    atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
//    override uje metodu koja ukupnu cenu racuna:
//    ako je mali ice point na cenu svih dodataka doda 100
//    ako je veliki ice point cenu svih dodataka doda 130
//    override uje metodu stampaj da stampa sve podatke
    private String tip;
    private boolean daLiVelicina;

    public IcePoint(String tip, boolean daLiVelicina) {
        this.tip = tip;
        this.daLiVelicina = daLiVelicina;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public boolean isDaLiVelicina() {
        return daLiVelicina;
    }

    public void setDaLiVelicina(boolean daLiVelicina) {
        this.daLiVelicina = daLiVelicina;
    }

    @Override
    public double racunajCenu() {
        if (this.daLiVelicina) {
            return 100;
        } else {
            return 130;
        }
    }

    @Override
    public void stampaj() {
        System.out.println(this.tip + " "+ this.daLiVelicina);

    }
}
