package lessons.lessons010.home.work;

import java.util.Arrays;
import java.util.Scanner;


public class StringsHW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scanner.nextLine();
        String[] dirtyWords = new String[] {"fuck", "sick", "bitch"};
        String[] words = text.split(" ");
        String result = "";
        for (String word : words) {
            String fail = word.toLowerCase();
            for (String dirtyWord :dirtyWords ) {
                if (fail.equals(dirtyWord)) {
                    char [] stars = new char[fail.length() -2];
                    Arrays.fill(stars, '*');
                    String tempStr = new String(stars);
                    word = fail.charAt(0) + tempStr + fail.charAt(fail.length() - 1);
                    break;
                }
            }
            result +=  word + ' ';
        }
        System.out.println(result);

    }
}
