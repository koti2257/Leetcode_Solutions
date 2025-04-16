class Solution {
    public int minBitFlips(int start, int goal) {
        String s=Integer.toBinaryString(start);
        String g=Integer.toBinaryString(goal);
        int maxl=Math.max(s.length(),g.length());
        while(s.length()<maxl) s="0"+s;
        while(g.length()<maxl) g="0"+g;
        int c=0;
        for(int i=0;i<maxl;i++)
        {
            if(s.charAt(i)!=g.charAt(i))
            {
                c++;
            }
        }
        return c;
    }
}