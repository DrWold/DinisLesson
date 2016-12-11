package lessons.lessons009.home.work;


import java.util.Arrays;
import java.util.Random;

public class ArrayHW2 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}
