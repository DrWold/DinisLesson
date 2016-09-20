package lessons.lessons003.home.work;

import java.util.Scanner;

//Найти путь пройденный автомобилем
//Пользователь вводит скорость автомобиля (км/ч) - speed(v)
//Пользователь вводит время в пути (ч) - time(t)
//Напечатать путь пройденный автомобилем в км. - path(s)
public class IntegerWork2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed;
        int time;
        int path;
        System.out.println("Введите скорость KM/Ч");
        speed = scanner.nextInt();
        System.out.println("Введите время");
        time = scanner.nextInt();
        path = speed * time;
        System.err.println("пройденный путь " + path + " КМ");

    }

}
