package lessons.lessons006.home.work;

import java.util.Scanner;

//Пользователь вводит число
//Написать четное или не четное число он ввел
//Четные числа 2,4,6,8,10,12,14 ....
//Нечетные числа 1,3,5,7,9,11.....
public class IfWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;//Введенное число

        System.out.println("Введите четное или не четное число с 1 по 14 ");
        number = scanner.nextInt();
        if (number == 2){
            System.out.println("четное");
        }else if (number == 4) {
            System.out.println("четное");
        }else if (number == 6) {
            System.out.println("четное");
        }else if (number == 8) {
            System.out.println("четное");
        }else if (number == 10) {
            System.out.println("четное");
        }else if (number == 12) {
            System.out.println("четное");
        }else if (number == 14) {
            System.out.println("четное");
        }else {
            System.out.println("не четное");
        }
    }
}
