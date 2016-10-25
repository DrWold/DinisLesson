package lessons.lessons005.home.work;

import java.util.Scanner;

// Создать простую программу
// пользователь вводит с клавиатуры число
// на экран показывается символ соответствующий введеному число по кодировке UTF-8
public class CharactersHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char chars ;
        int charCode ; // номерация символа
        System.out.println("Введите номер символа в кодировке UTF-8");
        charCode = scanner.nextInt();
        chars = (char) charCode;

        System.out.println("Вот символ под номером " + charCode + " В кодеровке UTF-8  " + chars);
        System.out.println("ВНИМАНИЕ ЕСЛИ ВЫ НЕ ВИДИТЕ ИЛИ ВИДЕТЕ НЕ ПРАВИЛЬНЫЙ СИМВОЛ ЗНАЧИТ ВАША КОНСОЛЬ WINDOWS НЕ ПОДЕРЖИВАЕТ ЭТУ КОДИРОВКУ");


    }
}
