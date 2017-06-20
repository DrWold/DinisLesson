package lessons.lessons012.home.work.LessonsHW1;

// 2) Создать склад, в конструкторе указать размер склада, то есть сколько он может вмещать товаров
// добавить методы, положить товар в склад
// посчитать кол-во товаров на складе, поиск нужно вести по названию товара
// сформировать отчет в котором будет указана сумма товаров на складе и среднее значение

public class Stock {
   private Product[] products = null;
   private int index = 0;
    String answer = "";

    public Stock(int amountProducts) {
        this.products = new Product[amountProducts];
        this.index = 0;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void printProduct (){
        for (int i = 0; i < products.length -1 ; i++) {
            products[i].setName(answer);


        }

    }
}
