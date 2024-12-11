import java.util.Arrays;
import java.util.Collections;

public class Solution_22 {
    public static int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        reverse(citations);
        int i=0;
        while(i < citations.length){
            if(citations[i] > i){
                i++;
            }else break;
        }
        return i;
    }
    public static void reverse(int arr[]){
        int st = 0;
        int end = arr.length-1;
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        int []arr = new int[]{3,0,5,3,1};
        System.out.println(hIndex(arr));
    }
}