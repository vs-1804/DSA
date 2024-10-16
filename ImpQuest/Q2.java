//Given a square matrix, the task is to rotate its elements clockwise by one step
public class QUEST10 {
	public static void main(String[] args) {
		int[][] arr = { {5, 4, 7}, {1, 3, 8}, {2, 9, 6}};
		int row = 0;
		int col = 0;
		int curr = 0;
		int prev = 0;
		int n = arr[0].length;
		int m = arr.length;
		while (row < m && col < n) {

			if (row + 1 == m && col + 1 ==n ) {
				break;
			}
			prev = arr[row + 1][col];
			for (int i = col; i < n; i++) {
				curr = arr[row][i];
				arr[row][i] = prev;
				prev = curr;
			}
			row++;
			for (int i = row; i < m; i++) {
				curr = arr[i][n - 1];
				arr[i][n - 1] = prev;
				prev = curr;
			}
			n--;
			for(int i=n-1;i>=col;i--) {
				curr = arr[m-1][i];
				arr[m-1][i]=prev;
				prev=curr;
			}
			m--;
			for( int i=m-1;i>=row;i--) {
				curr = arr[i][col];
				arr[i][col]=prev;
				prev=curr;
			}
			col++;
		}
		for(int[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
	}
}
