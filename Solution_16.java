
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_16 {
        // Function is to check whether two strings are anagram of each other or not.
        public static boolean areAnagrams(String s1, String s2) {
            boolean res;
            if(s1.length() == s2.length()) {
                List<Character> l1 = new ArrayList<>();
                List<Character> l2 = new ArrayList<>();
                for(int i=0; i<s1.length(); i++){
                    l1.add(s1.charAt(i));
                }
                for(int i=0; i<s2.length(); i++){
                    l2.add(s2.charAt(i));
                }
                Collections.sort(l1);
                Collections.sort(l2);
                if(l1.equals(l2)){
                    res= true;
                }
                else res =  false;
            }else res= false;
            return res;
        }
        public static void main(String[] args) {
            String s1 = "g";
            String s2 = "g";
            System.out.println(areAnagrams(s1,s2));
        }
}
