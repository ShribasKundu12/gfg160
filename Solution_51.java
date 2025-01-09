//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            int target = Integer.parseInt(sc.nextLine());

            Solution ob = new Solution();
            int ans = ob.countTriplets(arr, target);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            int le=i+1,ri=n-1;
            while(le<ri){
                int sum = arr[i]+arr[le]+arr[ri];
                if(sum<target){
                    le+=1;
                }
                else if(sum>target){
                    ri-=1;
                }
                else if(sum == target){
                    int ele1 = arr[le],ele2=arr[ri];
                    int c1=0,c2=0;
                    while(le<=ri && arr[le] ==ele1){
                        le++;
                        c1++;
                    }
                    while(le<=ri && arr[ri] == ele2){
                        ri--;c2++;
                    }
                    if(ele1 == ele2)
                        res+=(c1*(c1-1))/2;
                    else
                        res+=(c1*c2);
                }
                
            }
        }
        return res;
    }
}