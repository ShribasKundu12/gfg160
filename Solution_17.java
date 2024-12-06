import java.sql.SQLOutput;
import java.util.*;

public class Solution_17 {

// User function Template for Java

        // Function to find the first non-repeating character in a string.
        static char nonRepeatingChar(String s) {


            // Your code here
            LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
            for(int i=0; i<s.length(); i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            char ch = 'c';
            for(Map.Entry<Character,Integer> e : map.entrySet()){
                if(e.getValue() == 1) {
                     ch = e.getKey();
                     break;
                }else ch = '$';
            }
            return ch;
        }
    public static void main(String[] args) {
            String s = "racecar";
            System.out.println(nonRepeatingChar(s));
    }
}