package lessons.lessons003.home.work;

import java.util.Scanner;

//Пользователь вводит общее количество байт
//Напечатать сколько это мегабайт, килобайт и оставшихся байт
// 1 Кбайт - 1024 байт
// 1 Мбайт - 1024 Кбайт
public class IntegerWork7 {
    public static void main(String[] args) {
        long bytes;
        long kbytes;
        long mbytes;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество байт");
        bytes = scanner.nextInt();
        mbytes = bytes / (1024*1024);
        bytes = bytes % (1024*1024);
        kbytes = bytes / 1024 ;
        bytes = bytes % 1024;

        System.out.println("Вот сколько получается = " + mbytes + " Мбайт " + kbytes + "  Кбайт " + " байт осталась " );

    }
}
