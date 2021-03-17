package com.softserve.training.code.quality.matrixes;

import java.util.Arrays;

public class MatrixRefactored {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 1, 1}, {1, 1, 1}};
        int[][] matrix2 = {{2, 2, 2}, {2, 2, 2}};
        int coefficient = 10;

        int[][] matrixMultiplication = multiply(matrix2, coefficient);
        int[][] matrixSum = getSum(matrix1, matrix2);
        int[][] matrixDifference = getDifference(matrix1, matrix2);
    }

    private static int[][] getDifference(int[][] matrix1, int[][] matrix2) {
        int[][] difference = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(difference));
        return difference;
    }

    private static int[][] getSum(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sum));
        return sum;
    }

    private static int[][] multiply(int[][] matrix, int coefficient) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                result[i][j] = matrix[i][j] * coefficient;
            }
        }
        System.out.println(Arrays.deepToString(result));
        return result;
    }
}
