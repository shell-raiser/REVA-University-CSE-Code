public class matrixMultiplication {
    public static void main(String[] args) {
        int mat1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int mat2[][] = { { 7, 8 }, { 9, 10 }, { 11, 12 } };
        int matRes[][] = new int[2][3];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                matRes[i][j] = mat1[i][j] + mat2[j][i];
            }
            // = sum1;
        }
        for (int[] i : matRes) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
