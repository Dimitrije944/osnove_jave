package p18_05_2022;

public class MainSlackMessage {
    public static void main(String[] args) {
        SlackMessage first = new SlackMessage();
        first.text = "Zdravo ljudi";
        first.author = "Milan Jovanovic";
        first.date = "26.08.2021 18:55";

        SlackMessage second = new SlackMessage();
        second.text = "Srecno svima";
        second.author = "Milan Jovanovic";
        second.date = "26.08.2021 20:55";

        System.out.println(first.author + " - " + first.date);
        System.out.println(first.text);

        System.out.println();
        System.out.println(second.author + " - " + second.date);
        System.out.println(second.text);
    }
}
