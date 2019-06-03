package Lesson03Task07;

/*7. Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
        If one of the parameters is < 10, method should return -1 to indicate an invalid value.
        The method should return the greatest common divisor of two numbers.*/
//The greatest common divisor is the largest positive integer that can fully divide each of the integers(i.e. without living a remainder).

public class Class07 {

    static int getGreatestCommonDivisor(int first, int second){

        int divisor = -1;
        int min;

        if (first >= 10 && second >= 10 ) {
            min = (first < second) ? first : second;
            for (int i = min; i > 0; i--) {
                if (first % i == 0 && second % i == 0) {
                    divisor = i;
                    break;
                }
            }
        }
        return divisor;
    }

    public static void main(String[] args) {
        System.out.println( getGreatestCommonDivisor( 5, 34 ) );
        System.out.println( getGreatestCommonDivisor( 15, 125 ) );
        System.out.println( getGreatestCommonDivisor( 45, 60 ) );
        System.out.println( getGreatestCommonDivisor( 45, -60 ) );
    }

}
