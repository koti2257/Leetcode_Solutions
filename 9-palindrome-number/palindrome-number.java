class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int y=x;
        long sum=0;
        while(x!=0)
        {
            int rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(sum==y)
            return true;
        else
            return false;
    }
}