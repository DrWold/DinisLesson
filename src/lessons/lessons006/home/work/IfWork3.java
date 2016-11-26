package lessons.lessons006.home.work;


import java.util.Scanner;

// Вспомнить программу которая рассчитывала индекс массы тела
// https://ru.wikipedia.org/wiki/%D0%98%D0%BD%D0%B4%D0%B5%D0%BA%D1%81_%D0%BC%D0%B0%D1%81%D1%81%D1%8B_%D1%82%D0%B5%D0%BB%D0%B0
// После расчета индекса массы тела, написать пользователю его диагноз, таблица в википедиа
// то есть если например индекс массы тела 27, то написать предожирение и.т.д
public class IfWork3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double rost;//рост м
        double mass;//масса кг
        double index; // индекс массы тела

        System.out.println("Введите Рост в метрах");
        rost = scanner.nextDouble();
        System.out.println("Введите Вес в кг");
        mass = scanner.nextDouble();

        index = mass / (rost * rost);

        if (index <= 16){
            System.out.println("Выраженный дефицит массы тела");
        } else if (index <= 18.5){
            System.out.println("Недостаточная (дефицит) масса тела");
        } else if (index < 25){
            System.out.println("Норма");
        } else if (index <= 30){
            System.out.println("Предожирение");
        } else if (index <= 35){
            System.out.println("Ожирение первой степени");
        } else if (index <= 40){
            System.out.println(	"Ожирение второй степени");
        } else{
            System.out.println("Ожирение третьей степени (морбидное)");
        }
    }
}
