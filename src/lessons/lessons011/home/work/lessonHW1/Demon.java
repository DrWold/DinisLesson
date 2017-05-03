package lessons.lessons011.home.work.lessonHW1;

import java.util.Random;


public class Demon {
    Random random = new Random();
    int hp;
    int damageMin; //Минимальный урон Демона
    int damageMax; // Максимальный урон Демона

    Demon (){
        this.hp = 0;
        this.damageMin = 0;
        this.damageMax = 0;
    }
    Demon(int hp,  int damegMin , int damegMax){

        this.hp = hp;
        this.damageMin = damegMin;
        this.damageMax = damegMax;


    }

    int damage(){
        int damageDemon;
        damageDemon = random.nextInt(damageMin) + damageMax;
        return damageDemon;
    }
    int damageGuard() {
        int damageGuardeDemon;
        damageGuardeDemon = random.nextInt(damageMin) + damageMax;
        return damageGuardeDemon *= 0.3;
     }

    }
