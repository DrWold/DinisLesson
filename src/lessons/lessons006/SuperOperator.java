package lessons.lessons006;

public class SuperOperator {

    public static void main(String[] args) {

        int a = 20,b = 30;

        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println(max);

        // логическое условие ? выражение1 : выражение2
        max = (a > b ? a : b);

        System.out.println(max);

    }

}
