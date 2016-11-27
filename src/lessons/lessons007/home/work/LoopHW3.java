package lessons.lessons007.home.work;

import java.util.Scanner;

// Написать программу возведение в степень:
// Пользователь вводит с клавиатуры 2 целых числа(a и b)
// Вывести результат возведения числа a в степень b
// a^b = a*a*a...*a (количество умножений должно быть b)
// 4^5 = 4*4*4*4*4 = 1024
public class LoopHW3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a; // число
        int b; // степень возведения
        int result = 1; // результат

        System.out.println("Введите число");
        a = scanner.nextInt();
        System.out.println("Введите стенень вызведения числа");
        b = scanner.nextInt();

        for (int i = 0; i < b; i++ ) {
            result *= a;
        }
        System.out.println(result);
    }
}
