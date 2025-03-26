//{ Driver Code Starts
import java.util.*;

public class Solution98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            ArrayList<Double> ans = ob.getMedian(nums);
            for (double i : ans) {
                System.out.printf("%.1f ", i);
            }
            System.out.println();
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        PriorityQueue<Integer> leftMaxHeap = new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>();
        ArrayList<Double> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            leftMaxHeap.add(arr[i]);
            int temp=  leftMaxHeap.poll();
            rightMinHeap.add(temp);
            if(rightMinHeap.size() > leftMaxHeap.size()){
                temp=rightMinHeap.poll();
                leftMaxHeap.add(temp);
            }
            double median;
            if(leftMaxHeap.size() != rightMinHeap.size())
                median = leftMaxHeap.peek();
            else
                median = (leftMaxHeap.peek() + rightMinHeap.peek())/2.0;
            res.add(median);
        }
        return res;
    }
}