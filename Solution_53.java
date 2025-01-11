//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        List<Integer> res = new ArrayList<>();
        int mindiff=Integer.MAX_VALUE;
        int left =0,right=n-1;
        while(left<right){
            int currsum = arr[left]+arr[right];
            if(Math.abs(target-currsum)<mindiff){
                mindiff=Math.abs(target-currsum);
                res=Arrays.asList(arr[left],arr[right]);
            }
            if(currsum<target){
                left++;
            }else if(currsum>target) right--;
            else return res;
        }
        return res;
    }
}