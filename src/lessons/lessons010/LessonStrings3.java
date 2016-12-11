package lessons.lessons010;

public class LessonStrings3 {
    public static void main(String[] args) {

        String test = "Hello";
        String test2 = "";

        System.out.println( "Is empty : " + test2.isEmpty() ); // test2.equals("")

        String a = "HEllO";
        String b = "heLLo";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        String var1 = "Hello, my name my is Denis";
        System.out.println(var1.contains("my")); // содержится ли в нутри строки подстрока

        var1.startsWith("H"); //Строка начинается ли с этой строки
        var1.endsWith("Denis"); //Заканчивается ли эта строка дланной подстракой

        System.out.println(var1.indexOf("my"));
        System.out.println(var1.lastIndexOf("my"));
        var1 = var1.replace("my", "ZZZ"); //заменить
        System.out.println(var1);

        System.out.println("\n\n");

        var1 = "Hello Test Vasa Zub";
        for ( String element : var1.split(" ")) {
            System.out.println(element);
        }

        var1 = "                    GHHfdasfsdg hhdfhdfh           ";
        System.out.println(var1.trim());

    }
}
