package lessons.lesson002.home.work;

//Shift + f6 - изменение имени переменных

//Дом. упражнение на переменные
// *********** Сосуды
// Есть 3 сосуда(jar1,jar2,jar3)
// В 1 сосуде 10 л. воды
// В 2 сосуде 5 л. воды
// 3 сосуд пустой
// Задание
// Перелить из 1 сосуда в 3
// А потом из 3 во второй

//На каждом шаге писать сколько воды в каждом сосуде
public class VariablesWork2 {

    public static void main(String[] args) {

        int jar1 = 10;
        int jar2 = 5;
        int jar3 = 0;


        System.out.println("Jar1 : " + jar1 + "; Jar2 : " + jar2 + "; Jar3 : " + jar3);
        jar3 = jar1;
        jar1 = 0;
        System.out.println("Jar1 : " + jar1 + "; Jar2 : " + jar2 + "; Jar3 : " + jar3);
        jar2 = jar2 + jar3;
        jar3 = 0;
        System.out.println("Jar1 : " + jar1 + "; Jar2 : " + jar2 + "; Jar3 : " + jar3);
        //System.out.println("первый сосуд до перелива в 3 " + jar1);
//        jar1 = jar1 - 10;
//        System.out.println("первый сосуд после перелива " + jar1);
//        System.out.println("третий сосуд до перелива " + jar3);
//        jar3 = jar3 + 10;
//        System.out.println("третий сосуд после перелива " + jar3);
//        jar3 = jar3 - 10;
//        System.out.println("Третий сосуд после перелива в 2 сосуд " + jar3);
//        System.out.println("второй сосуд до залива " + jar2);
//        jar2 = jar2 + 10;
//        System.out.println("второй сосуд после залива " + jar2);




        System.out.println(jar1 + " " + jar2 + " " + jar3);
    }

}
