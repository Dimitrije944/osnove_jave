package d23_05_2022;

public class Knjiga {
    private String iSBN;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga(String iSBN, String naziv, int godinaIzdanja, Autor autor) {
        this.iSBN = iSBN;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void stampa() {
        System.out.println(this.iSBN);
        System.out.println(this.naziv + " - " + this.godinaIzdanja);
        System.out.print("Autor: ");
        this.autor.stampa();
    }
}
