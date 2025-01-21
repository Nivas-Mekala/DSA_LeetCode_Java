package NeetCode;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"act","pots","tops","cat","stop","hat","zaap"};

        System.out.println(groupAnagrams(str));
    }

    private static List<List<String>> groupAnagrams(String[] str) {
        Map<String,List<String>> res = new HashMap<>();

        for(String s:str){
            int[] count= new int[26];
            for (char c:s.toCharArray()){
                count[c-'a']++;
            }
            String key= Arrays.toString(count);
            System.out.println("key:: "+key);
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
