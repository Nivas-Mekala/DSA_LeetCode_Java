package NeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {5,5};
        int target=10;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indices = new HashMap<>();
        for (int i=0; i< nums.length; i++){
            indices.put(nums[i], i);
           // System.out.println(indices.toString());
        }
      //  System.out.println(indices.toString());
        for (int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if(indices.containsKey(diff)&& indices.get(diff)!=i){
                return new int[]{i, indices.get(diff)};
            }
        }

        return new int[0];
    }
}
