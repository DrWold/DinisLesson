package lessons.lessons004.home.work;

//Сила гравитации
//https://ru.wikipedia.org/wiki/%D0%93%D1%80%D0%B0%D0%B2%D0%B8%D1%82%D0%B0%D1%86%D0%B8%D1%8F
//Пользователь вводит массу двух тел(m1,m2) в кг
//и вводит растояние между ними r(в метрах)

import java.util.Scanner;

//Напечать ему силу гравитации между 2 этими телами, сила измеряется в ньютонах
public class DoubleHW3 {
    public static void main(String[] args) {
    double m1;
    double m2;
    double r; // расстояние (запись пользователя)
    double r2;// расстояние во 2 степени
    double dfs;// Дополнительная запись
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 массу тела в кг");
        m1 = scanner.nextDouble();
        System.out.println("Введите 2 массу тела в кг");
        m2 = scanner.nextDouble();
        System.out.println("Введите расстояния в м");
        r = scanner.nextDouble();

        r2 = r *2;

        dfs = m1 * m2 /r2;

        System.out.println(dfs);


    }
}
