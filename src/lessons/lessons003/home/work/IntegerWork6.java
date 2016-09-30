package lessons.lessons003.home.work;

import java.util.Scanner;

//Время
//Пользователь вводит с клавиатуры общее количество секунд
//Напечатать сколько в данных секундах
//часов, минут, оставшихся секунд
//Пример
//-> 5
//0 час. 0 мин. 5сек
//-> 69
//0 час. 1 мин. 9 сек
// -> 3669
// 1 час 1 мин 9 сек
public class IntegerWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int second; //Секунды
        int min; // Минуты
        int hour;// часы
        System.out.println("Введите количество секунд");
        second = scanner.nextInt();
        hour = second / (60*60);
        second = second % (60*60);
        min = second / 60 ;
        second = second % 60;
        System.out.println("Вот сколько это часов и минут " + hour + " часов " + min  +" минут " + second + "секунд");




    }
}
