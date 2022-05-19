//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Loto {
//    public static void main(String[] args) {
//        ArrayList<Integer> igrano = new ArrayList<Integer>();
//        igrano.addAll(Arrays.asList(1, 2, 3, 45, 31, 12, 5));
//        ArrayList<Integer> izvuceno = new ArrayList<Integer>();
//        izvuceno.addAll(Arrays.asList(3, 2, 1, 31, 45, 12, 5));
//        int uslovPetlje = 0;
//        for (int i = 0; i < igrano.size(); i++) {
//            if (uporedjivanje(igrano.get(i), izvuceno)) {
//                uslovPetlje++;
//            } else {
//                uslovPetlje = 0;
//            }
//        }
//        if (uslovPetlje == igrano.size()) {
//            System.out.println("Ovo je dobitna kombinacija");
//        } else {
//            System.out.println("Kombinacija nije dobitna");
//        }
//    }
//
//    static boolean uporedjivanje(int igran, ArrayList<Integer> izvucen) {
//        boolean uporedi = false;
//        for (int i = 0; i < izvucen.size(); i++) {
//            if (igran == izvucen.get()) {
//                return uporedi = true;
//            }
//        }
//        return false;
//    }
//}
//
