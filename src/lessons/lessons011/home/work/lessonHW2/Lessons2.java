package lessons.lessons011.home.work.lessonHW2;

// Создать класс - целочисленный стек
// класс основывается на целочисленном массиве
// у класса должно быть 3 метода
// положить в стек void push(int value)
// взять с верхушке стека int pop(), после того как ты возьмешь с верхушке, элемет уходит из стека
// узнать размер стека
// узкнать пустой ли стек
public class Lessons2 {
    public static void main(String[] args) {
        Stack test = new Stack();
        StakBOOK book = new StakBOOK();
        for (int i = 0; i <10 ; i++) book.push(i);
        for (int i = 0; i <10 ; i++) {
        System.out.println(book.pop());

        }



    }
    }

