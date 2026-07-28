class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        while(i < numRows ){
            List<Integer> rowi = new ArrayList<>();
           for(int j=0; j<=i; j++){
            if(j==0 || i==j){
                rowi.add(1);
            }
            else{
                int a = ans.get(i-1).get(j-1);
                int b = ans.get(i-1).get(j);
                rowi.add(a+b);
            }}
            ans.add(rowi);
           
           i++;
        }
        return ans;
    }
}