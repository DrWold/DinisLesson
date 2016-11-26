package lessons.lessons007;

import java.util.Scanner;


// do-while

public class Loops2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char answer;

        do {

            System.out.println("Привет");
            System.out.println("Продолжить программу (Y/N): ");
            answer = scanner.next().charAt(0);

        } while (answer == 'Y' || answer == 'y');


        System.out.println("Выходим из прграммы");

    }
}
