package lessons.lessons008;

public class App {

    public static int pow(int a, int b) {
        int result = 1; // результат

        for (int i = 0; i < b; i++ ) {
            result *= a;
        }

        return result;
    }

    public static int sum (Apple apple1, Apple apple2) {
        apple1.setColor("Черным");
        return apple1.getWeight() + apple2.getWeight();
    }


    public static void main(String[] args) {

//        int a = pow(2,5);
//        int b = pow(2,2);
//        int c = pow(4,2);
//
//        System.out.println(a + " " + b + " " + c);
//        System.out.println(Math.pow(3.5, 0.5));

        Apple apple1 = new Apple("Кислое", "Зеленое", 200, 3);
        {

            Apple apple2 = new Apple("Сладкое", "Красное", 400, 10);
            Apple apple3 = apple1;


            System.out.println(sum(apple3,apple2));
            System.out.println(apple1);
        }

        int a;
        {
            int b;
            int c;
            {
                int e;
                {
                    int x;
                }
            }
            int d;
        }
        int z;

//        apple1.printAge();
//        apple2.printAge();
//        apple3.printAge();
    }



}
