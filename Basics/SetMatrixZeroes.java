public class SetMatrixZeroes {
        public void setZeroes(int[][] matrix) {
            int rowarr[]=new int[matrix.length];
            int colarr[]=new int[matrix[0].length];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j]==0){
                        rowarr[i]=1;
                        colarr[j]=1;
                    }
                }
            }
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(rowarr[i]==1 || colarr[j]==1){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        public static void main(String[] args) {
            SetMatrixZeroes obj = new SetMatrixZeroes();
            int[][] matrix = {{1,1,0},{1,1,1},{0,1,1}};
            obj.setZeroes(matrix);
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }   
        }
}
