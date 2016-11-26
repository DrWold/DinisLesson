package lessons.lessons007;

// 1 - While - до тех пор пока

public class Loops {
    public static void main(String[] args) {
        System.out.println("Loop - цикл");

        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("Количество итераций = " + i);

    }
}
