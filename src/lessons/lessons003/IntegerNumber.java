package lessons.lessons003;

//Целочисленный тип данных
public class IntegerNumber {

    public static void main(String[] args) {

        byte    a = 1;          //1 byte - 8 bits - 256 - -127..0.126
        short   b = -100;       //2 byte - 16 bits - 65536
        int     c = 15;         //4 byte - 32 bits
        long    d = 755555555;  //8 byte - 64 bits


        // 15 - литерал(константа), не изменяется
        // 15 - int
        // 15l - long

        // d = 10000000000L;

        int number = 10_000;
        System.out.println("Number : " + number);

        number = 0x10;
        //0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,10,11,12.....
        System.out.println("Number : " + number);

        number = 0b1111_0001_1001;
        //0,1,10,11,100,101,110,111....
        System.out.println("Number : " + number);

        System.out.println("****************** Операторы ******************");
        int temp1 = 19;
        int temp2 = 7;

        System.out.println("temp1 + temp2 = " + (temp1 + temp2));
        System.out.println("temp1 - temp2 = " + (temp1 - temp2));
        System.out.println("temp1 * temp2 = " + (temp1 * temp2));
        System.out.println("temp1 / temp2 = " + (temp1 / temp2));
        System.out.println("temp1 % temp2 = " + (temp1 % temp2));

        int temp3 = 456;
        //1,2,3,4,5,6,7,8,9,10
        //Четные : 2,4,6,8,10,...
        //НеЧетные : 1,3,5,7,9
        System.out.println("456 : " + (temp3 % 2));
        temp3 = 457;
        System.out.println("457 : " + (temp3 % 2));

        System.out.println("125786 : " + (125786) % 1000);

        temp3 = 5;
        System.out.println("Temp 3 : " + temp3);
        temp3 = temp3 + 1;
        System.out.println("Temp 3 : " + temp3);
        temp3++;
        System.out.println("Temp 3 : " + temp3);
        temp3--;
        System.out.println("Temp 3 : " + temp3);


        temp3 = temp3 + 100;
        System.out.println("Temp 3 : " + temp3);
        temp3 += 100;
        System.out.println("Temp 3 : " + temp3);
        temp3 -= 20;
        System.out.println("Temp 3 : " + temp3);
        temp3 *= 5;
        System.out.println("Temp 3 : " + temp3);
        temp3 %= 2;
        System.out.println("Temp 3 : " + temp3);

    }

}
