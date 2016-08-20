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

        int bottleOne = 10;
        int bottleTwo = 5;
        int bottleThree;


        bottleTwo = (bottleThree = bottleOne) + bottleTwo;

        System.out.println(bottleOne + " " + bottleTwo  + " " + bottleThree);
    }

}
