package Lesson03Task11;

/*
11*. Write a program which prints the next figure to the console:
        *
        ***
        *****
        *******
        *********
        ***********
*/

public class Class11 {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++){
            for (int j = 1; j < i; j++){
                System.out.print("**");
            }
            System.out.println("*");
        }

    }

}
