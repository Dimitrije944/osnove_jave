package p02_06_2022;

import java.util.ArrayList;

public class FiguraMain {
    public static void main(String[] args) {
//        Figura j = new JednakostranicniTrougao(5);
//        Figura p = new Pravougaonik(5,5);
//        j.obim(5);
//        j.povrsina(6);
//        p.povrsina(5);
//        p.obim(6);
        ArrayList<Figura> figure = new ArrayList<>();
        figure.add(new JednakostranicniTrougao(5));
        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
        }
        figure.add(new Pravougaonik(5, 5));
        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();

        }
    }
}
