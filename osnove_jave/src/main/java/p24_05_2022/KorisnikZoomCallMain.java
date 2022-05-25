package p24_05_2022;

public class KorisnikZoomCallMain {
    public static void main(String[] args) {
            Korisnik milan = new Korisnik("Milan Jovanovnic");
            milan.pretplatiSe(100);

            Korisnik nikola = new Korisnik("Nikola NIkolic");
            nikola.pretplatiSe(150);


            ZoomCall call = new ZoomCall(
                    "https://us02web.zoom.us/j/84190261301",
                    "1212332",
                    milan);
//        call.setGuest(nikola);
            call.prokreniCall();

            String x= String.format("%s je %s i %s je %s", "xx", "1", "39", 2);
            System.out.println(x);
        }
    }
