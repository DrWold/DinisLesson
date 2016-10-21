package lessons.lessons005;


//  Символы
public class Characters {

    public static void main(String[] args) {

        //ANSI - символ - 1 byte (127)
        //UTF 16 - символ - 2 byte (65 000)
        //UTF 8 - символ - 1 byte / символ - 2  byte

        // 'N' - 1 byte ANSI
        // 'N' - 2 byte UTF 16
        //  'N' - 1 byte UTF 8

        // 'Л' - не существует в ANSII
        // 'Л' - 2 byte UTF 16
        // 'Л' - 2 byte UTF 16

        char c = 'A'; // UTF 8
        int characterCode = c;

        System.out.println("My character : " + c);
        System.out.println("Code character : " + characterCode);

        characterCode = 66;
        c = (char) characterCode;

        System.out.println("My character : " + c);
        System.out.println("Code character : " + characterCode);

        c = ' ';
        characterCode = c;

        System.out.println("My character : " + c);
        System.out.println("Code character : " + characterCode);

        c = '\n';
        characterCode = c;

        System.out.println("My character : " + c);
        System.out.println("Code character : " + characterCode);

        c = '\u1C43';
        System.out.println("My character : " + c);


        char a,b;

        a = '9';
        b = '0';

        System.out.println("code : " + ((int)a));
        System.out.println("code2 : " + ((int)b));

        int number = a - b;
        System.out.println(number);

    }
}
