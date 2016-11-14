package lessons.lessons006;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        char operation; // + - * /
        int result=0;

        number1 = scanner.nextInt();
        operation = scanner.next().charAt(0);
        number2 = scanner.nextInt();

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Вы ввели некорректную операцию");
                return;
        }

        System.out.println("Result: " + result);

    }

}
