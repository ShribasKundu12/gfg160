public class Solution_3 {
    public static void main(String[] args) {
        int arr[]  =new int[]{12,67,89,90,78,9,0};
        int start = 0;
        int temp;
        int end = arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(start == end) break;
            if(start<end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }

}