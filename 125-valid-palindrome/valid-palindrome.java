class Solution {
    public boolean isPalindrome(String s) {
        String x = s.toLowerCase();
        int i = 0 , j = x.length() - 1;
        while(i<=j){
            char fr = x.charAt(i);
            char bk = x.charAt(j);
            if(!Character.isLetterOrDigit(fr)){
                i++;
               continue;}
            if(!Character.isLetterOrDigit(bk)) {
                j--;
                continue;}
            if(fr != bk) return false;
            i++;
            j--;
        }
        return true;
    }
}