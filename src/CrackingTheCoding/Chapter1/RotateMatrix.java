package CrackingTheCoding.Chapter1;

import java.util.Arrays;

/**
 * RotateMatrix
 */
public class RotateMatrix {

    public static void main(String[] args) {
        int[] row1 = {1, 2, 3, 4};
        int[] row2 = {5, 6, 7, 8};
        int[] row3 = {9, 10, 11, 12};
        int[] row4 = {13, 14, 15, 16};
        int[][] matrix = {row1, row2, row3, row4};
        for (int[] array : matrix) {
            System.out.println(Arrays.toString(array));
        };
        rotate(matrix);
        System.out.println("======after rotation========");
        for (int[] array : matrix) {
            System.out.println(Arrays.toString(array));
        };
        
    }

    public static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }

        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;

                // save top
                int top = matrix[first][i];

                // left -> top
                matrix[first][i] = matrix[last - offset][first];

                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top;
            }
        }
        return true;
    }


}