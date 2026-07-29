class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0 , j = 0;
        while(j<haystack.length()){
            char hs = haystack.charAt(j);
            char nd = needle.charAt(i);
            if (nd == hs){
                i++;
                j++;
            }
            else{
                j = j-i+1;
                i = 0;
               
            }
            if (i == needle.length()) return j-i;
            
        }
        return -1;
    }
}