package lessons.lessons011;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        //Выполнение программы отсюда

        //создание работника(объекта)
        Employee emp1 = new Employee("Alex", 21, 25000.0);
        emp1.stage = 2;
        emp1.print();

        System.out.println("Зарплата " + emp1.name + " за год равна " + emp1.salaryForYear());

        emp1.increaseSalary(5000);
        emp1.print();

//        Employee emp2 = new Employee();
//        emp2.print();

//        Employee[] employees = new Employee[10];
//
//        for (int i = 0; i < employees.length; i++) {
//            employees[i] = new Employee();
//            employees[i].name = "Hello";
//        }
    }
}
