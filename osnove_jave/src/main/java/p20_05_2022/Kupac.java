package p20_05_2022;

public class Kupac {
    //    Kreirati klasu Kupac koja ima:
//    ime i prezime
//    clansku kartu
//    gettere i settere, clanska karta ne moze da se menja
//            konstruktore
//    metodu stampaj koja stampa u formatu
//    ime i prezime - broj kartice
    private String imeIPrezime;
    private ClanskaKarta kartica;
    public Kupac(ClanskaKarta k){
        this.kartica=k;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKarta getKartica() {
        return kartica;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime + " - "+this.kartica.getBroj());
    }

}
