class Solution {
    public boolean isPalindrome(String s) {
        String a=s.replaceAll("[^a-zA-Z0-9]", "");
        String b=a.toUpperCase();
        int i=0;
        int j=b.length()-1;
        while(i<j){
            if(b.charAt(i)!=b.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}