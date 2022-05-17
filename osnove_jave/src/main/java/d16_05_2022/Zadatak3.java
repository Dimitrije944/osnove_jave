package d16_05_2022;

public class Zadatak3{
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i
//        da li je aktivan kao parametre metode.
public static void main(String[] args) {
    stampa("2652352233", "Dimitrije", "Petronijevic", 1994, true);
}
static void stampa(String jmgb, String ime, String prezime, int godinaRodjenja, boolean aktivan){
    System.out.println("Jmbg: "+ jmgb);
    System.out.println("Ime: " + ime);
    System.out.println("Prezime: "+ prezime);
    System.out.println("God rodjenja: " + godinaRodjenja);
        if(aktivan){
            System.out.println("Aktivan");
        }else{
            System.out.println("Neaktivan");
        }
    }
}

