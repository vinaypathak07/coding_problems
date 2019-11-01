import java.util.*;

class Solution {

    public String convert(String s, int numRows) {

         ArrayList<String> al = new ArrayList<String>(numRows);

         for(int i=0;i<numRows; i++){
             al.add("");
         }
         int i=0;
         while(i<s.length()) {
            for(int j=0;j<numRows && i<s.length();j++) {
                 String str = al.get(j);
                 str += s.charAt(i);
                 al.set(j,str);
                 i++;
            }

            for(int j=numRows-2;j>0 && i<s.length();j--) {
                String str = al.get(j);
                str += s.charAt(i);
                al.set(j,str);
                i++;
            }
        }

        String ans ="";
        for(int j=0;j<numRows;j++) {
            ans += al.get(j);
        }

        return ans;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.nextLine();
        int numRows = sc.nextInt();
        System.out.println(new Solution().convert(str,numRows));
    }
}
