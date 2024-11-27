class SearchIn2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) { //sorted elements in matrix
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i=0;
        int j=rows*cols-1;

        while(i<=j){
            int mid = (i+j)/2;
            int row = mid/cols;
            int col = mid%cols;
            if(target==matrix[row][col]){
                return true;
            }else if(target>matrix[row][col]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,4,6},{8,11,14,17},{20,28,31,33}};
        System.out.println(searchMatrix(arr, 33));
    }
}
