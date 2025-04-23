class Solution {
    public int arraySign(int[] nums) {
        int c=0;
        for(int num: nums)
        {
            if(num==0) return 0;
        }
        for(int num: nums)
        {
            if(num<0)
            {
                c++;
            }
        }
        if(c%2==0) return 1;
        else return -1;
    }
}