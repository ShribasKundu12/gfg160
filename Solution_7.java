public class Solution_7 {
    public static void main(String[] args) {
        //100, 180, 260, 310, 40, 535, 695
        int arr[] = new int[]{40,60,100,70,50,50,20,10,1000,800};
        /*

                                   *(695)"max"
                                  /
                                 *(535)
          "max"*(310)           /
             /   \             /
            *(260)\           /
           /       \         /
          *(180)    \       /
         /           \     /
        *(100)        \   /
     "min"              *(40) "min"

         */
        int profit=0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i]<arr[i+1]){
                profit += arr[i+1]-arr[i];
            }
        }
        System.out.println(profit);
    }
}