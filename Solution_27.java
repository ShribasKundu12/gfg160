import java.util.Arrays;

class Solution_27 {
    public static void main(String[] args) {
        int a[] = new int[]{0,0,2,2,5,7,8,8,9,9,9,9,9,9};
        int b[] = new int[]{0,4,4};

        int i=a.length-1,j=0,temp;
        if(a[a.length-1] <= b[0]) return;

            while (i >=0 && j<b.length) {
                if (a[i] < b[j]) {
                    i--;
                }else{
                    temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                    i++;j--;
                }
            }
            Arrays.sort(b);
            Arrays.sort(a);

        System.out.println("a array");
        for(int val: a){
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("b array");
        for(int val: b){
            System.out.print(val+" ");
        }
    }
}