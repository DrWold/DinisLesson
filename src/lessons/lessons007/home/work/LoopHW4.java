package lessons.lessons007.home.work;

// Вывести через запятую 100 чисел из последовательности фиббаначи
// Каждое число это сумма двух предыдущих, первые два члена последовательности строго заданы - это a = 1 и b = 1
// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946
// http://elementy.ru/trefil/21136/Chisla_Fibonachchi
public class LoopHW4  {
    public static void main(String[] args) {

        long a = 1;
        long b = 1;

        for (int i =0; i<30; i++) {
            System.out.print(a + ", " + b + ", ");
            a += b;
            b += a;
        }
    }
}
