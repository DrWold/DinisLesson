package lessons.lessons009.home.work;

import java.util.Scanner;

//В массив с клавиатуры пользователь-менеджер вводит продажи за год, за каждый месяц в рублях, массив строго равен 12 элементам.
//        Написать название месяца с самыми низкими продажами
//        Написать название месяца с самыми высокими продажами
//        Вывести название месяцев за которые сумма продаж больше чем 10_000 руб.
public class ArrayHW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mothMoney = new int[12];
        int month;
        for (int i = 0; i < mothMoney.length; i++) {
            month = +i;
            switch (month) {
                case 0:
                    System.out.println("Введите прибыль за январь");
                    mothMoney[i] = scanner.nextInt();
                    break;
                case 1:
                    System.out.println("Введите прибыль за февраль");
                    mothMoney[i] = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Введите прибыль за март");
                    mothMoney[i] = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Введите прибыль за апрель");
                    mothMoney[i] = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Введите прибыль за май");
                    mothMoney[i] = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Введите прибыль за июнь");
                    mothMoney[i] = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Введите прибыль за июль");
                    mothMoney[i] = scanner.nextInt();
                    break;
                case 7:
                    System.out.println("Введите прибыль за август");
                    mothMoney[i] = scanner.nextInt();
                    break;
                case 8:
                    System.out.println("Введите прибыль за сентябрь");
                    mothMoney[i] = scanner.nextInt();
                    break;
                case 9:
                    System.out.println("Введите прибыль за октябрь");
                    mothMoney[i] = scanner.nextInt();
                    break;
                case 10:
                    System.out.println("Введите прибыль за ноябрь");
                    mothMoney[i] = scanner.nextInt();
                    break;
                case 11:
                    System.out.println("Введите прибыль за декабрь");
                    mothMoney[i] = scanner.nextInt();
                    break;

            }
        }
    }
}
