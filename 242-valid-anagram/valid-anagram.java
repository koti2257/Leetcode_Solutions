class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        int i=0;
        while(sa[i]==ta[i])
        {
            if(i==sa.length-1)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}