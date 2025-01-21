package NeetCode;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "nivas";
        String t = "Savin";

        System.out.println(isAnagram(s,t));
    }

    private static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        HashMap<Character,Integer> countS = new HashMap<>();
        HashMap<Character,Integer> countT = new HashMap<>();

        for (int i=0; i< s.length(); i++){
            countS.put(s.charAt(i),countS.getOrDefault(s.charAt(i),0)+1);
            countT.put(t.charAt(i),countT.getOrDefault(t.charAt(i),0)+1);
        }
        return countS.equals(countT);
    }
}
