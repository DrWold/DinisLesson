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
        int damageHero ;
        int damagedemon   ;
        int healthPotion = 3;
        int dodge;



        ////////////////////////////////////////////////////


        System.out.println("|----------------------------------------------------------|");
        System.out.println("|                    Герой против Демона                   |");
        System.out.println("|--------------------------------------------------------- |");
        System.out.println("Чтоб начать игру нажмите Y/N");
        answer = scanner.next().charAt(0);
        if (answer != 'Y' && answer != 'y' ){
            return;
        }
        do {

            System.out.println("");
            System.out.println("Выберите действие ");
            System.out.println("1.Узнать свое здоровье");
            System.out.println("2.Узнать здоровье демона");
            System.out.println("3.Выпить зелье ");
            System.out.println("4. Ударить демона ");
            System.out.println("5. Сделать кувырок ");
            System.out.println("6. Поставить щит ");
            System.out.println("7.Предложить выпить (вероятность убить мгновенно демона));");
            System.out.println("8. Убежать (выход)");
            System.out.println("");
            answer2 = scanner.nextInt();

          switch (answer2){
              case 1:
                  System.out.println("У вас " + heroHp + "hp");
                  break;
              case 2:
                  System.out.println("У демона " + demonHp + "hp");
                  break;
              case 3:
                  break;
              case 4:
                  damageHero = random.nextInt(40) + 10 ;
                  damagedemon = random.nextInt(30) + 10;
                  System.out.println("Вы ударили демона на " + damageHero  );
                  demonHp -= damageHero;
                  System.out.println("и получили в ответ " + damagedemon);
                  heroHp -= damagedemon;
                  break;
              case 5:
                dodge = random.nextInt(5) + 50;
                  System.err.println(dodge);
                  if (dodge == 50){
                      System.out.println("Вы увернулись");
                      continue;
                  }else{
                      System.out.println("Вы не смогли увернуться");
                      damagedemon = random.nextInt(30) + 10;
                      heroHp -= demonHp;
                      System.out.println("Демон нанес вам  " + damagedemon + "hp" );
                  }
                  break;
              case 6:
                  System.out.println("Вы поставили щит урон по вам снижен но и бьете вы тоже слабо");
                  damageHero = random.nextInt(5) + 20;
                  damagedemon = random.nextInt(3) + 10 ;
                  damageHero -= damageHero;
                  System.out.println("Вы ударили демона на " + damageHero + "hp");
                  heroHp -= damagedemon;
                  System.out.println("Демон ударил вас на " + damagedemon + "hp");
          }

        }while (true);
    }
}
