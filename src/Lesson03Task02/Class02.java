package Lesson03Task02;

//2. Print all the numbers from 1 to 100, which are divided by 3 without a remainder.

public class Class02 {

    public static void main(String[] args) {

        int min = 1, max = 100, divisor = 3;

        for (int i = min; i < max; i++){
            if( i % divisor == 0){
                System.out.println(i);
            }
        }

    }

}
