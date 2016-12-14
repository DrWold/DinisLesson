package lessons.lessons010.home.work;

import java.util.Scanner;

//Пользователь вводит строку c клавиатуры.
//        1) Написать сколько символов в данной строке.
//        2) Вывести после каждого символа пробел ("Hello" -> "H e l l o ")
//        3) Добавить в конец строки восклицательный знак ("Hello" - > "Hello!")
public class StringsHW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println("Введите текст");
        text = scanner.nextLine();
        System.out.println("Длина введенной строки " + text.length() + " Символов" );
        for (int i = 0; i < text.length(); i++) {
            System.out.print( text.charAt(i) + " " );

        }
        System.out.println(" ");
        text += '!';
        System.out.println(text);

    }
}
