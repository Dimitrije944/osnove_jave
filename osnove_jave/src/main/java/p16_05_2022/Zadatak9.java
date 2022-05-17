package p16_05_2022;

public class Zadatak9 {
//    Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
//1 - I
//2 - II
//3 - III
//4 - IV
//5 - V
//6 - VI
//7 - VII
//8 - VIII
//9 - IX
//10 - X
//    Kao parametar se unosi vrednost rimkog broja a vraca se arapski.
//    Ako se unese VIII vraca se 8.
//    VIII => 8

    public static void main(String[] args) {
        int a = konvertuj("I");
        System.out.println(a);
    }
    static int konvertuj(String rimski){
        if (rimski.equals("I")){
            return 1;
        }else if(rimski.equals("II")){
            return 2;
        }else if(rimski.equals("III")){
            return 3;
        }else if(rimski.equals("IV")){
            return 4;
        }else if(rimski.equals("V")){
            return 5;
        }else if(rimski.equals("VI")){
            return 6;
        }else if(rimski.equals("VII")){
            return 7;
        }else if(rimski.equals("VIII")){
            return 8;
        }else if(rimski.equals("IX")){
            return 9;
        }else if(rimski.equals("X")){
            return 10;
        }else{
            return 0;
        }
    }
}