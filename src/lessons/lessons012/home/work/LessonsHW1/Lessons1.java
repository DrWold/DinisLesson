package lessons.lessons012.home.work.LessonsHW1;

import java.util.Scanner;

// Спрограммировать бизнесс-логику для интернет магазина
// 1) Создать класс товар, товар из себя представляет:
//  название, описание, оригинальная цена(может быть товар бесплатным), скидка в процентах и методы которые позволяют узнать
// бесплатный ли товар boolean isFree(){}
// конечную цену, это цена минус скидка + НДС(18%)
// 2) Создать склад, в конструкторе указать размер склада, то есть сколько он может вмещать товаров
// добавить методы, положить товар в склад
// посчитать кол-во товаров на складе, поиск нужно вести по названию товара
// сформировать отчет в котором будет указана сумма товаров на складе и среднее значение
public class Lessons1 {
    Scanner scanner = new Scanner(System.in);
    Stock stock = new Stock();
    public static void main(String[] args) {

    }
}