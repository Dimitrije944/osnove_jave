package d31_05_2022;

public class Osoba {
//    Kreirati klasu Osoba koja ima:
//    ime i prezime
//            jmbg
//    godinu rodjenja
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere
//    metodu stampaj koja stampa u formatu:
//            (ime i prezime), (jmbg), (godina rodjenja)
protected String imeIprezime;
    protected String jmbg;
    protected int godinaRodjenja;

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public Osoba(String imeIprezime, String jmbg, int godinaRodjenja) {
        this.imeIprezime = imeIprezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public Osoba () {

    }
    public void stampaj () {
        System.out.println("Ime i prezime: " + imeIprezime);
        System.out.println("JMBG: " + jmbg);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
    }
}
