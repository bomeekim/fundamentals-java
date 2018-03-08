package util;

public class MyArrays {
	
	/**
	 * 
	 * @param src 정렬할 배열의 주소
	 * @return 정렬한 배열
	 */
	
	public static int[] sort(int[] src) { // 내림차순
		
		int[] data = src;
		System.arraycopy(src, 0, data, 0, src.length);
		
		for (int i=0; i<data.length-1; i++) {
			for (int j=i+1; j<data.length; j++) {
				if (data[i] < data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		return data;
	}
	
	public static void print(int[] data) {
		System.out.print("[");
		
		for (int i=0; i<data.length; i++) {
			System.out.print(data[i] + ((i == data.length-1)? "" : ", "));
		}
		
		System.out.print("]");
	}
}
