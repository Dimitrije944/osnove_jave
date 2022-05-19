package d18_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {
        SmartAirConditioning prva = new SmartAirConditioning();
        prva.marka = "Samsung";
        prva.temperatura = 25;
        prva.mod = "hladi";

        System.out.println("Najbolja klima za leto je " + prva.marka + " klima");
        System.out.println("Na temperaturi " + prva.temperatura + " najbolje " + prva.mod);
        System.out.println();

        SmartAirConditioning druga = new SmartAirConditioning();
        druga.marka = "Galenz";
        druga.temperatura = 16;
        druga.mod = "greje";

        System.out.println("Najbolja klima za zimu je " + druga.marka + " klima");
        System.out.println("Na temperaturi " + druga.temperatura + " najbolje " + druga.mod);
    }
}
