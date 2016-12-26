package lessons.lessons011;

import java.util.Random;

// класс - это описание или чертеж по которому будут созданы объекты
// свойства класса - набор переменных, которые будут доступны объекту
// методы - действия
// конструктор - метод который вызывется при создание объекта
public class Employee {

    //fields - свойства
    String name;      //свойство-имя
    int age;          //свойство-возрас работника
    double salary;    //зарплата
    int stage;        //стаж


    //Конструктор
    Employee() {
        this.name = "none";
        this.age = 0;
        this.salary = 0.0;
        this.stage = 0;
    }

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //метод
    // [какой тип возращает метод] (void - метод не возвращает ничего)
    // [имя метода]
    // (аргументы)

    //Ничего не возвращает и нчего не принимает
    void print() {
        System.out.println("Работник:" +
                " Имя : " + name +
                " Возраст : " + age +
                " Зарплата : " + salary +
                " Стаж работы : " + stage);
    }

    //Посчитает зарплату за год
    double salaryForYear() {
        if (salary > 20000) {
            return salary * 12 + 30000;
        }
        return salary * 12;
    }

    // Увеличить зарплату
    void increaseSalary (double amount) {
        this.salary += amount;
    }

    // Уменьшить зарплату
    void decreaseSalary (double amount) {
        salary -= amount;
    }

}
