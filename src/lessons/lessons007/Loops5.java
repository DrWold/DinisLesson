package lessons.lessons007;

public class Loops5 {

    public static void main(String[] args) {

//        for (int i=0; i<20; i++) {
//            if (i == 13) {
//                break;
//            }
//            System.out.println("i : " + i);
//        }
        for (int i=0; i<20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i : " + i);
        }


        System.out.println("Выхфодим из программы");
    }

}
