package lessons.lesson002.home.work;

//Задание на подумать
//Поменять местами значения 2 переменных
//В переменной a = 10;
//В переменной b = 20;

//Необходимо чтобы в a было 20; а в b было 10; swap

//Прямое решение
//a = 20;
//b = 10;
//Не подойдет, предполагается, что ты не знашь какие значения могут быть в a и b(польз. с клав. к примеру вводит)
public class VariablesWork3 {

    public static void main(String[] args) {
        int b = 20;
        int a = 10;
        int c = 0;

        System.out.println(" Прости денис незнаю как решить ((((( ");

        System.out.println(a +" " + b );

        c = b;
        b = a;
        a = c;

        System.out.println(a +" " + b );
    }

}
