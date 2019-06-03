package Lesson03Task06;

/*6. Write a method named getEvenDigitSum with one parameter of the type "int".
        The method should return the sum of even digits within the number.
        If the number is negative, method should return -1;*/

public class Class06 {

    static int getEvenDigitSum(int a){

        int sum = -1;

        if (a > 0) {
            sum = 0;
            while ( a > 0){
                if(a % 2 == 0) {
                    sum += a % 10;
                }
                a /= 10;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12345678));
    }


}
