package p19_05_2022;

public class Auto {
//    Kreirati klasu Auto koja ima:
//    ime i prezime vozaca
//    marku automobila
//    broj vrata
//    potrosnju na 100km (npr: 10)
//    trenutnu brzinu kojom se auto krece
//    metodu za stampu koja stampa podatke u formatu:
//            [Vozac]
//            [Marka] - [br vrata]-ro vrata
//    Sa potrosnjom od [potrosnja] l na 100km
//	[Trenutna brzina auta] km/h je trenutna brzina.
//
//    Primer:
//    Milan Jovanovic
//    BMW - 5-ro vrata
//    Sa potrosnjom od 10 l na 100km
//	200 km/h je trenutna brzina

//    (Dopuna 2)
//    U okviru klase Auto, implementirati jos 2 metode:
//    metoda koja vraca informaciju da li je vozac prekoracio brzinu.
//    Kao parametar metode se prima ogranicenje (kao broj)
//    a metoda vraca true ili false ako je trenutna brzina veca od ogranicenja.
//    metoda koja vraca visinu novcane kazne za prekoracenje,
//    za svaku jedinicu prekoracenja placa se 1000din.
//    Metoda od parametara prima ogranicenje brzine
//    U glavnom programu pozvati ove metode
//    i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.

//    (Dopuna 3)
//    Dopuniti klasu Auto tako da ima:
//    atribut broj registracije
//    da li je ukljucena klima u autu
//    metodu dodajGas, koja povecava trenutnu brzinu za 10.
//    metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//    metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//    faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//            (trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime

//    Dopuniti klasu Auto tako da ima:
//    atribut godinu proizvodnje
//    atribut mesec do kad je registrovan auto (int)
//    atribut kubikaza auta (npr: 1600 - 5000)
//    metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//    metodu koja vraca da li je istekla registracije.
//    Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
//    metodu koja racuna i vraca cenu registracije za auto.
//    Za automobile do 2000 kubika cena registracije kubikaza * 100din,
//    za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.




    public String vlasnik;
    public String marka;
    public int broj;
    public int potrosnja;
    public int brzina;
    public String registarcija;
    public boolean daLiJeUkljucenaKlima;
    public int godinaProizvodnje;
    public int registrovanDo;
    public double kubikaza;
    public double kapacitetRezervoara;
    public double trenutnoURezervoaru;

    public void stampa() {
        System.out.println(this.vlasnik);
        System.out.print(this.marka + " - " + this.broj);
        System.out.println("-ro vrata " + "sa potrosnjom od " + this.potrosnja + "l na 100km");
        System.out.println(this.brzina + " km/h je trenutna brzina");
        System.out.println("Registracija "+ this.registarcija);
    }

    public boolean prekoracenje (int ogranicenje){
     return this.brzina > ogranicenje;
   }
   public int kazna(int ogranicenje){
        if(this.prekoracenje(ogranicenje)){
            return (brzina - ogranicenje) * 1000;
        }
        return 0;
   }
   public void dodajGas(){
        this.brzina = this.brzina + 10;
   }
   public void koci(){
        this.brzina = this.brzina - 10;
        if(this.brzina < 0){
            this.brzina = 0;
        }
    }
    public double trenutnaPotrosnja(){
        if(this.daLiJeUkljucenaKlima){
            return this.brzina / 100.0 * this.potrosnja * 1.2;
        }
        return this.brzina / 100.0 * this.potrosnja * 1.0;
    }
    public boolean oldTimer( ) {
        return  godinaProizvodnje < 1950;
    }
     public boolean isteklaRegistracija ( int trenutniMesec){
           return trenutniMesec > registrovanDo;
        }
        public  double cenaRegistacije ( ){
        if ( kubikaza < 2000 ){
            return this.kubikaza * 100;
        }
        return this.kubikaza * 100 * 1.3;
        }
        public double natociGorivo(double kolicina){
        if(trenutnoURezervoaru + kolicina <= kapacitetRezervoara){
            return kolicina * 170;
        }else{
            return kapacitetRezervoara - trenutnoURezervoaru * 170;
        }
        }

   }
