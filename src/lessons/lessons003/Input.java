package lessons.lessons003;


import java.util.Scanner;

//Ввод данных с клавиатуры
public class Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int number;
//
//        number = scanner.nextInt();
//
//        System.out.println("Number : " + number);
//
//        double number2;
//
//        number2 = scanner.nextDouble();
//
//        System.out.println("Number 2 : " + number2);

        System.out.print("Enter your age : ");

        int age;

        age = scanner.nextInt();

        System.out.println("Age is " + age);

    }

}
