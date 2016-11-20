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
        int resultTest; // память для записи выбора опции
        int numberMin; // Для вычесление 2 опцией (вычесление тернарным оператором)
        int numberMax; // Для вычесление 2 опцией (вычесление тернарным оператором)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число");
        numberOne = scanner.nextInt();
        System.out.println("Введите 2 число");
        numberDuo = scanner.nextInt();
        System.out.println("Выберите опцию 1 или 2 если желайте выйти Введите exit либа просто нажмите enter");
        resultTest = scanner.nextInt();

        if(resultTest == 1) {
            resultTest = numberOne;
            System.out.println("число " + numberOne + " больше чем число " + numberDuo );
        }else if (resultTest == 2){
            numberMax = (numberOne > numberDuo ? numberOne : numberDuo);
            numberMin = (numberOne < numberDuo ? numberOne : numberDuo);
            System.out.println(numberMax + "больше");
            System.out.println(numberMin + "меньше");




        }else {
            System.out.println("благодарим за использованием программы");
        }




    }
}
