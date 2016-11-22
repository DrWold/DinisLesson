package lessons.lessons006.home.work;

import java.util.Scanner;

//Переписать калькулятор вместо switch использовать if
public class IfWork4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        char operation; // + - * /
        int result = 0;

        number1 = scanner.nextInt();
        operation = scanner.next().charAt(0);
        number2 = scanner.nextInt();
        if (operation == '+') {
            result = number1 + number2;
            System.out.println(result);
        }else if (operation == '-') {
            result = number1 - number2;
            System.out.println(result);
        }else if (operation == '*') {
            result = number1 * number2;
            System.out.println(result);
        }else if (operation == '/') {
            result = number1 / number2;
            System.out.println(result);
        }else {
            System.out.println("Вы ввели некоректный символ");
        }
    }
}
