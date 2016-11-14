package lessons.lessons006;


import java.util.Scanner;

public class SwitchOperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month;


        System.out.println("Введите месяц:");
        month = scanner.nextInt();

//        if (month <= 0 || month > 12) {
//            System.out.println("Вы ввели не правильный месяц");
//            return; // выход из программы
//        }

        /*
        if (month == 1) {
            System.out.println("Январь");
        } else if (month == 2) {
            System.out.println("Февраль");
        } else if (month == 3) {
            System.out.println("Март");
        } else if (month == 4) {
            System.out.println("Апрель");
        }*/


        switch (month) {
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
            default:
                System.out.println("Вы ввели не правильный месяц");
        }


    }
}
