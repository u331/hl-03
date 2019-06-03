package Lesson03Task02;

//2. Print all the numbers from 1 to 100, which are divided by 3 without a remainder.

public class Class02a {

    public static void main(String[] args) {
        // There are advanced algorithm.
        // The simpliest algorithm is in the Class02 class
        int min , max = 100, divisor = 3;
        min = divisor;

        for (int i = min; i < max; i+=divisor){
                System.out.println(i);
        }

    }

}
