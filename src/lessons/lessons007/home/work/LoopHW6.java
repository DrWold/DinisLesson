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
        do {

            int kazino;;
            System.out.println("Здраствуйте чтоб сыграть в казино нажмите Y|N");
            System.out.println("ВНИМАНИЕ ИГРА СТОИТ 5 МАНЕТ У ВАС : " + balance);
            answer = scanner.next().charAt(0);
            balance -= 5;
            kazino = random.nextInt(900) + 100 ;

            if (kazino == 111 || kazino == 222 || kazino == 333 || kazino == 444 || kazino == 555 || kazino == 666 || kazino == 777 || kazino == 888 || kazino == 999 ){
                System.out.println("вы выйграли Джекпот" + kazino);
                balance += 100;
            }



        } while (answer == 'Y' || answer == 'y');



    }
}
