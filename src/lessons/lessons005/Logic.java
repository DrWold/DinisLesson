package lessons.lessons005;


import java.util.Scanner;

public class Logic {

    public static void main(String[] args) {

        int a = 7;
        int b = 7;

        boolean result;

        result = a > b; // false
        result = a < b; // true
        result = a == b; // false
        result = a != b; // true
        result = a >= b; // false
        result = a <= b; // true

        // 7 > 7 - false
        // 7 < 7 - false
        // 7 == 7 - true
        // 7 <= 7 - true
        // 7 >= 7 - true

        char c1 = 'a', c2 = 'b';

        System.out.println(c1 > c2);

        boolean var1 = true; // истина - да
        boolean var2 = false; // ложь - нет

        System.out.println(!var1);
        System.out.println(!var2);

        // и - &&
        // true && true = true
        // true && false = false;
        // false && true = false;
        // false && false = false;

        System.out.println(true && true);

        // или - ||
        // true || true = true
        // true || false = true;
        // false || true = true;
        // false || false = false;


        int age;

        Scanner scanner = new Scanner(System.in);

        age = scanner.nextInt();

        boolean isCorrect = ( age >= 0 && age <= 120 );

        System.out.println(isCorrect);

    }

}
