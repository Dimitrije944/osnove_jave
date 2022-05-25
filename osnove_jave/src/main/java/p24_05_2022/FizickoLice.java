package p24_05_2022;

public class FizickoLice {
//    Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//    ime i prezime
//    broj licne karte
//            jmbg
//    podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//    konstuktore
//    gettere i settere, jmbg ne sme da se menja
//    metodu stampaj, koja stmpa podatke u formatu:
//    ime i prezime, broj licne karte
private String punoIme;
    private String brLk;
    private String jmbg;
    private boolean vecKupovao;

    public FizickoLice(String jmbg) {
        this.jmbg = jmbg;
    }

    public FizickoLice(String punoIme, String brLk, String jmbg, boolean vecKupovao) {
        this.punoIme = punoIme;
        this.brLk = brLk;
        this.jmbg = jmbg;
        this.vecKupovao = vecKupovao;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getBrLk() {
        return brLk;
    }

    public void setBrLk(String brLk) {
        this.brLk = brLk;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isVecKupovao() {
        return vecKupovao;
    }

    public void setVecKupovao(boolean vecKupovao) {
        this.vecKupovao = vecKupovao;
    }

    public void stampaj() {
        System.out.println(
                String.format("Ime: %s, broj licne karte: %s", this.punoIme, this.brLk));
    }
}
