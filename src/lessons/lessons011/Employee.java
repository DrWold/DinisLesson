package lessons.lessons011;

import java.util.Random;

// класс - это описание или чертеж по которому будут созданы объекты
// свойства класса - набор переменных, которые будут доступны объекту
// методы - действия
public class Employee {

    //fields - свойства
    String name = "none";   //свойство-имя
    int age = 0;            //свойство-возрас работника
    double salary = 0.0;    //зарплата
    int stage = 0;          //стаж


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
