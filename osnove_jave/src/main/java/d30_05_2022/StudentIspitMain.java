package d30_05_2022;

public class StudentIspitMain {
    public static void main(String[] args) {
        Ispit istorija = new Ispit("Istorija", 10, "Dimitrije Petronjevic");
        Ispit math = new Ispit("Matematika", 6, "Dragan Radosavljevic");
        Ispit usmeno = new Ispit();
        usmeno.setNazivPredmeta("Usmeno ispitivanje");
        usmeno.setOcena(8);
        usmeno.setPunoImeProfesora("Marko Miskovic");
        Ispit tema = new Ispit("Opsta kultura", 5, "Simon Simic");


        Student ana = new Student("50/2022", "Ana Stojanovic", "doktorske");
        ana.dodajIspit(istorija);
        ana.dodajIspit(math);
        ana.dodajIspit(usmeno);
        ana.dodajIspit(tema);
        ana.print();

    }
}
