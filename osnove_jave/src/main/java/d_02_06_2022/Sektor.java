package d_02_06_2022;

public class Sektor {
//    Zadatak
//    Kreirati klasu Sektor koja ima:
//    naziv sektora
//    platu koja je za taj sektor
private String nazivSektora;
    private double plataSektora;

    public Sektor(String nazivSektora, double plataSektora) {
        this.nazivSektora = nazivSektora;
        this.plataSektora = plataSektora;
    }

    public String getNazivSektora() {
        return nazivSektora;
    }

    public void setNazivSektora(String nazivSektora) {
        this.nazivSektora = nazivSektora;
    }

    public double getPlataSektora() {
        return plataSektora;
    }

    public void setPlataSektora(double plataSektora) {
        this.plataSektora = plataSektora;
    }
}
