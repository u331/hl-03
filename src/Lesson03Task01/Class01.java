package Lesson03Task01;

//1. Print numbers from 10 to 20 using all known cycles.

public class Class01 {

    static void printFor(int min, int max){
        for (int i = min; i <=  max; i++){
            System.out.println(i);
        }
    }

    static void printForeach(int min, int max){
        int[] arr = new int[max - min + 1];
        for (int el: arr){
            System.out.println(min++);
        }
    }

    static void printWhile(int min, int max){
        while (min <= max){
            System.out.println(min++);
        }
    }

    static void printDoWhile(int min, int max){
        do{
            System.out.println(min++);
        }while (min <= max);
    }

    public static void main(String[] args) {

        int min = 10, max = 20;

        printFor(min, max);
        printForeach(min, max);
        printWhile(min, max);
        printDoWhile(min, max);

    }
}
