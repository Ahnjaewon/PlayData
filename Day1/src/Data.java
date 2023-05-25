
public class Data {

	public static void main(String[] args) {
		
		// 참조 데이터 비교
		int[] arr = {1,2,3};
		int[] arr2 = arr;
		int[] arr3 = {1,2,3};
		
		if(arr == arr2) {
			System.out.println("arr == arr2"); //true
		}
		
		if(arr == arr3) {
			System.out.println("arr == arr3"); //false
		}
		
		arr2[0] = 10;
		System.out.println(arr2[0]); //10
		System.out.println(arr[0]); //10
	}

}
