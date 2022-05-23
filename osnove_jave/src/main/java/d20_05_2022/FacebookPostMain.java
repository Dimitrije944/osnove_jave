package d20_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {
        FacebookPost post1 = new FacebookPost();
        post1.userPosted = "Dimitrije Petronijevic";
        post1.userPostPublished = "Petar Dimitrijevic";
        post1.text = "Srecan put!";
        for (int i = 0; i <150 ; i++) {
            post1.like();
        }
        for (int i = 0; i < 15; i++) {
            post1.share();
        }
        for (int i = 0; i <10 ; i++) {
            post1.dislikes();
        }
        post1.print();
        System.out.println();

        FacebookPost post2 = new FacebookPost();
        post2.userPosted = "Petar Dimitrijevic";
        post2.userPostPublished = "Dimitrije Petronijevic";
        post2.text = "Hvala!";
        for (int i = 0; i <110 ; i++) {
            post2.like();
        }
        for (int i = 0; i < 12; i++) {
            post2.share();
        }
        for (int i = 0; i <5 ; i++) {
            post2.dislikes();
        }
        post2.print();

    }

}
