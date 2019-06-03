package Lesson03Task08;

/*
8. Write a program which prints the next figure to the console:
        **********
        **********
        **********
        **********
*/


public class Class08 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){
            for (int j = 1; j < 10; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

    }

}
