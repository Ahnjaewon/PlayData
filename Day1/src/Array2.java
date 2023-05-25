
public class Array2 {
	public static void main(String[] args) {
		int[][] arr = { { 4, 7, 9, 10 }, { 2, 7, 3, 4 }, { 9, 2, 8, 5 }, { 8, 4, 2, 2 } };
		
		// 배열을 순서대로 탐색하여 짝수면 출력, 홀수는 더한다
		// 더한값이 20을 초과하면 탐색을 멈춘뒤 더한값을 출력하라
		int count = 0;
		Sum: 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] % 2 == 0) {
					System.out.println(arr[i][j]);
				} else {
					count += arr[i][j];
					if (count > 20) {
						System.out.println("더한값:" + count);
						break Sum;
					}
				}
			}
		}
	}
}
