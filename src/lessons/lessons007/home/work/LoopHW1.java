package lessons.lessons007.home.work;

// Написать цикл, который c 60 до 300, с шагом в 5 будет выводить значение счетчика
// Пример:
// 60
// 65
// 70
// 75
// ...
// 300
// Сделать 2 реализации, через for и через while
public class LoopHW1 {
    public static void main(String[] args) {
       int i = 60;
        while (i < 300){
            i+=5;
            System.out.println(i);
        }
       // for (int i=60; i < 300; i+=5) {
         //   System.out.println(i);

        //}
    }
}
