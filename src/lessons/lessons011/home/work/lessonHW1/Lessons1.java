package lessons.lessons011.home.work.lessonHW1;

import java.util.Random;
import java.util.Scanner;

// Переписать текстовую игру с использованием классов
// Необходимо создать 2 класса, герой и злодей
// Каждый класс хранит в себе кол-во жизней, урон и герой может хранить у себя кол-во зелей, которые он может пить
// у каждого класса необходимо реализовать набор методов, к примеру выпить зелье или нанести удар противнику,
// а также создать необходимые конструкторы
public class Lessons1 {
    public static void main(String[] args) {

        Hero hero = new Hero(50, 4, 54, 54);
        Demon demon = new Demon(500, 10, 20);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char answer;
        String answer2;// ответ действия

        ////////////////////////////////////////////////////


        boolean god = false;
        for (String arg : args) {
            if (arg.equals("god")) {
                god = true;
            }
        }
            int result;
        ////////////////////////////////////////////////////


        System.out.println("|----------------------------------------------------------|");
        System.out.println("|                    Герой против Демона                   |");
        System.out.println("|--------------------------------------------------------- |");
        System.out.println("Чтоб начать игру нажмите Y/N");
        answer = scanner.next().charAt(0);
        if (answer != 'Y' && answer != 'y') {
            return;
        }
        do {
            if (god) {
                System.out.println("Вы бог");
                hero.hp = 1000000;
            }



            System.out.println("");
            System.out.println("Введите команду ");
            System.out.println("герой : Узнать свое здоровье");
            System.out.println("демон : Узнать здоровье демона");
            System.out.println("зелье : Выпить зелье ");
            System.out.println("удар : Ударить демона ");
            System.out.println("кувырок : Сделать кувырок ");
            //System.out.println("щит : Поставить щит ");
            System.out.println("убежать : (выход)");
            System.out.println();

            answer2 = scanner.next();
            String register = answer2.toLowerCase();

            switch (register) {

                case "герой":
                    hero.printInfo();
                    break;
                case "демон":
                    System.out.println("здоровье демона " + demon.hp);
                    break;
                case "зелье":
                    if (god) {
                        System.out.println("для бога это не нужно");
                        continue;
                    }
                   hero.usePotion();
                    break;
                case "удар":
                    result = hero.fight(demon);
                    if (result == 1) {return;}
                    break;
                case "кувырок":
                    int dodge;
                    dodge = random.nextInt(2);
                    System.err.println(dodge);
                    if (dodge == 0) {
                        System.out.println("Вы увернулись");
                        continue;
                    } else {
                        System.out.println("Вы не смогли увернуться");
                        hero.hp -= demon.damage();
                        System.out.println("Демон нанес вам  " + demon.damage() + "hp");
                    }
                    break;
//                case "щит":
//                    hero.fightGuard(demon);
//                    break;
                case "убежать":
                    if (god) {
                  System.out.println("Не смеши");
                        continue;
                    }
                    System.out.println("Ты трус");
                    return;

            }
        } while (true);


    }

}



