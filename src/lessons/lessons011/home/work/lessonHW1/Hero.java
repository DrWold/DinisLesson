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
    Potion[] potions = null;
    //int potionHealing; // кол-во лечебных зелей у героя
    int damageMin; //Минимальный урон героя
    int damageMax; // Максимальный урон героя

    Hero() {
        this.hp = 0;
        this.damageMin = 0;
        this.damageMax = 0;
        this.potionHealing = 0;
        potions = new Potion[3];
    }

    Hero(int hp, int potionHealing, int damageMin, int damageMax) {
        this.hp = hp;
        this.potions = new Potion[potionHealing];
//        this.potionHealing = potionHealing;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
    }

    void printInfo() {
        System.out.println("Здоровье героя: " + hp);
        System.out.println("Кол-во зелей: " + potionHealing);
    }

    void usePotion() {
        if (hp == 100) {
            System.out.println("у вас полное здоровье ");
            return;
        }

        if (potionHealing == 0) {
            System.out.println("нет зелей");
            return;
        }
        System.out.println("Вы восстановили 50 hp");
        potionHealing--;
        System.out.println("У вас осталось зелей " + potionHealing);
        hp += 50;
        if (hp > 100) {
            hp = 100;
        }
    }

    void fight(Demon demon) {
        // Логика боя
        System.out.println("Вы ударили демона на " + hero.damage());
        demon.hp -= hero.damage();
        System.out.println("и получили в ответ " + demon.damage());
        hero.hp -= demon.damage();
    }

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