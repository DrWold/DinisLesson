package lessons.lessons011.home.work.lessonHW1;


// Переписать текстовую игру с использованием классов
// Необходимо создать 2 класса, герой и злодей
// Каждый класс хранит в себе кол-во жизней, урон и герой может хранить у себя кол-во зелей, которые он может пить
// у каждого класса необходимо реализовать набор методов, к примеру выпить зелье или нанести удар противнику,
// а также создать необходимые конструкторы



import java.util.Random;

public class Heroes {
    Random random = new Random();
    int hp;
    int potionHealing; // кол-во лечебных зелей у героя
    int damagMin; //Минимальный урон героя
    int damagMax; // Максимальный урон героя

    Heroes() {
        this.hp = 0;
        this.damagMin = 0;
        this.damagMax = 0;
        this.potionHealing = 0;
    }

    Heroes(int hp, int potionHealing, int damegMin, int damegMax) {
        this.hp = hp;
        this.potionHealing = potionHealing;
        this.damagMin = damegMin;
        this.damagMax = damegMax;


    }

    int damage() {
        int damageHero;
        damageHero = random.nextInt(damagMin) + damagMax;
        return damageHero;
    }

    int damageGuard() {
        int damageGuardeHeroes;
        damageGuardeHeroes = random.nextInt(damagMin) + damagMax;
        return damageGuardeHeroes *= 0.3;


    }


}