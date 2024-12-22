import java.util.Arrays;
//1 2 4  8 9
//Aggressive cows problem
class Main {
    public static boolean allocateStalls(int []stalls,int k,int distance){//3,4
        int count = 1;//1 2 5 7 10
        int prev_ele = stalls[0];//1
        for(int i=1; i<stalls.length; i++){//4<5
            if(stalls[i] - prev_ele >= distance){
                count++;//3
                prev_ele = stalls[i];//5
            }
        }
        return count>=k;
    }
    public static int aggressiveCows(int[] stalls, int k) {//1 2 5 7 10
        //sort the entire stalls[] array
        Arrays.sort(stalls);
        //apply binary search to solve this problem:
        //minimum max distance b|w cows
        int start = 1,res=0;
        int end = stalls[stalls.length-1] - stalls[0];//9
        while(start<=end){
            int mid = (start + end)/2;//4
            if(allocateStalls(stalls,k,mid)){
                res = mid;//4
                start = mid+1;//5
            }else{
                end= mid-1;//3
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []stalls = new int[]{10, 1, 2, 7, 5};
        int k = 3;//number of cows
        int res = aggressiveCows(stalls,k);
        System.out.println(res);
    }
}