//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2 {

    public static void main(String[] args) throws Exception {
        int arr[]  = new int[]{0,0,0};
        Solution s = new Solution();
        s.pushZerosToEnd(arr);
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
// 1 2 3 5 8 9 8 9 0
        int count = 0,zeroCount = 0;//6
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }else zeroCount++;
        }
        /*System.out.println(zeroCount);
        System.out.println(count);*/

        for(int i= arr.length-1;i>=count;i--){
            arr[i] = 0;
        }
        //System.out.print("[");
        for(int val:arr) {
            System.out.print(val + " ");
        }
    }
}