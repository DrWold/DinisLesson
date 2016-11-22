package lessons.lessons006.home.work;

import java.util.Scanner;

//Пользователь вводит число
//Написать четное или не четное число он ввел
//Четные числа 2,4,6,8,10,12,14 ....
//Нечетные числа 1,3,5,7,9,11.....
public class IfWork2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Введите число");
        number = scanner.nextInt();
        if((number%2)==0){
            System.out.println("Число " + number + " четное ");
        } else{
            if((number%1)==0){
                System.out.println("Число " + number + " нечетное ");
            }
        }
    }
}
