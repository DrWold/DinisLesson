package lessons.lessons010;


public class LessonStrings5 {
    public static void main(String[] args) {

        boolean isDev = false;

        for(String arg : args) {
            if (arg.equals("Dev")) {
                isDev = true;
                break;
            }
        }

        if (isDev) {
            System.out.println("Вы включили режим разработчика");
        }

        System.out.println("Простая программа");
    }
}
