package lessons.lessons007;

public class Loops6 {
    public static void main(String[] args) {

        //Вложенный цикл
//        for (int i=0; i<10; i++) {
//            for (int j=0; j<10; j++) {
//                System.out.println(i + " : " + j);
//            }
//        }


        for (int i=0; i<10; i++) {
            // i = 0; 1
            // i = 1; 2
            // i = 2; 3
            // i = 3; 4
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
