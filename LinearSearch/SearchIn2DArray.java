package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,48}
        };
        int target=48;
        System.out.println(Arrays.toString(searchin2d(arr,target)));
    }

    static int[] searchin2d(int[][] arr, int target){

        for (int i=0; i<arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
                if(arr[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
