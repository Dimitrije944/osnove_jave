package d23_05_2022;

public class AutorKnjigaMain {
    public static void main(String[] args) {
        Autor pisac = new Autor("Dimitrije", "Petronijevic");
        Autor romanopisac = new Autor("Adam", "Darius");
        Knjiga Guru = new Knjiga("574", "The Guru", 1991, romanopisac);
        pisac.stampa();
        Guru.stampa();
    }
}
