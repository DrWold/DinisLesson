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

        System.out.println("Здраствуйте Добро пожаловать в казино ");
        System.out.println("ВНИМАНИЕ ИГРА СТОИТ 5 МАНЕТ ");

        do {

            System.out.println("у вас " + balance + " начать игру нажмите Y|N");

            answer = scanner.next().charAt(0);
            if (answer != 'Y' && answer != 'y') {
                return;
            }

            int randomNumber = random.nextInt(900) + 100;

            balance -= 5;

            System.out.println(randomNumber);

            if (randomNumber == 111 || randomNumber == 222 || randomNumber == 333 || randomNumber == 444 || randomNumber == 555 || randomNumber == 666 || randomNumber == 888 || randomNumber == 999) {
                System.out.println("вы выйграли Джекпот" + randomNumber);
                balance += 100;
            } else if (randomNumber == 777) {
                balance += 700;
                System.out.println(randomNumber);
            } else if (randomNumber % 10 == 5) {
                System.out.println("Вы выйграли 20 манет ");
                balance += 10;
            } else {
                System.out.println("вы проиграли ");

            }


        } while (true);


    }
}
