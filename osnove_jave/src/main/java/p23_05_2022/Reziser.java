package p23_05_2022;

public class Reziser {
//    Kreirati klasu Reziser koja ima:
//    ime i prezime rezisera
//    startost
//    konstruktore, gettere i settere koji su potrebni
//    metodu print koja stampa podatke u formatu
//    ime prezime, starost.god
//
//    U main metodi, kreirati jedan film i jednog rezisera
//    i pozvati svaku od metoda
    private String imeIPrezime;
    private int starost;
    public Reziser(){}
    public Reziser (String imeIPrezime, int starost){
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
    }
    public String getImeIPrezime(){
        return this.imeIPrezime;
    }
    public int getStarost(){
        return this.starost;
    }
    public void setImeIPrezime(String imeIPrezime){
        this.imeIPrezime = imeIPrezime;
    }
    public void setStarost(int starost) {
        this.starost = starost;
    }
    public void stampaj(){

        System.out.println( this.imeIPrezime + " " + this.starost);
    }
}
