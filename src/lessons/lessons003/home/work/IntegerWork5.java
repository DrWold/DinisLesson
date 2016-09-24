package lessons.lessons003.home.work;

//Пользователь вводит количество астронамичесих едениц
//Напечать сколько это будет километров

import java.util.Scanner;

//https://ru.wikipedia.org/wiki/%D0%90%D1%81%D1%82%D1%80%D0%BE%D0%BD%D0%BE%D0%BC%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B0%D1%8F_%D0%B5%D0%B4%D0%B8%D0%BD%D0%B8%D1%86%D0%B0
//1 астраном. еденица = 149_597_870 км
public class IntegerWork5 {
    public static void main(String[] args) {
        long km = 149597870 ;//km
        long astral; // астраном еденицы
        long kms ; // сколько km получилась
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество астронамических единиц");
        astral = scanner.nextLong();
        kms = astral * km;
        System.out.println("Вот сколько выходит км в " + astral + " астронамических единицах " + kms);
    }
}
