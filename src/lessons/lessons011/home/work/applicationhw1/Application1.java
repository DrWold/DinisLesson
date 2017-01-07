package lessons.lessons011.home.work.applicationhw1;


public class Application1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(65, 54);
        Rectangle rectangle1 = new Rectangle(80, 85, 76 , 70);
        Rectangle rectangle2 = new Rectangle();


        rectangle.area();
        rectangle.perimeter();
        rectangle.print();
        System.out.println();
        rectangle1.area();
        rectangle1.perimeter();
        rectangle1.print();
        System.out.println();
        rectangle2.area();
        rectangle2.perimeter();
        rectangle2.print();

    }
}
