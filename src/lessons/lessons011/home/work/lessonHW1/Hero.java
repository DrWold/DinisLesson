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
    int result;
    int damageHero;

    Hero() {
        this.hp = 0;
        this.damageMin = 0;
        this.damageMax = 0;

    }

    Hero(int hp, int potionHealing, int damageMin, int damageMax) {
        this.hp = hp;
        this.potions = new Potion[potionHealing];
        for (int i = 0; i <potionHealing ; i++) {
            this.potions[i] = new Potion(50);
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

    int fight(Demon demon) {
        // Логика боя
        damage();
        demon.hp -= damageHero;
        System.out.println("Вы ударили демона на " + damageHero);
        demon.damage();
        hp -= demon.damageDemon;
        System.out.println("и получили в ответ " + demon.damageDemon);

        if (hp < 0){
           return result = 1;
        }
        if (demon.hp < 0);
           return result = 2;
    }
     void fightGuard(Demon demon) {


         System.out.println("Вы поставили щит урон по вам снижен но и бьете вы тоже слабо");
         demon.hp -= damageGuard();
         System.out.println("Вы ударили демона на " + damageGuard() + "hp");
         hp -= demon.damageGuard();
         System.out.println("Демон ударил вас на " + demon.damageGuard() + "hp");


         }

    int damage() {
        damageHero = random.nextInt(damageMin) + damageMax;
        return 0;
    }

    int damageGuard() {
        int damageGuardHeroes;
        damageGuardHeroes = random.nextInt(damageMin) + damageMax;
        return (int) (damageGuardHeroes * 0.3);
    }


    }


