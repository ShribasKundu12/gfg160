public class Solution_11 {
    static int maxProduct(int[] arr) {
        // code here
        int currentMax  = arr[0];
        int maxProduct = currentMax;
        int currentMin = maxProduct;

        for(int i=1; i<arr.length; i++){

            int temp = Math.max(arr[i], Math.max(currentMax * arr[i],currentMin*arr[i]));
            currentMin = Math.min(arr[i],Math.min(currentMin*arr[i],currentMax*arr[i]));
            currentMax = temp;
            maxProduct = Math.max(maxProduct,currentMax);

        }
        return maxProduct;
    }
    public static void main(String[] args) {
        int arr[]  =new int[]{5, -6, 7, -1, 2};
            int ans = maxProduct(arr);
        System.out.println(ans);

    }
}