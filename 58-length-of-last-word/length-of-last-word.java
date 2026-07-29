class Solution {
    public int lengthOfLastWord(String s) {
        String [] words = s.split(" ");
        int n = words.length - 1;
        String word = words[n] ;
        return word.length();
    }
}