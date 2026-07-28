class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int fc = 0 , fr = 0 , lc = matrix[0].length - 1 , lr = matrix.length - 1;
        ArrayList<Integer> arr = new ArrayList<>();
        while(fc<=lc && fr<=lr){
            for(int i=fc ; i<=lc; i++){
                arr.add(matrix[fr][i]);
            }
            fr++;
            for(int j=fr; j<=lr; j++){
                arr.add(matrix[j][lc]);
            }
            lc--;
            if(fr<=lr){
            for(int i=lc; i>=fc; i--){
                arr.add(matrix[lr][i]);
            }
            lr--;}
            if(fc<=lc){
            for(int i=lr; i>=fr; i--){
                arr.add(matrix[i][fc]);
            }
            fc++;
            }
           
            }
        return arr;
    }
}