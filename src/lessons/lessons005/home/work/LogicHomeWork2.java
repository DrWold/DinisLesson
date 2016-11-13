package lessons.lessons005.home.work;


// Условия для выбора квартиры
// В программе хранится информация о 4 квартирах, каждая квартира это набор из 3 переменных (цена, количество комнат(1-5), этаж (1-9))
// Данные квартиры вбей в программу сам, как захочешь
// Для каждый квартиры нужно проверить условия и написать соответсвует она условиям или нет
// 1) Квартира между 5 и 9 этажом и обязательно 2-комнатная
// 2) Стоимость квартиры от 1000_000 до 3000_000 и квартира не на первом этаже
// 3) Количество комнат больше 3 или стоимость квартиры меньше 1000_000
public class LogicHomeWork2 {
    public static void main(String[] args) {
        int price1, countRoom1, floor1;
        int price2, countRoom2, floor2;
        int price3, countRoom3, floor3;

        price1 = 5000;
        countRoom1 = 2;
        floor1 = 1;

        price2 = 3000;
        countRoom2 = 3;
        floor2 = 4 ;

        price3 = 7000;
        countRoom3 = 6 ;
        floor3 = 5;

        boolean logic1_1, logic1_2, logic1_3;
        logic1_1 = floor1 >= 5 && floor1 <= 9 && countRoom1 == 2;
        logic1_2 = floor2 >= 5 && floor2 <= 9 && countRoom2 == 2;
        logic1_3 = floor3 >= 5 && floor3 <= 9 && countRoom3 == 2;
        System.out.println("Проверяется условие что квартиры между 5 и 9 этажем двух комнатные: ");
        System.out.println("Квартира 1: " + logic1_1);
        System.out.println("Квартира 2: " + logic1_2);
        System.out.println("Квартира 3: " + logic1_3);

        boolean logic2_1, logic2_2, logic2_3;
        logic2_1 = price1 >= 1000_000 && price1 <= 3000_000 && floor1 != 1;
        logic2_2 = price2 >= 1000_000 && price2 <= 3000_000 && floor2 != 1;
        logic2_3 = price3 >= 1000_000 && price3 <= 3000_000 && floor3 != 1;

        System.out.println("Проверяем условие что квартиры стоят от 1000_000 до 3000_000 и не на первой этаже");
        System.out.println("Квартира 1 " + logic2_1);
        System.out.println("Квартира 2 " + logic2_2);
        System.out.println("Квартира 3 " + logic2_3);

        boolean logic3_1, logic3_2, logic3_3;
        logic3_1 = price1 <= 1000_000 || countRoom1 > 3;
        logic3_2 = price2 <= 1000_000 || countRoom2 > 3;
        logic3_3 = price3 <= 1000_000 || countRoom3 > 3;

        System.out.println("Проверяем условие что квартиры стоят меньше одного миллиона или больше трех комнат");
        System.out.println("Квартира 1 " + logic3_1);
        System.out.println("Квартира 2 " + logic3_2);
        System.out.println("Квартира 3 " + logic3_3);

    }
}
