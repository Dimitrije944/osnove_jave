package p30_05_2022;

import java.util.ArrayList;

public class InstagramPost {
        private ArrayList<InstagramImage> nizSlika = new ArrayList<>();
        private String opis;


        public String getOpis() {
            return opis;
        }

        public void setOpis(String opis) {
            this.opis = opis;
        }

        public void dodajSliku(InstagramImage instagramImage) {
            nizSlika.add(instagramImage);
        }
}
