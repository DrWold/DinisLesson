package lessons.lessons010.home.work;

import java.util.Arrays;


public class StringsHW4 {
    public static void main(String[] args) {

        String[] array = new String[] {"Я русская строка" , "AAAA" , "CCC" , "ZZZZ", "Hello"};
        System.out.println((int) 'Я');
        System.out.println((int) 'A');


        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j + 1] ) > 0 ){
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}

