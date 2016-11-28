package lessons.lessons007.home.work;

import java.util.Random;
import java.util.Scanner;

// Игра казино-автомат
// У пользователя 1000 рублей
// Пользователю предлагается сделать ход, он должен выбрать Y или N
// Стоимость хода 5 рублей
// Генерируется рандомное число от 100 до 999
// Если число состоит из одинаковых цифр : 111,222,333,444,555,666,...,999 - польхователь выигрывает 100 рублей
// Если 777 - 500 рублей
// Если в числе последняя цифра 5, он выигрывает 20 рублей(чтобы узнать посл. цифру чимсла можно разделить с остатком на 10 : 234 % 10 = 4)
// Иначе он проиграл
public class LoopHW6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int balance = 1000;
        char answer;

        System.out.println("**************** Казино-Автомат ****************");
        System.out.println("Цена одной игры 5 рублей!");

        do {

            System.out.println("Ваш баланс: " + balance);
            System.out.println("Начать игру нажмите (Y/N)");

            answer = scanner.next().charAt(0);
            if (answer != 'Y' && answer != 'y') {
                return;
            }

            if (balance < 5) {
                System.out.println("Вы банкрот!");
                return;
            }

            balance -= 5; // цена одной игры

            // (0...899) + 100 = (100...999)
            int randomNumber = random.nextInt(900) + 100; // 100...999
            System.out.println("Сгенерированное число : " + randomNumber);

            if (randomNumber == 111 || randomNumber == 222 || randomNumber == 333 || randomNumber == 444 || randomNumber == 555 || randomNumber == 666 || randomNumber == 888 || randomNumber == 999) {
                System.out.println("Вы выйграли крупную сумму");
                balance += 100;
            } else if (randomNumber == 777) {
                System.out.println("Вы сорвали джекпот");
                balance += 700;
            } else if (randomNumber % 10 == 5) {
                System.out.println("Вы выйграли 20 манет");
                balance += 20;
            } else {
                System.out.println("Вы проиграли");
            }


        } while (true);


    }
}
