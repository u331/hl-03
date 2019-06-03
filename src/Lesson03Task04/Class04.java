package Lesson03Task04;

//4. Given an array of 10 integers. To display the sum of all its elements except the first and last.

public class Class04 {

    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < 10; i++){
            if( i != 0 && i != 9){
                System.out.println(arr[i]);
                sum += arr[i];
            }
        }

        System.out.println(sum);

    }

}
