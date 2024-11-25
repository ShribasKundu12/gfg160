import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Sol{
    public static void main(String[] str){
        int arr[]  =new int[]{2,1,5,5,5,5,6,6,6,6,6};
        List<Integer> l =new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int length = arr.length;

        for(int key:arr){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()> length/3){
                l.add(e.getKey());
            }
        }
        System.out.println(map);
        System.out.println(l);
    }
}/*
//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Solution_6 {
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
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        //created a list of integer type
        List<Integer> li = new ArrayList<>();
        //hashmap has been created to store key value pairs
        HashMap<Integer,Integer> votes = new HashMap<>();

        //key =  candidates , value = votes
        for(int candidates:nums){
            votes.put(candidates,votes.getOrDefault(candidates,0)+1);
        }
        // check which candidates have votes > 1/3 of the total votes
        for(Map.Entry<Integer,Integer>e:votes.entrySet()){
            if(e.getValue() > nums.length/3){
                li.add(e.getKey());
            }
        }
        return li;
    }
}*/
