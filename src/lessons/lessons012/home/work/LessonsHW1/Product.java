package lessons.lessons012.home.work.LessonsHW1;

// 1) Создать класс товар, товар из себя представляет:
//  название, описание, оригинальная цена(может быть товар бесплатным), скидка в процентах и методы которые позволяют узнать
// бесплатный ли товар boolean isFree(){}
// конечную цену, это цена минус скидка + НДС(18%)
public class Product {

    private String name = "";
    private String info = "";
    private int originalPrice = 0;
    private double discount = 0.0;
    private double vat = 0.0;

    public Product(double vat) {
        this.vat = vat;
    }

    /**
     * @param name          Название товара
     * @param info          его описание
     * @param originalPrice изначальная цена
     * @param discount      скидка (ее может не быть)
     * @param vat           НДС
     */
    public Product(String name, String info, int originalPrice, double discount, double vat) {
        this.name = name;
        this.info = info;
        this.originalPrice = originalPrice;
        this.discount = discount;
        this.vat = vat;
    }


    /**
     * @return эти методы возвращают и позволяют изменять свойства товара
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    /**
     * Метод вычесляет конечную цену товара
     * @return 1 обнуляет конечную цену и говорит что товар бесплатен
     * @return 2 выводит цену без скидки
     * @return 3 выводит конечную цену товара со скидкой
     */
    public int price() {
        int price = (int) (originalPrice + vat);
        if (isFree()) {
            System.out.println("Бесплатен");
            return price = 0;

        } if (discount <= 0){
            return price;
        }
        return (int) (price - discount);
    }

    /**
     *
     * @return Проверяет не бесплатный ли товар
     */
    private boolean isFree() {
        return originalPrice <= 0;
    }
}


