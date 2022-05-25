package p24_05_2022;

public class UgovorMain {
    public static void main(String[] args) {
        FizickoLice milan = new FizickoLice(
                "Milan Jovanovic",
                "002383221",
                "19282383289223",
                false);

        FizickoLice dragan = new FizickoLice(
                "Dragan Jovanovic",
                "002383239023",
                "19284390439223",
                true);

        Ugovor ugovor = new Ugovor(
                "24.05.2022.",
                milan, dragan,
                50000,
                "Nikole Pasica" );

        ugovor.stampajUgovor();
    }
}
