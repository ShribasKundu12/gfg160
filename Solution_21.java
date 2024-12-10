
public class Solution_21{
    public static void set012(int []arr, int i,int n,int setVal){
        while(i<n){
            arr[i] = setVal;
            i++;
        }
    }

    public static void main(String[] args) {
        int []arr = new int[]{1 ,0 ,2 ,1, 1 ,1, 0};
        int p0=0,p1=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==0) p0++;
            else if(arr[i] == 1) p1++;
        }

        System.out.println(p1+" "+p0);


        set012(arr,0,p0,0);
        set012(arr,p0,p0+p1,1);
        set012(arr,p0+p1,arr.length,2);

        for(int val:arr){
            System.out.print(" "+val);
        }
    }
}//approach 2: Dutch national flag algorithm