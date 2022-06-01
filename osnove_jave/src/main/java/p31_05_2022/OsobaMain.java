package p31_05_2022;

public class OsobaMain {
    public static void main(String[] args) {
        Profesor p = new Profesor("Milan",
                "2190239832092", "QA", 500000 );
        p.stampaj();
        p.povecajPlatu(10);
        p.stampaj();

        Student s = new Student("Pera Peric", "932903209230", "129023", 90000);
        s.stampaj();
        s.uplatiSkolarinu(10000);
        s.stampaj();
    }


    }
