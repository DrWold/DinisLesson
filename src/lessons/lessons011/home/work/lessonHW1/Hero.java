package lessons.lessons011.home.work.lessonHW1;


// Переписать текстовую игру с использованием классов
// Необходимо создать 2 класса, герой и злодей
// Каждый класс хранит в себе кол-во жизней, урон и герой может хранить у себя кол-во зелей, которые он может пить
// у каждого класса необходимо реализовать набор методов, к примеру выпить зелье или нанести удар противнику,
// а также создать необходимые конструкторы

import java.util.Random;

public class Hero {
    Random random = new Random();
    int hp;
    Potion [] potions = null;
    int damageMin; //Минимальный урон героя
    int damageMax; // Максимальный урон героя



    Hero() {
        this.hp = 0;
        this.damageMin = 0;
        this.damageMax = 0;
        this.potions = new Potion[0];

    }

    Hero(int hp, int potionHealing, int damageMin, int damageMax ) {
        this.hp = hp;
        this.potions = new Potion[potionHealing];
        for (int i = 0; i <potionHealing ; i++) {
            this.potions[i] = new Potion();
        }
        this.damageMin = damageMin;
        this.damageMax = damageMax;
    }

    void printInfo() {
        System.out.println("Здоровье героя: " + hp);
        System.out.println("Кол-во зелей: " + potions.length);
    }

    void usePotion() {
        if (hp == 100) {
            System.out.println("у вас полное здоровье ");
            return;
        }

        if (potions.length ==0) {
            System.out.println("нет зелей");
            return;
        }
        Potion current = potions[0];
        System.out.println("Вы восстановили " + current.recoveryHp + " Hp");
        Potion[] dest = new Potion[potions.length -1];
        System.arraycopy( potions, 1, dest, 0, potions.length -1 );
        potions = dest;


        System.out.println("У вас осталось зелей " + potions.length);
        hp += current.recoveryHp; // Исправить число 50, читать из класса зелья
        if (hp > 100) {
            hp = 100;
        }

    }

    void fight(Demon demon) {
        // Логика боя
        int tempDamage = damage();
        demon.hp -= tempDamage;
        System.out.println("Вы ударили демона на " + tempDamage);
        int tempDemon = demon.damage();
        hp -= tempDemon;
        System.out.println("и получили в ответ " + tempDemon);
    }



//     void fightGuard(Demon demon) {
//
//
//         int result;
//         int tempDamageGuard = damage();
//         demon.hp -= tempDamageGuard;
//         System.out.println("Вы ударили демона на " + tempDamage);
//         int tempDemon = demon.damage();
//         hp -= tempDemon;
//         System.out.println("и получили в ответ " + tempDemon);
//
//         if (hp < 0) {
//             System.out.println("проиграл");
//             return result = 0;
//         }
//         if (demon.hp < 0) ;
//         System.out.println("выйграл");
//         return result = 0;
//     }




    int damage() {
        int damageHero;
        damageHero = random.nextInt(damageMin) + damageMax;
        return damageHero;
    }

    int damageGuard() {
        int damageGuardHeroes;
        damageGuardHeroes = random.nextInt(damageMin) + damageMax;
        return (int) (damageGuardHeroes * 0.3);
    }


    }


