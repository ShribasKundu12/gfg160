//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String S = in.readLine();

            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    static int maxLength(String s) {
        // code here
        int maxl = 0;
        int o=0,c=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                o++;
            }else if(ch==')'){
                c++;
            }
            if(o==c){
                maxl= Math.max(maxl,2*c);
            }else if(c>o){
                o=c=0;
            }
        }
        o = c= 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) =='('){
                o++;
            }else if(s.charAt(i) ==')'){
                c++;
            }
            if(o==c){
                maxl = Math.max(maxl,2*o);
            }else if(o>c){
                o=c=0;
            }
        }
        return maxl;
    }
}