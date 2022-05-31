package p30_05_2022;

import java.util.ArrayList;

public class InstagramImage {
        public ArrayList<InstagramTag> nizTagova = new ArrayList<>();
        public String dimenzijaSlike;
        public String putanja;


        public InstagramImage(String dimenzijaSlike, String putanja) {
            this.dimenzijaSlike = dimenzijaSlike;
            this.putanja = putanja;
        }


        public String getDimenzijaSlike() {
            return dimenzijaSlike;
        }

        public void setDimenzijaSlike(String dimenzijaSlike) {
            this.dimenzijaSlike = dimenzijaSlike;
        }

        public String getPutanja() {
            return putanja;
        }

        public void setPutanja(String putanja) {
            this.putanja = putanja;
        }

        public void dodajTag(InstagramTag instagramTag) {
            nizTagova.add(instagramTag);
        }
}
