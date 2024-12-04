
public class Solution_15 {
    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "111";

            String result = "";
            int l1 = s1.length()-1;//
            int l2 = s2.length()-1;
            int carry = 0,count;
            while(l1>=0 || l2>=0){
                count = 0;
                if(l1>=0 && s1.charAt(l1) == '1') count ++;
                if(l2>=0 && s2.charAt(l2) == '1') count++;
                if(count+carry == 2){
                    result += 0;
                    carry = 1;
                } else if (count+carry == 1) {
                    result+=1;
                    carry = 0;
                }else if (count+carry == 0){
                    result+=0;
                    carry=0;
                } else if (count+carry == 3) {
                    result+=1;
                    carry =1;
                }
                l1-=1;
                l2-=1;
            }
            if(carry == 1) result+=Integer.toBinaryString(carry);
            //reverse string
            String temp = ""; //10100 //00101
            /*for(int i=result.length()-1 ; i>=0; i--){
                temp +=result.charAt(i);//00110 //01100
            }*/
            result = new StringBuffer(result).reverse().toString();
            int index = 0;
            while (index < result.length() && result.charAt(index) == '0') {
                index++;
            }
        System.out.println(result.substring(index));
    }
}