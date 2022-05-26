package d24_05_2022;

public class ZeleniKarton {
//    Zadatak
//    Kreirati klasu ZeleniKarton koja ima:
//    ime i prezime studenta
//    broj indeksa
//    naziv predmeta
//    ime i prezime profesora
//    ocenu - od 5 do 10
//    gettere i settere
//            konstruktore
//    metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//    metodu stampaj koja stampa podatke u formatu:
//            (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime
//
//    U glavnoj klasi:
//    kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite

    private String imeIPrezime;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String imeProfesora;
    private int ocena;

    public ZeleniKarton(String imeIPrezime, int brojIndeksa, String nazivPredmeta, String imeProfesora, int ocena) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeProfesora = imeProfesora;
        this.ocena = ocena;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean polozenIspit () {
        return ocena > 5;
    }
    public void stampaj () {
        System.out.println(nazivPredmeta + " " + ocena);
        System.out.println("Student: " + imeIPrezime + ", " + brojIndeksa);
        System.out.println("Profesor: " + imeProfesora);
    }

}
