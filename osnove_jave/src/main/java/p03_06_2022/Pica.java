package p03_06_2022;

public class Pica extends Proizvod{
//    Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
//    cena podloge
//    override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda
//    i cenu podloge
//    override uje metodu stampaj da stampa sve podatke
//
//    U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice.
//    Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.
    private double cenaPodloge;

    public double getCenaPodloge() {
        return cenaPodloge;
    }

    public void setCenaPodloge(double cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    public Pica(double cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public double racunajCenu() {
        return racunajCenu() + this.cenaPodloge;
    }

    @Override
    public void stampaj() {
        System.out.println(this.cenaPodloge);

    }
}
