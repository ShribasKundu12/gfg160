import java.util.ArrayList;

public class Solution_18 {
    static void constructLps(String pat, int[] lps) {

        lps[0] = 0 ;
        int j=0,i=1;

        while(i<pat.length()){
            if(pat.charAt(i) == pat.charAt(j)){
                j++;
                lps[i] = j;
                i++;
            }else{
                if(j!=0)
                    j = lps[j-1];
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
    static ArrayList<Integer> search(String pat,String txt){
        int[] lps = new int[pat.length()];
        ArrayList<Integer> li = new ArrayList<>();

        constructLps(pat, lps);

        int i=0;
        int j=0;
        while(i<txt.length()){
            if(txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;
                if(pat.length() == j){
                    li.add(i-j);
                    j = lps[j-1];
                }
            }
            else {
                if(j!=0)
                    j = lps[j-1];
                else i++;
            }
        }
        return li;
    }
    public static void main(String[] args) {
        String s = "aab";
        String txt = "aabcadaabe";
        //ArrayList<Integer> l = new ArrayList<>();
        System.out.println(search(s,txt));

    }
}