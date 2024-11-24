public class Solution_5 {
    static void reverse(int arr[],int s,int e){
        int temp;
        while (s < e) {
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int arr[]= new int[]{3, 4, 2, 5, 1};
        //taking pivot as -1
        int p=-1,temp1;
        //get the pivot index
        //here 1 is considered as pivot element
        for(int i= arr.length-2;i>=0;i--){//0 1 2 | 3 2 1
            if(arr[i]<arr[i+1]){
                p=i;//0
                break;
            }
        }

        //if pivot element doesn't exist
        int st = p+1,end= arr.length-1;//st=1 end= 2
        if(p==-1) {
            reverse(arr,0,arr.length-1);
            for(int val:arr){
                System.out.print(val+" ");
            }
            return;
        }//2 4 5 7 1 0
        for(int i=arr.length-1;i>p;i--){//3 2 1
            if(arr[i]>arr[p]){
                temp1=arr[i];
                arr[i]=arr[p];
                arr[p]=temp1;
                break;
            }
        }
        reverse(arr,p+1,arr.length-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}