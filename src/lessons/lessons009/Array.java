package lessons.lessons009;


import java.util.Scanner;

// Array - массивы
public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        System.out.println("Сколько дней вы хотите обработать:");
        n = scanner.nextInt();

        double [] temperature = new double[n];

        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Введите температуру за " + (i+1) + " день");
            temperature[i] = scanner.nextDouble();
        }

        double [] arr2 = temperature;

        //for-each
        for (double element : arr2) {
            System.out.println(element);
        }

        double min = temperature[0];
        double max = temperature[0];
        double sum = 0.0;


        // 2.5 3.1 0.5 1.2 -2 3
        for (double element  : temperature) {

            sum += element;

            if (element < min) {
                min = element;
            }

            if (element > max) {
                max = element;
            }

        }

        System.out.println("Самая низкая температура : " + min);
        System.out.println("Самая высокая температура : " + max);

        System.out.println("Средняя температура: " + (sum / temperature.length));



        //System.out.println(temperature);

    }
}
