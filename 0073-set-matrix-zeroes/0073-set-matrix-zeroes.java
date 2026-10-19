class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int col[]=new int[c];
        int row[]=new int[r];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j]==0){
                    col[j]=1;//0 ke upr nich column me 1 set kr rhe hai 
                    row[i]=1;//0 ke right left row me 1 set kr rhe hai
                }
            }
        }
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    //jaha jaha col row me 1 set hua tha wha wha 0 set kardo !
                    if(row[i]==1 || col[j]==1){
                        matrix[i][j]=0;
                }
            }
        }
    }
}