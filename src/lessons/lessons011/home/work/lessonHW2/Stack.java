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
   private int indexTop = 0;
   private int mSize = 0;

    Stack() {
        int stck[] = new int[10];
        this.indexTop = 0;
    }
    Stack(int n ){
        this.mSize = n;
        int stck[] = new int [mSize] ;
    }

    void push(int value) {
        if (stackFull()) {
            System.out.println("Стек полон");


        } else {
                stck[++indexTop] = value;


            }
        }



    int pop() {
        if (indexTop == 0) {
            System.out.println("стек отсутсвует");

        } else {

        } return stck[indexTop--];

    }
    boolean stackFull(){
        return indexTop == stck.length - 1;
    }
    int clearStack(){
        return indexTop = 0;
    }
//    Stack copy(){
//        int obj [] = new int[mSize];
//        System.arraycopy(stck, 0 , obj , 0 ,stck.length);
//
//    }
}