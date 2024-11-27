public class Solution_8 {
    public static void main(String[] args) {
        //1, 3, 6, 9, 11
        //7, 10, 1, 3, 6, 9, 2
        //7, 6, 4, 3, 1
        int arr[]  =new int[]{7, 8, 9, 3, 1, 2, 4};
        int minSoFar = arr[0];
        int res = 0;
        for(int i=1; i<arr.length; i++){//3
            minSoFar = Math.min(minSoFar,arr[i]);
            res = Math.max(res,arr[i]-minSoFar);
        }
        System.out.println(res);
    }
}