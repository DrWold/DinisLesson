package lessons.lesson002.home.work;


//Дом. упражнение на переменные
// *********** Кошелек
// Создать переменную кошелек по англ.(wallet)
// При создании установить значение в 5000
// Вычесть из кошелька 2500(покупали что-то)
// Добавить в кошелек 500(зарплата пришла)
// Обнулить значение в кошельке

//Информацию о кошельке нужно выводить на консоль, после каждой операции
public class VariablesWork1 {

    public static void main(String[] args) {


        int wellet = 5000;
        //system.err.println("Сейчас в кошельке " + wellet);

        System.out.println("Купил телефон из мтс 2500 ");

        wellet = wellet - 2500;

        System.out.println("Посмотрел в кошелек в кошельке " + wellet);
        System.out.println("зашел в банк ");
        System.out.println("Получил 500 руб УРАААААААА");
         wellet = wellet - 500;

        System.out.println("положил в кошелек считаешь в кошельке" + wellet);
        System.out.println("прибежала жена схватила кошелек ");
        wellet = wellet - wellet;
        System.out.println("Вернула обратно открывайте кашелек " + wellet );
        System.out.println("За то у вас теперь есть кракодилавая барседка");
}
}