package lessons.lessons003.home.work;

import java.util.Scanner;

//Пользователь вводит количество байт с клавиатуры
//Напечатать ему сколько это будет бит
// 1 байт - 8 бит
public class IntegerWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int BITS_IN_BYTE = 8;
        int bytes; // байт
        System.out.println("Введите Количество байт");
        System.out.println("Вы получите сколько это будет бит напомитка 1 байт = 8 бит");
        bytes = scanner.nextInt();
        int bits ;
        bits = bytes * BITS_IN_BYTE;
        System.out.println("Количестно бит =" + bits);
    }
}
