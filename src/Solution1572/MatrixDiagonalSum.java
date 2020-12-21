package Solution1572;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
		int count = 0;
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (i == j || mat[0].length - 1 == j + i) {
					count = count + mat[i][j];
				}
			}
		}
		return count;
	}
}
