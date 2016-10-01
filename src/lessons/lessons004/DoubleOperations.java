package lessons.lessons004;

import java.util.Scanner;

public class DoubleOperations {

    public static void main(String[] args) {

        double a = 0.5;

        System.out.println(a);

        double a1 = 5E-1; // 5 * 10^-1 = 5 / 10 = 0.5
        //8 byte
        //Exponent - 1 byte
        //Montis - 7 byte

        System.out.println(a1);

        double c = 1.0/3;
        System.out.println(c);
        //System.out.printf("%.25f %n",c);


        double test = 12.50 + 0.5;

        System.out.println(test);

        Scanner scanner = new Scanner(System.in);
        test = scanner.nextDouble();
        System.out.println(test);

    }

}
