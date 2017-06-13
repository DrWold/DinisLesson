package lessons.lessons012;


public class AdvancedClasses {
    public static void main(String[] args) {

        Item item = new Item(10);
        item.setPrice(20);

        Recursion recursion = new Recursion();
        int result = recursion.fact(5);
        System.out.println(result);

        StaticMethods staticMethods = new StaticMethods();
        StaticMethods staticMethods2 = new StaticMethods();
        StaticMethods staticMethods3 = new StaticMethods();
        StaticMethods staticMethods4 = new StaticMethods();
        StaticMethods staticMethods5 = new StaticMethods();
        System.out.println(StaticMethods.count);

        SingletonConnection connection = SingletonConnection.createConnection("gdfhdfh", "dasfasg", "123123");
        connection.executeSql("select * from users;");
    }
}
