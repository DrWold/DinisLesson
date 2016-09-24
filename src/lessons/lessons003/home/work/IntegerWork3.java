package lessons.lessons003.home.work;

//Найти путь пройденный косм. короблем
//Пользователь вводит скорость коробля (км/сек)
//вводит время в пути в днях
//Напечатать сколько метров было преодалено короблем

//**** Внимание : величины имеют разные системы измерения(их нужно превести друг к другу)
//**** Могут получаться большие числа

import java.util.Scanner;

public class IntegerWork3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SECONDS_TO_DAY = 60 * 60 * 24;
        long speed ; // KM/сек
        long day; //время пройденное в днях
        long path; // Сколько метров преодалел корабль
        System.out.println("Введите скорость коробля КМ/сек");
        speed = scanner.nextLong();
        System.out.println("Введите пройденный путь в днях");
        day = scanner.nextLong();
        path = speed * day * SECONDS_TO_DAY ; // путь в км
        path *= 1000; // путь в метрах
        System.out.println("Метры пройденные короблем = " + path);

    }

}
