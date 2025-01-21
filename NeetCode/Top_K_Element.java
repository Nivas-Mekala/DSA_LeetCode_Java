package NeetCode;

import java.util.*;

public class Top_K_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,5,6,8,9,10,10,10,10};
        int k=2;

        System.out.println(Arrays.toString(mostRepeatedElem(arr,k)));
    }

    public static int[] mostRepeatedElem(int[] arr,int k){
        Map<Integer,Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[arr.length+1];
       // ArrayList<Integer> freq = new ArrayList<>();

        for (int i=0; i<freq.length; i++){
            freq[i]= new ArrayList<>();
        }

        for (int n:arr){
            count.put(n,count.getOrDefault(n,0)+1);
        }

        System.out.println("count:: "+count);

        for (Map.Entry<Integer,Integer> entry: count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        System.out.println("freq:: "+Arrays.toString(freq));

        int[] res = new int[k];
        int index=0;
        for (int i= freq.length-1; i>0 && index <k; i--){
            for (int n: freq[i]){
                res[index++]=n;
                if (index==n){
                    return res;
                }
            }
        }

        return res;
    }

}
