package lessons.lessons011.home.work.lessonHW1;

import java.util.Random;
import java.util.Scanner;

// Переписать текстовую игру с использованием классов
// Необходимо создать 2 класса, герой и злодей
// Каждый класс хранит в себе кол-во жизней, урон и герой может хранить у себя кол-во зелей, которые он может пить
// у каждого класса необходимо реализовать набор методов, к примеру выпить зелье или нанести удар противнику,
// а также создать необходимые конструкторы
public class lessons1 {
    public static void main(String[] args) {
        Heroes heroes = new Heroes(100, 3, 40, 40);
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
                heroes.hp = 1000000;
            }
            if (demon.hp < 0) {
                System.out.println("Вы выйграли" + demon.hp + "здоровье демона");
                return;
            }
            if (heroes.hp < 0) {
                System.out.println("Вы проиграли " + heroes.hp + "hp");
                return;
            }

            System.out.println("");
            System.out.println("Введите команду ");
            System.out.println("герой : Узнать свое здоровье");
            System.out.println("демон : Узнать здоровье демона");
            System.out.println("зелье : Выпить зелье ");
            System.out.println("удар : Ударить демона ");
            System.out.println("кувырок : Сделать кувырок ");
            System.out.println("щит : Поставить щит ");
            System.out.println("убежать : (выход)");
            System.out.println();

            answer2 = scanner.next();
            String register = answer2.toLowerCase();

            switch (register) {

                case "герой":
                    System.out.println("здоровье героя " + heroes.hp);
                    break;
                case "демон":
                    System.out.println("здоровье демона " + demon.hp);
                    break;
                case "зелье":
                    if (god) {
                        System.out.println("для бога это не нужно");
                        continue;
                    }
                    if (heroes.hp == 100) {
                        System.out.println("у вас полное здоровье ");
                        continue;
                    }
                    if (heroes.potionHealing == 0) {
                        System.out.println("нет зелей");
                        continue;
                    }
                    System.out.println("Вы восстановили 50 hp");
                    heroes.potionHealing--;
                    System.out.println("У вас осталось зелей " + heroes.potionHealing);
                    heroes.hp += 50;
                    if (heroes.hp > 100) {
                        heroes.hp = 100;
                    }
                    break;

                case "удар":
                    System.out.println("Вы ударили демона на " + heroes.damage());
                    demon.hp -= heroes.damage();
                    System.out.println("и получили в ответ " + demon.damage());
                    heroes.hp -= demon.damage();
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
                        heroes.hp -= demon.damage();
                        System.out.println("Демон нанес вам  " + demon.damage() + "hp");
                    }
                    break;
                case "щит":
                    System.out.println("Вы поставили щит урон по вам снижен но и бьете вы тоже слабо");
                    demon.hp -= heroes.damageGuard();
                    System.out.println("Вы ударили демона на " + heroes.damageGuard() + "hp");
                    heroes.hp -= demon.damageGuard();
                    System.out.println("Демон ударил вас на " + demon.damageGuard() + "hp");
                    break;
                case "убежать":
                    if (god) {
                        System.out.println("Не смеши");
                        continue;
                    }
                    System.out.println("Ты трус");
                    return;

            }
        }
        while (true);


    }

}



