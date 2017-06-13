package lessons.lessons012;

// static - постоянные
public class StaticMethods {

    public static int count = 0;
    public int count2 = 0;

    public static void print() {
        System.out.println("Hello");
    }

    StaticMethods() {
        count++;
        count2++;
    }

}
