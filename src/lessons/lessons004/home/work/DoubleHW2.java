package lessons.lessons004.home.work;

//Вычислить индекс массы тела
//https://ru.wikipedia.org/wiki/%D0%98%D0%BD%D0%B4%D0%B5%D0%BA%D1%81_%D0%BC%D0%B0%D1%81%D1%81%D1%8B_%D1%82%D0%B5%D0%BB%D0%B0
//Пользователь вводит 2 числа
//массу тела в килограммах
//рост в метрах
//Оба числа вещественные

import java.util.Scanner;

//Напечатать ему его индекс массы тела
public class DoubleHW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rost ;//рост м
        double  mass ;//масса кг
        double index; // индекс массы тела

        System.out.println("Введите Рост в метрах");
        rost = scanner.nextDouble();
        System.out.println("Введите Вес в кг");
        mass = scanner.nextDouble();
         index = mass / (rost * rost);

        System.out.println("Индекс массы тела = " + index);

    }

}
