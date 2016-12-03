package lessons.lessons009;

import java.util.Arrays;

// Arrays - массивы

public class Array3 {
    public static void main(String[] args) {

        int [] a = new int[]{1,2,3};
        int [] b = new int[]{1,2,3};
        int [] c = new int[]{45,12,4,6,-2,1,0};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(a,c));

        Arrays.fill(a, 5);
        System.out.println(Arrays.toString(a));

        Arrays.sort(c);

        System.out.println(Arrays.toString(c));
    }
}
