package lessons.lessons011.home.work.lessonHW1;

import java.util.Random;


public class Demon {
    Random random = new Random();
    int hp;
    int damageMin; //Минимальный урон Демона
    int damageMax; // Максимальный урон Демона
    int damageDemon;

    Demon (){
        this.hp = 0;
        this.damageMin = 0;
        this.damageMax = 0;
    }
    Demon(int hp,  int damageMin , int damageMax){
        this.hp = hp;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
    }

    int damage(){
        damageDemon = random.nextInt(damageMin) + damageMax;
        return 0;
    }
    int damageGuard() {
        int damageGuardDemon;
        damageGuardDemon = random.nextInt(damageMin) + damageMax;
        return (int) (damageGuardDemon * 0.3);
     }

    }
