package lessons.lessons010.home.work;

import java.util.Scanner;

/**
 * Created by Gordon on 21.12.2016.
 */
public class StringsHW6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца на русском");
        String text = scanner.next();
        String registr = text.toLowerCase();
        switch (registr){
            case "январь" :
                System.out.println("1 Месяц");
                break;
            case "февраль" :
                System.out.println("2 Месяц");
                break;
            case "март" :
                System.out.println("3 Месяц");
                break;
            case "апрель" :
                System.out.println("4 Месяц");
                break;
            case "май" :
                System.out.println("5 Месяц");
                break;
            case "июнь" :
                System.out.println("6 Месяц");
                break;
            case "июль" :
                System.out.println("7 Месяц");
                break;
            case "август" :
                System.out.println("8  Месяц");
                break;
            case "сентябрь" :
                System.out.println("9  Месяц");
                break;
            case "октябрь" :
                System.out.println("10 Месяц");
                break;
            case "ноябрь" :
                System.out.println("11 Месяц");
                break;
            case "декабрь" :
                System.out.println("12  Месяц");
                break;
                default:
                    System.out.println("Вы ввели не корректный месяц");
        }
    }
}
