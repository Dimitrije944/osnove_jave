package p23_05_2022;

public class FilmReziserMain {
    public static void main(String[] args) {
    Film film = new Film();

    film.setNazivFilma("Titanik");
    film.setGodinaSnimanja(1993);

    Reziser rezija = new Reziser();

    rezija.setImeIPrezime("Jovan Jovanovic");
    rezija.setStarost(56);

    film.setReziser(rezija);
    film.stampaj();

    }
}
