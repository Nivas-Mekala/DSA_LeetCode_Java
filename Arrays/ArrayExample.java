package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        arr[0]=1;
        arr[1]=123;
        arr[2]=144;
        arr[3]=188;
        arr[4]=190;

        System.out.println(arr[3]);

        System.out.println(Arrays.toString(arr));

//        for (int i=0; i< arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for (int j : arr) { // for every element in array, print the element
//            System.out.println(j + " ");
//        }
    }
}
