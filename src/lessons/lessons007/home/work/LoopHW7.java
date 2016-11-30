package lessons.lessons007.home.work;

// Текстовая игра: битва с Демоном
// Есть демон у него 500 жизней
// Есть герой у него 100 жизней и 3 зелья востанавливающие здоровье(по 50. ед)
// У игрока есть выбор
// 1. Узнать свое здоровье
// 2. Узнать здоровье босса
// 3. Выпить зелье
// 4. Ударить босса
// 5. Поставить щить
// 6. Попытаться увернуться от удара
// Правила следующие:
// Удар героя сносит 40-80 жизней босса
// Удара демона сносит 10-30 жизней героя
// Если игрок атакует босса, после он полуает удар от босса
// Если игрок выбирает щит, он защащет 70% удара
// Если игрок выбирает кувырок, он с вероятностью 50% может укланиться от удара, а может его получить
// Если игрок умер, написать что он проиграл, если убил демона написать что победил после, предложить ему сыграть еще раз(Y/N)

import java.util.Random;
import java.util.Scanner;

public class LoopHW7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int demonHp = 500;
        int heroHp = 100;
        char answer;
        int answer2;// ответ действия

        ////////////////////////////////////////////////////
        int damageHero;
        int damagedemon;
        int healthPotion = 3;
        int dodge;


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
            if (demonHp < 0) {
                System.out.println("Вы выйграли" + heroHp + "hp");
                return;
            }
            if (heroHp < 0) {
                System.out.println("Вы проиграли " + heroHp + "hp");
                return;
            }
            System.out.println("");
            System.out.println("Выберите действие ");
            System.out.println("1.Узнать свое здоровье");
            System.out.println("2.Узнать здоровье демона");
            System.out.println("3.Выпить зелье ");
            System.out.println("4. Ударить демона ");
            System.out.println("5. Сделать кувырок ");
            System.out.println("6. Поставить щит ");
            System.out.println("7. Убежать (выход)");
            System.out.println("");
            answer2 = scanner.nextInt();

            switch (answer2) {

                case 1:
                    System.out.println("У вас " + heroHp + "hp");
                    break;
                case 2:
                    System.out.println("У демона " + demonHp + "hp");
                    break;
                case 3:
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
                case 4:
                    damageHero = random.nextInt(40) + 40;
                    damagedemon = random.nextInt(20) + 10;
                    System.out.println("Вы ударили демона на " + damageHero);
                    demonHp -= damageHero;
                    System.out.println("и получили в ответ " + damagedemon);
                    heroHp -= damagedemon;
                    break;
                case 5:
                    dodge = random.nextInt(2);
                    System.err.println(dodge);
                    if (dodge == 0) {
                        System.out.println("Вы увернулись");
                        continue;
                    } else {
                        System.out.println("Вы не смогли увернуться");
                        damagedemon = random.nextInt(20) + 10;
                        heroHp -= damagedemon;
                        System.out.println("Демон нанес вам  " + damagedemon + "hp");
                    }
                    break;
                case 6:
                    System.out.println("Вы поставили щит урон по вам снижен но и бьете вы тоже слабо");
                    damageHero = random.nextInt(16) + 20;
                    damagedemon = random.nextInt(10) + 11;
                    demonHp -= damageHero;
                    System.out.println("Вы ударили демона на " + damageHero + "hp");
                    heroHp -= damagedemon;
                    System.out.println("Демон ударил вас на " + damagedemon + "hp");
                    break;
                case 7:
                    System.out.println("Ты трус");
                    return;
            }

        } while (true);
    }
}
