//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static final int MAX_CHAR = 26;
    public int longestUniqueSubstr(String s) {
        // code here
        if(s.length()==0 || s.length() ==1)
            return s.length();
        int res = 0;
        boolean[] vis = new boolean[MAX_CHAR];
        int left = 0,right=0;
        while(right<s.length()){
            while(vis[s.charAt(right)-'a']==true){
                vis[s.charAt(left)-'a'] = false;
                left++;
            }
            vis[s.charAt(right) -'a'] = true;
            res = Math.max(res,(right-left+1));
            right++;
        }
        return res;
    }
}