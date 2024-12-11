package LinearSearch;

import java.util.Arrays;

public class MaxIN2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,-99,34,56},
                {18,48}
        };
        System.out.println(maxIN2DArray(arr));
    }

    private static int maxIN2DArray(int[][] arr) {
        int maxValue=arr[0][0];

        for (int row=0; row < arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                if(arr[row][col]>maxValue)
                    maxValue = arr[row][col];
            }
        }
        return maxValue;
    }
}
