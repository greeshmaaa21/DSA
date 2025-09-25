class Solution {
    public int diagonalSum(int[][] mat) {
        int priSum=0, secSum=0, totalSum=0 , n=mat.length, j=n-1;
        for(int i=0;i<n;i++){
            priSum+=mat[i][i];
        }
        for(int i=0;i<n;i++){
            secSum+=mat[i][j];
            j--;
        }
        if(mat.length%2!=0){
            return totalSum = (priSum+secSum) - mat[n/2][n/2];
        }else{
            return totalSum = priSum+secSum;
        }
    }
}