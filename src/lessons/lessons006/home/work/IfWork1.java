package lessons.lessons006.home.work;


import java.util.Scanner;

//Ввести с клавиатуры 2 числа
//пользователю написать:
//какое число больше, а какое число меньше
//Пример:
// >> 22 55
// >> 55 больше
// >> 22 меньше
//сделать 2 реализации с помощью if и с помощью тернарного оператора (?:)
public class IfWork1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        int numberMax;
        int numberMin;
        int numberSmooth = 4;

        System.out.println("Введите 1 число");
        number1 = scanner.nextInt();
        System.out.println("Введите 2 число");
        number2 = scanner.nextInt();

        if (number2 == number1) {
            System.out.println( "Вы ввели 1 и тоже число " + number1 );
            return;
        }

        if(number1 > number2) {
            System.out.println("число " + number1 + " больше чем число " + number2 );
        } else {
            System.out.println("число " + number2 + " больше чем число " + number1);
        }

        numberMax = (number1 > number2 ? number1 : number2);
        numberMin = (number1 < number2 ? number1 : number2);

        System.out.println(numberMax + " больше");
        System.out.println(numberMin + " меньше");
        System.out.println(numberSmooth  + " вы ввели 1 и тоже число");

    }
}
