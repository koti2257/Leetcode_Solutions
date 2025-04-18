class Solution {
    public String truncateSentence(String s, int k) {
        String [] arr = s.split(" ");
        String s1 = "";
        for(int i=0;i<k;i++)
        {
            if(i==k-1){
                s1=s1+arr[i];
            }
            else s1=s1+arr[i]+" ";
        }
        return s1;
    }
}