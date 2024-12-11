package LeetCode;

//leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
// 1295
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int [] arr= {12,345,2,6,7896};

        System.out.println(evenNumberOfDigits(arr));
    }

    private static int evenNumberOfDigits(int[] arr) {
        int count=0;
        for (int a : arr)
            if(numberOfDigits(a)%2==0)
                count++;
        return count;
    }

    private static int numberOfDigits(int a) {
       // int no=0;
        if (a <0)
            a=a*-1;
        return (int) Math.log10(a);
    }
}

