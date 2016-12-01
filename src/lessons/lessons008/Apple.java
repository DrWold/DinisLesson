package lessons.lessons008;


public class Apple {

    private String type;
    private String color;
    private int weight;
    private int month;

    public Apple(String type, String color, int weight, int month) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.month = month;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void printAge() {
        if (month > 5) {
            System.out.println("Старое яблоко");
        } else {
            System.out.println("Обычное");
        }
    }

    @Override
    public String toString() {
        return "Apple{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", month=" + month +
                '}';
    }
}
