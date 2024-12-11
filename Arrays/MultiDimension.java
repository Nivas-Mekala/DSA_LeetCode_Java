package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][];
        int [][] arr2D= {
                {1,2,3},
                {4,6},
                {7,8,9,10,11}
        };

        for (int i=0; i< arr2D.length; i++){
            for (int j=0; j< arr2D[i].length; j++){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }

        for (int i=0; i< arr2D.length; i++){
            System.out.println(Arrays.toString(arr2D[i]));
        }

        for (int[] a:arr2D){
            System.out.println(Arrays.toString(a));
        }
    }
}
