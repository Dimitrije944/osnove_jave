public class vezba {
//    Napisati metodu koja stampa zvezdicu sa razmakom.
//    U glavnom programu je potrebno odstampati sledecu sliku:
//            * * * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *

    public static void main(String[] args) {
        for(int i=6; i>0; i--) {

            for (int j= 0; j < i ; j++) {
                zvezdica();
            }
            System.out.println(" ");
        }
    }
    static void zvezdica() {
        System.out.print("* ");
    }

}
