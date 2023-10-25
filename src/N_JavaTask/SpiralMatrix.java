package N_JavaTask;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int top = 0, bottom = matrix.length-1, left = 0, right = matrix[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                System.out.println(matrix[top][i]+" ");
            }
            top++;

            for(int j=top; j<=bottom; j++){
                System.out.println(matrix[j][right]);
            }
            right--;

            for(int k=right; k>=left; k--){
                System.out.println(matrix[bottom][k]);
            }
            bottom--;

            for(int l=bottom; l>=top; l--){
                System.out.println(matrix[l][left]);
            }
            left++;
        }
    }
}
