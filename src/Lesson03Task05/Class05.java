package Lesson03Task05;

public class Class05 {

// 5. Write a function which calculates and returns the minimum of 4 arguments.
//    1) Function min(int a, int b, int c, int d) should use the function min(int a, int b).

    public static void main(String[] args) {
        // write your code here
        System.out.println(min(5, 7, 3, 9));
    }

    public static int min(int a, int b, int c, int d) {
        return min(a, min( b, min (c, d)));
    }

    public static int min(int a, int b) {
        return (a < b)? a : b;
    }


}
