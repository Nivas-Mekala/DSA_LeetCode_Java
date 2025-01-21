package LeetCode;

import java.util.Arrays;

public class BuildArrayFrompermutation {
    public static void main(String[] args) {

        int [] arr = {5,0,1,2,3,4};

        System.out.println(Arrays.toString(buildArray(arr)));
        System.out.println(Arrays.toString(buildArrayConstantSpace(arr)));

    }

    public static int[] buildArrayConstantSpace(int[] nums) {
       // int arrayOutput[]=new int[nums.length];
        int n = nums.length;

        for(int i=0; i< n; i++){
            nums[i]=nums[i]+(nums[nums[i]]%n)*n;
            System.out.println(nums[i]);
        }
        for(int i=0; i< n; i++){
            nums[i]=nums[i]/n;
            System.out.println(nums[i]);
        }
        return nums;
    }

    public static int[] buildArray(int[] nums) {
        int arrayOutput[]=new int[nums.length];

        for(int i=0; i< nums.length; i++){
            arrayOutput[i]=nums[nums[i]];
        }
        return arrayOutput;
    }
}
