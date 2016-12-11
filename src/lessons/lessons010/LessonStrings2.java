package lessons.lessons010;

import java.util.Scanner;

/**
 * Created by DenisMD on 11.12.2016.
 */
public class LessonStrings2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String test1 = "Hello";
        String test2 = "Sem";

        String result = test1 + ", " + test2; // + для строк - конкатенация

        System.out.println(result);

        String some = scanner.nextLine();

        // Внимание!!! Строки нельзя сравнивать ==
        if ( some.equals("Horror") ) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }

        String s1 = "aaabbcc";
        String s2 = "aaabbzz";

        // -1 s1 < s2
        // 0 s1 == s2
        // 1 s1 > s2
        if ( s1.compareTo(s2) == 0 ) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }

    }
}
