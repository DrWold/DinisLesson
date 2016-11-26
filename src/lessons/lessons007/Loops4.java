package lessons.lessons007;

// For - Для

public class Loops4 {

    public static void main(String[] args) {

        // Цикл for состоит из 3 частей
        // 1 часть - инициализация, выполняется один раз при старте цикла
        // 2 часть - условие, если истина, то цикл выполняется, если ложное то выходим
        // 3 часть - действие

        for (int i=0; i < 10; i++) {
            System.out.println("i : " + i);
        }

        System.out.println();

        for (int i=10; i > 0; i--) {
            System.out.println("i : " + i);
        }


    }

}
