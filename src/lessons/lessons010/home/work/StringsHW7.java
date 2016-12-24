package lessons.lessons010.home.work;


import java.util.Random;
import java.util.Scanner;

public class StringsHW7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int demonHp = 500;
        int heroHp = 100;
        char answer;
        String answer2;// ответ действия

        ////////////////////////////////////////////////////
        int damageHero;
        int damageDemon;
        int healthPotion = 3;
        int dodge;


        boolean god = false;
        for (String arg : args){
            if (arg.equals("god")){
                god=true;
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
            if (god){
                System.out.println("Вы бог");
                heroHp = 1000000;
            }
            if (demonHp < 0) {
                System.out.println("Вы выйграли" + heroHp + "hp");
                return;
            }
            if (heroHp < 0) {
                System.out.println("Вы проиграли " + heroHp + "hp");
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
                    System.out.println("У вас " + heroHp + "hp");
                    break;
                case "демон":
                    System.out.println("У демона " + demonHp + "hp");
                    break;
                case "зелье":
                    if (god){
                        System.out.println("для бога это не нужно");
                        continue;
                    }
                    if (heroHp == 100) {
                        System.out.println("у вас полное здоровье ");
                        continue;
                    }
                    if (healthPotion == 0) {
                        System.out.println("нет зелей");
                        continue;
                    }
                    System.out.println("Вы восстановили 50 hp");
                    healthPotion--;
                    System.out.println("У вас осталось зелей " + healthPotion + " из 3 ");
                    heroHp += 50;
                    if (heroHp > 100) {
                        heroHp = 100;
                    }
                    break;
                case "удар":
                    damageHero = random.nextInt(40) + 40;
                    damageDemon = random.nextInt(20) + 10;
                    System.out.println("Вы ударили демона на " + damageHero);
                    demonHp -= damageHero;
                    System.out.println("и получили в ответ " + damageDemon);
                    heroHp -= damageDemon;
                    break;
                case "кувырок":
                    dodge = random.nextInt(2);
                    System.err.println(dodge);
                    if (dodge == 0) {
                        System.out.println("Вы увернулись");
                        continue;
                    } else {
                        System.out.println("Вы не смогли увернуться");
                        damageDemon = random.nextInt(20) + 10;
                        heroHp -= damageDemon;
                        System.out.println("Демон нанес вам  " + damageDemon + "hp");
                    }
                    break;
                case "щит":
                    System.out.println("Вы поставили щит урон по вам снижен но и бьете вы тоже слабо");
                    damageHero = random.nextInt(40) + 40;
                    damageDemon = random.nextInt(20) + 10 ;
                    damageHero *= 0.3;
                    demonHp -= damageHero ;
                    System.out.println("Вы ударили демона на " + damageHero + "hp");
                    damageDemon *= 0.3;
                    heroHp -= damageDemon ;
                    System.out.println("Демон ударил вас на " + damageDemon + "hp");
                    break;
                case "убежать":
                    if (god){
                        System.out.println("Не смеши");
                        continue;
                    }
                    System.out.println("Ты трус");
                    return;
            }

        } while (true);
    }
}
