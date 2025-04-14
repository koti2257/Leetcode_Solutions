class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character , Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        int a[]=new int[map.size()];
        int i=0;
        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
            a[i]=entry.getValue();
            i++;
        }
        if(equalArray(a))
        {
            return true;
        }
        return false;
    }
    public boolean equalArray(int a[])
    {
        int x=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=x)
            {
                return false;
            }
        }
        return true;
    }
}