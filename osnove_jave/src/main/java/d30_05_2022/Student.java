package d30_05_2022;

import java.util.ArrayList;

public class Student {
//    Napisati klasu Student koja ima
//    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za indeks, ime i prezime, tip studija
//    getter za niz predmeta
//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//            (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)
//
//
//    Napisati klasu Ispit koja ima
//    naziv predmeta
//    ocenu (u rasponu od 5 do 10)
//    Ime i prezime profesora koji predaje predmet
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za sve atribute
//    metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    metodu koja stampa ispit u formatu:
//            (naziv predmeta) - (profesor) - (ocena)

    private String brIndex;
    private String punoIme;
    private String tipStudia;
    private ArrayList<Ispit> ispiti = new ArrayList<>();


    public Student() {
    }

    public Student(String brIndex, String punoIme, String tipStudia) {
        this.brIndex = brIndex;
        this.punoIme = punoIme;
        this.tipStudia = tipStudia;
    }

    public String getBrIndex() {
        return this.brIndex;
    }

    public void setBrIndex(String brIndex) {
        this.brIndex = brIndex;
    }

    public String getPunoIme() {
        return this.punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipStudia() {
        return this.tipStudia;
    }

    public void setTipStudia(String tipStudia) {
        this.tipStudia = tipStudia;
    }

    public ArrayList<Ispit> getIspiti() {
        return this.ispiti;
    }

    public void dodajIspit(Ispit ispit) {
        this.ispiti.add(ispit);
    }

    private double prosekNaStudijama() {
        double suma = 0;
        int counter = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).daLiJeIspitPolozen()) {
                suma = suma + this.ispiti.get(i).getOcena();
                counter++;
            }
        }
        return suma / counter;
    }

    public void print() {
        System.out.println(this.brIndex + " - " + this.punoIme + " - " + this.tipStudia);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size() ; i++) {
            this.ispiti.get(i).print();

        }
        System.out.println("Prosecna ocena: " + prosekNaStudijama());
    }

}
