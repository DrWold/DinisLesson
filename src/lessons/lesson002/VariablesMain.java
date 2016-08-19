package lessons.lesson002;

//Ctrl + W - умное выделение

//[тип данных] [идентификатор] = значение;
//int,byte,short,long,char,double,float,boolean
public class VariablesMain {

    public static void main(String[] args) {

        //Инициализация перменной
        //Создание
        int healthMainHero = 100;

        System.out.println("Жизни главного героя: " + healthMainHero);

        //присваение
        healthMainHero = 2 + 2 * 2; // 6 = 2 + 4
        healthMainHero = (2 + 2) * 2; // 8 = 4 * 2

        System.out.println("Жизни главного героя: " + healthMainHero);

        healthMainHero = (healthMainHero * 2);

        System.out.println("Жизни главного героя: " + healthMainHero);


        double balance1 = 2500.37; // руб.
        double balance2 = 5403.56; // руб.

        System.out.println("Баланс первого пользователя " + balance1 + " , Баланс второго пользователя " + balance2);

        balance1 = balance1 - 100;
        balance2 = balance2 + 100;

        System.out.println("Баланс первого пользователя " + balance1 + " , Баланс второго пользователя " + balance2);

        //Имена для вспом. переменных
        //var,temp,foo,a1,b1,x1,i
        int temp1;
        int temp2;

        //2+2 -> 4

        temp1 = (temp2 = 5) * 2;
        System.out.println("Temp1 : " + temp1 + " , Temp2 : " + temp2);

        //"2"+2 -> "22"
        System.out.println("2+2 = " + (2 + 2));
    }

}
