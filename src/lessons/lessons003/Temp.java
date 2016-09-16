package lessons.lessons003;

import java.util.Scanner;

/**
 * Created by Gardien on 16.09.2016.
 */
public class Temp {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a + " " + b);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);
        a++;
        b--;
        a += 5;
        a = a * 100;
    }

}
