// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;
        
//         boolean firstRowZero = false;
//         boolean firstColZero = false;
        
//         // Check if the first row and first column need to be zeroed
//         for (int col = 0; col < n; col++) {
//             if (matrix[0][col] == 0) {
//                 firstRowZero = true;
//                 break;
//             }
//         }
//         for (int row = 0; row < m; row++) {
//             if (matrix[row][0] == 0) {
//                 firstColZero = true;
//                 break;
//             }
//         }
        
//         // Mark zeros in the first row and first column
//         for (int row = 1; row < m; row++) {
//             for (int col = 1; col < n; col++) {
//                 if (matrix[row][col] == 0) {
//                     matrix[row][0] = matrix[0][col] = 0;
//                 }
//             }
//         }
        
//         // Zero out rows and columns based on marks in the first row and first column
//         for (int row = 1; row < m; row++) {
//             for (int col = 1; col < n; col++) {
//                 if (matrix[row][0] == 0 || matrix[0][col] == 0) {
//                     matrix[row][col] = 0;
//                 }
//             }
//         }
        
//         // Zero out the first row and first column if needed
//         if (firstRowZero) {
//             for (int col = 0; col < n; col++) {
//                 matrix[0][col] = 0;
//             }
//         }
//         if (firstColZero) {
//             for (int row = 0; row < m; row++) {
//                 matrix[row][0] = 0;
//             }
//         }
//     }
// }
public class Solution {
  public void setZeroes(int[][] matrix) {
      int m = matrix.length;
      int n = matrix[0].length;
      
      // Mark the first row and column as 1 if they contain zeros
      int firstRowZero = 1;
      int firstColZero = 1;
      
      // Mark rows and columns containing zeros using the first row and column
      for (int row = 0; row < m; row++) {
          for (int col = 0; col < n; col++) {
              if (matrix[row][col] == 0) {
                  matrix[row][0] = matrix[0][col] = 0;
                  if (row == 0) firstRowZero = 0;
                  if (col == 0) firstColZero = 0;
              }
          }
      }
      
      // Zero out rows and columns based on marks in the first row and column
      for (int row = 1; row < m; row++) {
          for (int col = 1; col < n; col++) {
              if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                  matrix[row][col] = 0;
              }
          }
      }
      
      // Zero out the first row and first column if needed
      if (firstRowZero == 0) {
          for (int col = 0; col < n; col++) {
              matrix[0][col] = 0;
          }
      }
      if (firstColZero == 0) {
          for (int row = 0; row < m; row++) {
              matrix[row][0] = 0;
          }
      }
  }
}
