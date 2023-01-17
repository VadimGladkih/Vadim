package ru.progwards.java1.lessons.arrays1;

public class Matrix {
    private final int[][] matrix;
    private int[][] Matrix;
    int N;
    public Matrix(int[][] matrix){
        this.matrix = matrix;
    }
    public int maxInRow(int num){
        int maxRow = Integer.MIN_VALUE;
        for (int i : matrix[num]){
            if (maxRow > i){
                maxRow = i;
            }
        }return maxRow;

    }
    public int maxInCol(int num){
        int maxCol = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++ ){
            if (matrix[i].length < num +1){
                continue;
            }if (matrix[i][num] > maxCol){
                maxCol = matrix[i][num];
            }
        }
        return maxCol;
    }
    public int max(){
        int Number = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++){
            if (maxInRow(i) > Number){
                Number = maxInRow(i);
            }
        }
        return Number;
    }
    public boolean isMatrix(){
        for (int i = 0; i <matrix.length-1; i++) {
            if (matrix[i].length == matrix[i + 1].length) {
                return true;
            }
        }
        return false;
    }
    public int[][] transposition(){
        int n = 3;
        int[][] transposition = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposition[i][j] = n * i + j;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = transposition[i][j];
                transposition[i][j] = transposition[j][i];
                transposition[j][i] = temp;
            }
        }
        return null;
    }

    public static void main(String[] args) {
    }
}
