package LinearSearch;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr={18,12,7,3,14,28};
        System.out.println(minimum(arr));
    }

    static int minimum(int[] arr){
        int minValue= arr[0];

        for (int i : arr){
            if(minValue>i)
                minValue=i;
        }

        return minValue;
    }
}
