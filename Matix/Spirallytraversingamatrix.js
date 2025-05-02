class Solution {
    
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> arr =new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        
        int r=0,c=0;
        int row=n-1,col=m-1;
        
        while(r<=row && c<=col){
            for(int i=c;i<=col;i++){
                arr.add(mat[r][i]);
            }
            
            
            for(int i=r+1;i<=row;i++){
                arr.add(mat[i][col]);
            }
            
            if(r<row){
            for(int i=col-1;i>=c;i--){
                arr.add(mat[row][i]);
            }
            }
            if(c<col){
            for(int i=row-1;i>r;i--){
                arr.add(mat[i][c]);
            }
            }
            row--;
            col--;
            r++;
            c++;
        }
            return arr;
    }
}

