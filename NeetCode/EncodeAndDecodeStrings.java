package NeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        String[] str= {"Neet", "Code","Uber","Google"};
        String strEncode = encode(str);
        System.out.println("Encoded String:: "+strEncode);
        List<String> strDecode = decode(strEncode);
        System.out.println("Decoded String:: "+ strDecode);
    }

    private static List<String> decode(String strEncode) {
        List<String> res = new ArrayList<>();
        int i=0;
        while (i<strEncode.length()){
            int j=i;
            while (strEncode.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(strEncode.substring(i,j));
            i=j+1;
            j=i+len;
            res.add(strEncode.substring(i,j));
            i=j;
        }
        return res;
    }

    private static String encode(String[] str) {
        StringBuilder res = new StringBuilder();
        for (String s:str){
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }
}
