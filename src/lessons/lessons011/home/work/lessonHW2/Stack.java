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
    int stck[] = new int[10];
    int testStacks;
    int maxStack;

    Stack() {
        // проверка     максимум стека по скольку ты не уточнял какой должен быть размер я решил сделать сначала 10 и все проверить сделаю учет под пользователя
        testStacks--;
    }

    void push(int value) {
        if (testStacks == 9) {
            System.out.println("Стек полон");


        } else {
            int resurs = 0;
            resurs++;
            for (int i = 0; i < resurs; i++) {
                testStacks++;
                stck[testStacks] = testStacks;


            }
        }
    }


//    int pop() {
//        if (testStacks == 0) {
//            System.out.println("стек отсутсвует");
//            return 0;
//        } else {
//            int resurs = 0;
//            resurs++;
//            for (int i = 0; i < resurs; i++) {
//                testStacks--;
//                stck[i] = testStacks;
//            } return testStacks;
//
//        }


    }
}