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
        int numberOne;
        int numberDuo;
        int numberMax;
        int numberMin;
        int numberSmooth = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число");
        numberOne = scanner.nextInt();
        System.out.println("Введите 2 число");
        numberDuo = scanner.nextInt();

        if(numberOne > numberDuo) {
            System.out.println("число " + numberOne + " больше чем число " + numberDuo );
        }else if (numberOne == numberDuo){
            System.out.println( " вы ввели 1 и тоже число " + numberOne );
        }else {
            System.out.println("число " + numberDuo + " больше чем число " + numberOne);
        }

        numberMax = (numberOne > numberDuo ? numberOne : numberDuo);

        numberMin = (numberOne < numberDuo ? numberOne : numberDuo);
        System.out.println(numberMax + " больше ");
        System.out.println(numberMin + " меньше ");
        System.out.println(numberSmooth  + " вы ввели 1 и тоже число ");



    }
}
