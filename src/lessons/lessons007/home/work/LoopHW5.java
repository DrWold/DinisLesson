package lessons.lessons007.home.work;

//С помощью вложенных циклов нарисовать обратную ступеньку:
//**********
//*********
//********
//*******
//******
//*****
//****
//***
//**
//*
public class LoopHW5 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i == 9) {
//                break;
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 10; i++) {

            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
