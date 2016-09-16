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


        int wallet = 5000;
        //system.err.println("Сейчас в кошельке " + wallet);

        System.out.println("Купил телефон из мтс 2500 ");

        wallet -=  2500;

        System.out.println("Посмотрел в кошелек в кошельке " + wallet);
        System.out.println("зашел в банк ");
        System.out.println("Получил 500 руб УРАААААААА");
         wallet += 500;

        System.out.println("положил в кошелек считаешь в кошельке " + wallet);
        System.out.println("прибежала жена схватила кошелек ");
        wallet = 0;
        System.out.println("Вернула обратно открывайте кашелек " + wallet);
        System.out.println("За то у вас теперь есть кракодилавая барседка");
}
}