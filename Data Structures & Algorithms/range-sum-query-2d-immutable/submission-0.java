class NumMatrix {
    int[][] prefixSum;
    int rowLen;
    int colLen;
    public NumMatrix(int[][] matrix) {
        rowLen = matrix.length;
        colLen = matrix[0].length;
        prefixSum = new int[rowLen][colLen];

        for(int i =0; i < rowLen; i++){
            for(int j = 0; j < colLen; j++){
               prefixSum[i][j] = getPrvSumVal(i,j)+ matrix[i][j];
            }
        }
        // for(int i =0; i < rowLen; i++){
        //     for(int j = 0; j < colLen; j++){
        //        System.out.print(" "+prefixSum[i][j]);
        //     }
        //     System.out.println();
        // }

    }

    public int getPrvSumVal(int i,int j){
        int sum = 0;
        //check previous row within bound
        if((i - 1)> -1){
            sum += prefixSum[i-1][j];
        }
         //check previous column within bound
        if((j-1)> -1){
            sum += prefixSum[i][j-1];
        }
         //check diagnol element within bound
        if((i-1)> -1 && (j-1)> -1){
            sum -= prefixSum[i-1][j-1];
        }
        return sum;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        // (+) get value for row2, col2
        // (-) row1 -1, col2 -1;
        // (-) row2 -1, col1 -1;
        // (+) row1 - 1, col1 -1
        int sum = 0;  // -4
        if((row1 - 1 ) > -1){
            sum -= prefixSum[row1-1][col2]; // 4
        }
        if((col1 -1)> -1){
            sum -= prefixSum[row2][col1 -1];
        }
        if((row1 -1)> -1 && (col1 - 1) > -1){
            sum += prefixSum[row1-1][col1-1];
        }
        sum += prefixSum[row2][col2];
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */