package lessons.lessons009;


public class Array2 {
    public static void main(String[] args) {

        int [] a = new int[] {1,2,3,4,5}; // 0..4
        int [] b = new int[] {1,2,3,4}; // 0..3
        int [] c = a;

        if (a == b) {
            System.out.println("a == b");
        }

        if (a == c) {
            System.out.println("a == c");
        }


        boolean isEquals = true;

        for (int i = 0; i < a.length; i++) {

            if (b.length <= i) {
                isEquals = false;
                break;
            }

            if (a[i] != b[i]) {
                isEquals = false;
                break;
            }
        }

        if (isEquals) {
            System.out.println("Значения в массиве a и b равны");
        } else {
            System.out.println("Значения разные");
        }

    }
}
