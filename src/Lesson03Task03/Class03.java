package Lesson03Task03;

//3. Fill the array with numbers from 100 to 0.

public class Class03 {

    public static void main(String[] args) {
        int a = 100;
        int[] arr = new int[101];

        for(int el: arr){
            el = a--;
        }

    }

}
