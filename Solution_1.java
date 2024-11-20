//{Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution_1{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length <2) return -1;
        int max=0,secondMax = 0;
        for(int value:arr){
            if(value>max) {
                secondMax = max;
                max=value;
            }else if(value > secondMax && value != max){
                secondMax = value;
            }
        }
        if(secondMax == 0) return -1;
        return secondMax;
    }

}