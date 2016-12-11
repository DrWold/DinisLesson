package lessons.lessons010;


import java.util.Scanner;

//String - строка
public class LessonStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String some = "Hello";
        String some2 = new String(new char[] {'T','e','s','t'});
        String emptyString = "";
        String nullString = null;

        System.out.println(some);
        System.out.println(some2);
        System.out.println(emptyString);
        System.out.println(nullString);

        //Ввод строки
        String test = "";
        System.out.println("Введите строку");
        test = scanner.nextLine(); //next - до пробела nextLine - до enter-а
        System.out.println(test);

        System.out.println("Длина введенной строки : " + test.length());

        for (int i = 0; i < test.length(); i++) {
            System.out.println( test.charAt(i) );
        }

        for (int i = test.length()-1; i >= 0; i--) {
            System.out.print(test.charAt(i));
        }

    }
}
