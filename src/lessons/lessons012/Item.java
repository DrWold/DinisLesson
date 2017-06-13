package lessons.lessons012;

// модификаторы доступа - public, private, internall
// get и set
// overriding - перегрузка методов и конструткоров
public class Item {

    private int price;
    private String name;

    public Item(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public Item(int price) {
        this.price = price;
    }

    public Item() {
        this.price = 0;
    }

    public int getPrice() {
        if (price < 0) {
            return 0;
        }
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price less zero");
            return;
        }
        this.price = price;
    }

    public double calculateNds() {
        return calculateNds(18);
    }

    public double calculateNds(int percent) {
        return this.price + (this.price * (percent / 100.0));
    }

    public void dummy(int a, int b, int c, int d) {

    }

    public void dummy(int a, int b, int c) {
        dummy(a, b, c, 0);
    }
}
