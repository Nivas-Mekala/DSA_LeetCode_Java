package LinearSearch;

public class SearchingInString {
    public static void main(String[] args) {
        String name="Lahari";
        char ch='r';
        System.out.println(search(name,ch));
    }
    static boolean search(String str, char ch){
        if (str.isEmpty())
            return false;
        for(int i=0; i<str.length(); i++){
            if (ch == str.charAt(i)){
                return true;
            }
        }
        return  false;
    }
    static boolean search2(String str, char ch){
        if (str.isEmpty())
            return false;
        for (char ch1 : str.toCharArray()){
            if (ch1 == ch )
                return true;
        }
        return  false;
    }
}
