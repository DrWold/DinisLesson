package lessons.lessons009.home.work;

//Пользователь вводит целочисленный массив произвольного размера и заполняет его с клавиатуры.
//        1) Посчитать сумму только положительных чисел
//        2) Посчитать сумму отрициательных чисел
//        3) Найти максимальный элемент среди отрицательных
//        4) Найти минимальный элемент среди положительных


import java.util.Scanner;

public class ArrayHW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;

        System.out.println("Введите количество чисел которые желайте обработать ");
        n = scanner.nextInt();


        if (n <= 0) {
            System.out.println("Вы вели число ниже или ровною нолю ");
            return;

        }
        int[] number = new int[n];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Введите " + (i + 1) + " число");
            number[i] = scanner.nextInt();


        }
        int sumPlus = 0;
        int sumMinus = 0;
        int min = 0;
        int max = 0;

        for (int elements : number) {
            if (elements > 0 && min == 0){
                min = elements;
            }
            if (elements < 0 && max == 0){
                max = elements;
            }
            if (elements > 0) {
                System.out.println("число " + elements + " положительное");
                System.out.println();
                sumPlus += elements;
            } else {
                System.out.println("число" + elements + " отрицательное ");
                System.out.println();
                sumMinus += elements;
            }
            if (elements < 0 && elements > max) {
                max = elements;
            }
            if (elements > 0 && elements < min) {
                min = elements;
            }



        }


        System.out.println("Сумма отрицательных чисел " + sumMinus);
        System.out.println("Сумма положительных чисел " + sumPlus);
        System.out.println("Максимальное отрицательно число " + max);
        System.out.println("Миниальное положителное число "  + min);

    }
}
