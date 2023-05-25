
// 배열출력
public class test {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 9,8,7,6,5,4,3,2,1 출력
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr.length - 1; j >= 0; j--) {
				System.out.println(arr[i][j]);
			}
		}

		System.out.println("---------------------------------");

		// 1,4,7,2,5,8,3,6,9 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j][i]);
			}
		}
		
		System.out.println("---------------------------------");
		
		// 1,5,9,2,6,3
		// [0][0] [1][1] [2][2]
		// [0][1] [1][2] [0][2]

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				System.out.println(arr[j][j + i]);
			}
		}

	}

}