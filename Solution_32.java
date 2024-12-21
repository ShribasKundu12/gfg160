import java.util.ArrayList;
import java.util.Collections;
class Main {
    public static int kthElement(int a[], int b[], int k) {
        // code here
        //int total_length = a.length + b.length;
        ArrayList<Integer> li = new ArrayList<>();
        //int j=0;
        for(int value:a){
            li.add(value);
        }
        for(int value:b){
            li.add(value);
        }
        Collections.sort(li);
        System.out.println(li);
        return li.get(k-1);
    }
    public static void main(String[] args) {
        int arr[]  = new int[]{1,2,3,6,7,8};
        int brr[] = new int[]{4,5,9,10};
        int val = kthElement(arr,brr,5);
        System.out.println(val);
    }
}