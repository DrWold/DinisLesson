package lessons.lessons011.home.work.lessonHW2;

// Создать класс - целочисленный стек
// класс основывается на целочисленном массиве
// у класса должно быть 3 метода
// положить в стек void push(int value)
// взять с верхушке стека int pop(), после того как ты возьмешь с верхушке, элемет уходит из стека
// узнать размер стека
// узкнать пустой ли стек
//Для того чтобы твой код отличался от книжного, добавь к стеку метод который будет 1) очищать стек void clear(){} 2) копирует стек из другого стека void copy(Stack original){}
public class Stack {
    private int stck[] = null;
    private int indexTop = -1;


    Stack() {
        this.stck = new int[10];
    }

    Stack(int n) {
        this.stck = new int[n];
    }

    void push(int value) {

        if (isFull()) {
            System.out.println("Стек полон");
        } else {
            stck[++indexTop] = value;
        }
    }

    int pop() {

        if (indexTop < 0) {
            System.out.println("стек отсутсвует");
        }

        return stck[indexTop--];
    }

    boolean isFull() {
        return indexTop == stck.length - 1;
    }

    int clearStack() {
        return indexTop = -1;
    }

    Stack copy(){
        Stack resualt = new Stack();
        resualt.indexTop = indexTop;
        resualt.stck = new int[stck.length];
        System.arraycopy(stck, 0 , resualt.stck , 0 , stck.length);
        return resualt;
    }
}