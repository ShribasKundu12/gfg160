//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    static final int MAX_CHAR = 26;
    static String getHash(String s){
        StringBuilder hash =  new StringBuilder();
        int freq[] = new int[MAX_CHAR];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0; i<MAX_CHAR; i++){
            hash.append(freq[i]);
            hash.append("$");
        }
        return hash.toString();
    }
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            String key = getHash(arr[i]);
            if(!mp.containsKey(key)){
                mp.put(key, res.size());
                res.add(new ArrayList<>());
            }
            res.get(mp.get(key)).add(arr[i]);
        }
        return res;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline after the test case input
        while (t-- > 0) {
            String inputLine = sc.nextLine();
            String[] arr = inputLine.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.anagrams(arr);
            result.sort(Comparator.comparing(a -> a.get(0)));
            for (ArrayList<String> group : result) {
                for (String word : group) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends