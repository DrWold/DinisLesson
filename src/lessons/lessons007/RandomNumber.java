package lessons.lessons007;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //int choose = scanner.nextInt();

        for (int i=0; i < 1000; i++) {
            int a = random.nextInt();
//            if (random.nextBoolean()) {
//                a *= -1;
//            }
            System.out.println((char) a);
            Thread.sleep(200);
        }
    }
}
