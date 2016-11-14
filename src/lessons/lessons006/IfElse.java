package lessons.lessons006;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        System.out.println("Начало программы");

        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("Ввведите свой возраст: ");
        age = scanner.nextInt();

        if (age > 18) {
            System.out.println("Доступ разрешен");
            int a = 10;
            System.out.println(a + " " + age);
        } else {
            System.out.println("Доступ заблокирован1");
            System.out.println("Доступ заблокирован2");
        }

        System.out.println("Конец программы");
    }

}
