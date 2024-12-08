class Solution {
    static int[] constructLps(String s){
        int lps[]  =new int[s.length()];
        lps[0]  =0;
        int j=0,i=1;
        while(i<s.length()){
            if(s.charAt(i) == s.charAt(j)){
                j++;
                lps[i] = j;
                i++;
            }else{
                if(j!=0)
                    j = lps[j-1];
                else {
                    lps[i] = j;
                    i++;
                }
            }
        }
        /*for(int val:lps){
            System.out.println(val);
        }*/
        return lps;
    }
    public static int minChar(String s) {
        // Write your code here
        int length = s.length();
        //reverse of given string
        String rev = new StringBuffer(s).reverse().toString();
        int[] lps;
        if (s.equals(rev)) return 0;
        else {
            s = s+"&"+rev;
            System.out.println(s);
            //construct the longest palindrome suffix of string s
            lps = constructLps(s);
            /*for(int val:lps){
                System.out.println(val);
            }*/
        }
        return (length - lps[lps.length - 1]);
    }
    public static void main(String args[]){
        int a =  minChar("aacecaaa");
        System.out.println("a ="+a);
    }
}
