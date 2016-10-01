package lessons.lessons004;

//Байтовые операции
public class ByteOperations {

    //Принтер устройство
    //1 byte - 8 bits
    //1 - Включен(1) или выключен(0)
    //2 - Подключение к сети
    //3 - Есть ли в нем бумага
    //4 - Катридж вставлен
    //5 - Имеется ли сканер
    //6 - Иммеется ли факс
    //7 - Копирка
    //8 - Шредер

    public static void main(String[] args) {

        int scannerInfo = 0b10011101;
        System.out.println("Scanner info : " + Integer.toBinaryString(scannerInfo));
        int SCANNER_ON = 0b00010000;

        System.out.println("Scanner on : " + Integer.toBinaryString(scannerInfo | SCANNER_ON));

        int SCANNER_OFF = 0b11101111;

        System.out.println("Scanner on : " + Integer.toBinaryString(scannerInfo & SCANNER_OFF));

        int SCANNER_INFO = 0b00010000;

        System.out.println("Scanner is on : " + Integer.toBinaryString(scannerInfo & SCANNER_INFO));


    }

}
