package p24_05_2022;

public class ZoomCall {
//    Kreirati klasu ZoomCall koja ima:
//    link za poziv
//            password
//    korisnika koji je host
//    korisnika koji je guest
//    gettere za sve atribute
//    setter samo za guest-a
//    metodu pokreni poziv koja stampa podatke u formatu:
//    Zoom Call: url
//    Password: password
//    Host: ime i prezime
//    Guest: ime i prezime
//    Maksimalno trajanje poziva je (broj minuta)min
//
//    Maksimalno trajanje poziva se cita od korisnika koji je host!
//
//    U glavnom programu kreirati objekte definisanih klasa
//    i testirati rad definisanih funkcija
private String url;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall(String url, String password, Korisnik host) {
        this.url = url;
        this.password = password;
        this.host = host;
    }



    public String getUrl() {
        return url;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public void prokreniCall() {
        System.out.println("Zoom Call: " + this.url);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.host.getPunoIme());
        if (this.guest != null) {
            System.out.println("Guest: " + this.guest.getPunoIme());
        }
        System.out.print("Maksimalna duzina trajanja poziva je ");
        System.out.println(this.host.maximalnaDuzinaPoziva());
    }
}
