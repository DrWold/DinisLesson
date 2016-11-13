package lessons.lessons005.home.work;


import java.util.Scanner;

// Пользователь вводит с клавиатуры тумпературу в градусах, это целое число число
// Создать 3 логических условий и вывсети их резултат
// 1) Температура меньше абсолютного минуса (-270°)
// 2) Температура больше абсолютного минуса но меньше или равно нулю
// 3) Температура больше 0 и меньше 5000°
public class LogicHomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int ABSOLUTE_TEMP = -270;
        int temp; // температура в цельсии
        System.out.println("Ввидите температуру в цельсии ");
        temp = scanner.nextInt();

        boolean logic1, logic2, logic3;
        logic1 = ABSOLUTE_TEMP > temp;
        logic2 = ABSOLUTE_TEMP < temp && temp <= 0;
        logic3 = temp > 0 && temp < 5000;

        System.out.println(logic1 + " " + logic2 + " " +  logic3);

    }
}
