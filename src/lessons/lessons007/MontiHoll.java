package lessons.lessons007;

import java.util.Random;

public class MontiHoll {
    public static void main(String[] args) {

        Random random = new Random();

        int money;
        int choise;

        int winCount = 0;
        int COUNT = 1000_000;

        for (int i = 0; i < COUNT; i++) {

            money = random.nextInt(3); // 0..2
            choise = random.nextInt(3); // 0..2

            if (money == choise) {
                winCount++;
            }
        }

        System.out.println("Процент выиграша если не меняли выбор: " + ((((double)winCount)/COUNT) * 100.0) + " %");

        winCount = 0;

        for (int i = 0; i < COUNT; i++) {

            money = random.nextInt(3); // 0..2
            choise = random.nextInt(3); // 0..2
            for (int j=0; j<3; j++) {
                if (j != choise && j != money) { //открыть пустую коробку которую ты не выбрал
                    if (choise != money) { //поменять
                        winCount++;
                    }
                }
            }
        }

        System.out.println("Процент выиграша если выбор поменяли : " + ((((double)winCount)/COUNT) * 100.0) + " %");

    }
}
