package d24_05_2022;

public class RacunTranskacijaMain {
    public static void main(String[] args) {

            Racun jedan = new Racun("250-1099434-00", "Dimitrije Petronijevic", 7000);

            Racun dva = new Racun("678-767777-99", "Ana Popovic", 300);


            jedan.menjajStanje(700);
            System.out.println(jedan.getTrenutnoStanje());
        }
    }
