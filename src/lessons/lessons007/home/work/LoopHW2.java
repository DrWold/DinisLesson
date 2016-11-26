package lessons.lessons007.home.work;

// Написать цикл, который c 300 до 60, с шагом в 5 будет выводить значение счетчика
// Пример:
// 300
// 295
// 290
// 285
// ...
// 60
// Сделать 2 реализации, через for и через while
public class LoopHW2 {
    public static void main(String[] args) {
        //int i = 300;
        //while (i >= 60) {
          //  i -= 5;
        //    System.out.println(i);
        //}
         for (int i=300; i > 60; i-=5) {
           System.out.println(i);

        }
    }
}