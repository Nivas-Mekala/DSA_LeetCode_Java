package NeetCode;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10};
        System.out.println(Arrays.toString(productArray(arr)));
    }

    private static int[] productArray(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0]=1;
        suff[n-1]=1;

        for (int i=1; i<n; i++){
            pref[i]= arr[i-1]*pref[i-1];
        }
        System.out.println("Prefix:: "+Arrays.toString(pref));
        for (int i=n-2; i>=0; i--){
            suff[i]=arr[i+1]*suff[i+1];
        }
        System.out.println("suffix:: "+Arrays.toString(suff));
        for (int i=0; i<n; i++){
            res[i] = pref[i] * suff[i];
        }

        return res;
    }
}
