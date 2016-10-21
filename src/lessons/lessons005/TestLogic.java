package lessons.lessons005;


public class TestLogic {

    public static void main(String[] args) {

        boolean a=false,b=false;


        boolean result =  (a = false) && (b = true);

        System.out.println(a + " " + b + " " + result);

        a = true;
        b = true;

        result = (a = true) || (b = false);
        System.out.println(a + " " + b + " " + result);
    }

}
