package d03_06_2022;

public class SuperKartica {
//    Kreirati klasu SuperKartica koja ima:
//    broj kartice
//    ime i prezime vlasnika
//    popust (200, 500, … )
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere
//    metodu stampaj koja stampa karticu u formatu:
//            (broj kartice), (ime i prezime
private String brKartice;
    private String imeIprezime;
    private int popust;

    public String getBrKartice() {
        return brKartice;
    }

    public void setBrKartice(String brKartice) {
        this.brKartice = brKartice;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public SuperKartica() {
    }

    public SuperKartica(String brKartice, String imeIprezime, int popust) {
        this.brKartice = brKartice;
        this.imeIprezime = imeIprezime;
        this.popust = popust;
    }

    public void stampaKartica() {
        System.out.println("Br. kartice:" + brKartice);
        System.out.println("Ime i prezime:" + imeIprezime);
    }

}
