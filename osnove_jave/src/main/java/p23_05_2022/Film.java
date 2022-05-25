package p23_05_2022;

public class Film {
//    Zadatak
//    Kreirati klasu Film koja ima:
//    naziv filma
//    iz koje godine je film
//    konstruktore, gettere i settere koji su potrebni
//    metodu print koja stampa podatke u formatu
//    naziv filma, godina
    private String nazivFilma;
    private int godinaSnimanja;
    private Reziser reziser;
    public Film(){

    }
    public Film(String nazivFilma, int godinaSnimanja){
        this.nazivFilma = nazivFilma;
        this.godinaSnimanja = godinaSnimanja;
    }
    public void setNazivFilma(String nazivFilma)
    {
        this.nazivFilma = nazivFilma;
    }
    public String getNazivFilma(){
        return this.nazivFilma;
    }
    public int getGodinaSnimanja(){
        return this.godinaSnimanja;
    }
    public void setGodinaSnimanja(int godinaSnimanja) {

        this.godinaSnimanja = godinaSnimanja;
    }
    public Reziser getReziser(){
        return this.reziser;
    }

    public void setReziser(Reziser reziser) {
        this.reziser = reziser;
    }

    public void stampaj(){

        System.out.println( this.nazivFilma + " " + this.godinaSnimanja);
        System.out.println("Rezirao ga je ");
        this.reziser.stampaj();
    }
    }
