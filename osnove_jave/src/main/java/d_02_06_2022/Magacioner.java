package d_02_06_2022;

public class Magacioner extends Radnik{
//    Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//    ima privatnu metodu koja racuna prosecnu platu za sektore
//    u kojima radi radnik kao:
//    suma plata svih sektor / broj sektora * 0.5
//    override uje metodu za platu, tako da se plata racuna po formuli:
//            (prosecna plata za sve sektore u kojima radi) * (broj sektora).
public Magacioner(String punoIme) {
    super(punoIme);
}

    private double prosecnaPlataSektora() {
        double plataSvihSektora = 0;
        for (int i = 0; i < this.sektori.size(); i++) {
            plataSvihSektora += this.sektori.get(i).getPlataSektora();
        }
        return plataSvihSektora / this.sektori.size() * 0.5;
    }

    @Override
    public double plataRadnika() {
        return prosecnaPlataSektora() * this.sektori.size();
    }


}
