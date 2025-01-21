package NeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,11};
        System.out.println(containsDuplicates(nums));
        System.out.println(containsDuplicatesHash(nums));
        System.out.println(containsDuplicatesHashSetLen(nums));
    }

    private static boolean containsDuplicatesHashSetLen(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    private static boolean containsDuplicatesHash(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num: nums){
            if(seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }

    private static boolean containsDuplicates(int[] nums) {
        boolean duplicate=false;
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]==nums[j]){
                    duplicate=true;
                    break;
                }

            }
        }
        return duplicate;
    }
}
