class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int i = 0;
        ArrayList<Integer> arr = new ArrayList<>();
       while(i<matrix.length){
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE, idx=0;
        for (int j=0; j<matrix[i].length; j++){
            if (matrix[i][j]<min){
                min = matrix[i][j];
                idx = j;
            }
        }
        for(int j=0; j<matrix.length; j++){
            if(matrix[j][idx]>max) max = matrix[j][idx];
        }
        if(min == max){
            arr.add(min);
        }
        i++;
       }
       return arr;
    }
}