package Lesson03Task10;

/*
10*. Write a program which prints the next figure to the console:
        **********
        *           *
        *           *
        *           *
        **********
*/

public class Class10 {

    public static void main(String[] args) {

        int from = 1, to = 5;

        for (int i = from; i <= to; i++){
            if( i == from || i == to){
                for (int j = 1; j < 10; j++){
                    System.out.print("*");
                }
                System.out.println("*");
            } else {
                System.out.print("*");
                for (int j = 1; j <= 11; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

    }

}
