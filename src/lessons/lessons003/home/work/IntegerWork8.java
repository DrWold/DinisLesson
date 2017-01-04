package lessons.lessons003.home.work;

//Интересная задача:

//Найти площадь прямоугольника

//Прямоугольник задается 2 точками в прямоугольной системе координат
//1) Пользователь вводит координаты левого нижнего угла (x1,y1)
//2) Пользователь вводит координаты верхнего правого угла (x2,y2)

import java.util.Scanner;

//Вывести значение площади прямоугольника
public class IntegerWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ax;
        int ay;
        int bx;
        int by;
        long x;
        long y;
        long pr; //переметр
        long pl; // площадь
        System.out.println("Введите кардинату x cтороны a");
        ax = scanner.nextInt();
        System.out.println("Введите кардинату y cтороны a");
        ay = scanner.nextInt();
        System.out.println("Введите кардинату x cтороны b");
        bx = scanner.nextInt();
        System.out.println("Введите кардинату y cтороны b");
        by = scanner.nextInt();

        x = ax - bx;
        y = ay - by;
        pl = x * y;
        pr =  ((x + y) * 2);
        System.out.println("Сторона x " + x);
        System.out.println("сторона y " + y);
        System.out.println("Площадь " + pl);
        System.out.println("Переметр " + pr );
    }
}
