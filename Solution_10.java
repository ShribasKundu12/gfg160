public class Solution_10 {
    public static void main(String[] args) {
        int []arr = new int[]{2, 3, -8, 7, -1, 2, 3};

        int currentMax = arr[0];
        int maxSumOfSubArray = currentMax;

        for(int i=1; i<arr.length; i++){

            currentMax = Math.max(arr[i],currentMax+arr[i]);

            if(maxSumOfSubArray < currentMax)
                maxSumOfSubArray = currentMax;
        }
        System.out.println(maxSumOfSubArray);
    }
}