package p20_05_2022;

public class ClanskaKarta {
    //    Kreirati klasu ClanskaKarta koja ima:
//    popust (u rasponu od 5 do 10 %)
//    broj kartice (npr: 9329-0239)
//    gettere i setter
//    konstuktore
    private double popust;
    private String broj;
    public ClanskaKarta(){}
    public ClanskaKarta(double popust, String broj){
        this.popust = popust;
        this.broj = broj;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

}
