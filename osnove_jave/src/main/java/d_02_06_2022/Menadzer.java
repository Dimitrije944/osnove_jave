package d_02_06_2022;

public class Menadzer extends Radnik{
//    Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//    override uje metodu za platu.
//    Plata se racuna kao suma svih plata po sektorima.
public Menadzer(String punoIme) {
    super(punoIme);
}

    @Override
    public double plataRadnika() {
        double plata = 0;
        for (int i = 0; i < sektori.size() ; i++) {
            plata += sektori.get(i).getPlataSektora();
        }
        return plata;
    }

}