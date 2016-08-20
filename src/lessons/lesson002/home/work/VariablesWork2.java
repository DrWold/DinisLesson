package lessons.lesson002.home.work;

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

        int bottel_one;
        int bottel_two;
        int bottel_three;
        bottel_one = 10;
        bottel_two = 5;
        bottel_three = 0;

       bottel_two = (bottel_three = bottel_one) + bottel_two;

        System.out.println(bottel_two);
    }

}
