class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result=new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1,c=0;
        while(i>=0||j>=0||c>0)
        {
            int d1=(i>=0)?num1.charAt(i)-'0':0;
            int d2=(j>=0)?num2.charAt(j)-'0':0;
            int sum=d1+d2+c;
            c=sum/10;
            result.append(sum%10);
            i--;j--;
        }
        return result.reverse().toString();
    }
}