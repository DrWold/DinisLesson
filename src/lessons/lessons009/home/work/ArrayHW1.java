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
        int n = 0;

        System.out.println("Введите количество чисел которые желайте обработать ");
        n = scanner.nextInt();


        if (n <= 0) {
            System.out.println("Вы вели число ниже или ровною нолю ");
            return;

        }
        int [] number = new int[n];

        for (int i = 0; i < number.length / 2; i++) {
            System.out.println("Введите положительное " + (i+1) + " число");
            number[i] = scanner.nextInt();



        }
        for (int elements : number) {
            System.out.println(elements);
        }
            int min = number[0];
            int max = number [0];
            int sum = 0;

    }
}
