package LinearSearch;

public class FindingElement {
    public static void main(String[] args) {
        int[] arr = {23,45,1,2,7};
        int target=48;

        System.out.println(linearSearch(arr,target));
        System.out.println(linearSearchElement(arr,target));
    }

    private static int linearSearch(int[] arr,int target) {
        if(arr.length==0)
            return -1;

        for (int i=0; i< arr.length; i++){
            int element = arr[i];
            if(element==target)
                return i;
        }
        return -1;
    }

    private static int linearSearchElement(int[] arr,int target) {
        if(arr.length==0)
            return Integer.MAX_VALUE;

        for (int i=0; i< arr.length; i++){
            int element = arr[i];
            if(element==target)
                return element;
        }
        return Integer.MAX_VALUE;
    }
}
