import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Solution_13 {
    public static int missingNumber(int[] arr) {
        // Your code here
       //-3 1 1 2 4 7
        int j = 1;
        Arrays.sort(arr);
        for(int val:arr){//4
            if(val<0) continue;
            if(val==j){
                j++;//3
            }else if(val>j) return j;
        }
        return j;
    }
    public static void main(String[] s){
            int arr[] = new int[]{};
        System.out.println(missingNumber(arr));
    }
}