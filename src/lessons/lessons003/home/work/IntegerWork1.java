package lessons.lessons003.home.work;

//Работа с целлыми числами
//Пользователь вводит 2 целых числа, a и b
//Отобразить на консоль:
//1) Сумму этих чисел
//2) Разность этих числе
//3) Произведение этих чисел
//4) Целочисленное деление a на b
//5) Деление с отстатком a на b

import java.util.Scanner;

//6) Изменить число a на 1, напечатать его\
//7) Изменить число b на -1, напечатать его
//8) Изменить чсилоа a на (011011 - число в двоичной системе счисления), напечатать его
//9) Изменить число b на (FA50 - в шест. системе счисления)
public class IntegerWork1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a ;
        int b ;
        System.out.println("Введите 1 число");
        a = scanner.nextInt() ;
        System.out.println("Введите 2 число");
        b = scanner.nextInt() ;
        a -= a;
        a++;
        b -= b;
        b--;
        System.out.println(a +" " + b);

        a = a = 0x011011;
        b = b = 0xFA50;
        System.out.println(a);
        System.out.println(b);
    }

}
