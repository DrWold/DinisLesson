package lessons.lessons009.home.work;

import java.util.Scanner;

//В массив с клавиатуры пользователь-менеджер вводит продажи за год, за каждый месяц в рублях, массив строго равен 12 элементам.
//        Написать название месяца с самыми низкими продажами
//        Написать название месяца с самыми высокими продажами
//        Вывести название месяцев за которые сумма продаж больше чем 10_000 руб.
public class ArrayHW3 {

   public static void printMonth(int index){
       switch (index) {
           case 1:
               System.out.println("Январь");
               break;
           case 2:
               System.out.println("Февраль");
               break;
           case 3:
               System.out.println("Март");
               break;
           case 4:
               System.out.println("Апрель");
               break;
           case 5:
               System.out.println("Май");
               break;
           case 6:
               System.out.println("Июнь");
               break;
           case 7:
               System.out.println("Июль");
               break;
           case 8:
               System.out.println("Август");
               break;
           case 9:
               System.out.println("Сентябрь");
               break;
           case 10:
               System.out.println("Октябрь");
               break;
           case 11:
               System.out.println("Ноябрь");
               break;
           case 12:
               System.out.println("Декабрь");
               break;

       }

   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] monthMoney = new int[12];

        for (int month = 0; month < monthMoney.length; month++) {

            switch (month) {
                case 0:
                    System.out.println("Введите прибыль за январь");
                    monthMoney[month] = scanner.nextInt();
                    break;
                case 1:
                    System.out.println("Введите прибыль за февраль");
                    monthMoney[month] = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Введите прибыль за март");
                    monthMoney[month] = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Введите прибыль за апрель");
                    monthMoney[month] = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Введите прибыль за май");
                    monthMoney[month] = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Введите прибыль за июнь");
                    monthMoney[month] = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Введите прибыль за июль");
                    monthMoney[month] = scanner.nextInt();
                    break;
                case 7:
                    System.out.println("Введите прибыль за август");
                    monthMoney[month] = scanner.nextInt();
                    break;
                case 8:
                    System.out.println("Введите прибыль за сентябрь");
                    monthMoney[month] = scanner.nextInt();
                    break;
                case 9:
                    System.out.println("Введите прибыль за октябрь");
                    monthMoney[month] = scanner.nextInt();
                    break;
                case 10:
                    System.out.println("Введите прибыль за ноябрь");
                    monthMoney[month] = scanner.nextInt();
                    break;
                case 11:
                    System.out.println("Введите прибыль за декабрь");
                    monthMoney[month] = scanner.nextInt();
                    break;

            }
        }
        int min = monthMoney[0];
        int max = monthMoney[0]; // 5 6 4 8 3
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i <monthMoney.length ; i++) {
            if (min > monthMoney[i]) {
                min = monthMoney[i];
                indexMin = i;
            }

            if (max < monthMoney[i]){
                max = monthMoney[i];
                indexMax = i;
            }
            if (monthMoney[i] >= 10_000){
                System.out.println("За этот месяц прибыль больше 10_000 :");
                printMonth(i+1);


            }

        }


        System.out.println("Минимальная прибыль : " );
        printMonth(indexMin+1);
        System.out.println("Максимальная прибыль : ");
        printMonth(indexMax+1);



    }
}
