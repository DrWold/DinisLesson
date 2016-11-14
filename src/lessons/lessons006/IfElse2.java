package lessons.lessons006;


import java.util.Scanner;

public class IfElse2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum;

        System.out.println("Введите ваш заработок: ");
        sum = scanner.nextInt();

        if (sum < 1000) {
            System.out.println("Вы очень бедный");
        } else if (sum < 5000) {
            System.out.println("Вы бедный");
        } else if (sum < 15000) {
            System.out.println("Нормально");
        } else {
            System.out.println("Достойно");
        }


    }

}
