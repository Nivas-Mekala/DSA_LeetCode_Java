package Arrays;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};

        System.out.println(maxItemhere(arr));
        System.out.println(maxItemInRange(arr,3,4));
    }

    private static int maxItemhere(int[] arr) {
        int max=arr[0];
        for (int a:arr){
            if (a>max)
                    max=a;
        }
        return max;
    }

    private static int maxItemInRange(int[] arr,int start, int end) {
        int max=arr[start];
        for (int i=start; i<=end; i++){
            if (arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
