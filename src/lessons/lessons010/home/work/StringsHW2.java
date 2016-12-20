package lessons.lessons010.home.work;

import java.util.Arrays;
import java.util.Scanner;

//Пользователь вводит строку:
//        1) Найти в строке все слова "fuck" и заменить их на "f!#k"
//        2) Удалить из строки нецензурные слова(какие слова придумай сам)
public class StringsHW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scanner.nextLine();
        String[] dirtyWords = new String[] {"fuck", "sick", "bitch"};
        String[] words = text.split(" ");
        String result = "";
        for (String word : words) {
            for (String dirtyWord :dirtyWords ) {
                if (word.equals(dirtyWord)) {
                    char [] stars = new char[word.length() -2];
                    Arrays.fill(stars, '*');
                    String tempStr = new String(stars);
                    word = word.charAt(0) + tempStr + word.charAt(word.length() - 1);
                    break;
                }
            }
            result +=  word + ' ';
        }
        System.out.println(result);

    }
}