package java_ch05_0513;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파이썬 2차원 행과 열로된 표 ---> 여러개 있으면 3차원 
		
		// 2차원 배열
		int[][] score = new int[2][3]; // 0으로 초기화된 2차원 배열,  [행][열] 많이 사용X
		
		int[][] array1 = {// 자동으로 행과 열이 만들어짐. 2행 3열짜리 표.
							{10,20,30},
							{40,50,60},
							{70,80,90}
						 };
						// 50 -> (1,1) 
						// 70 -> (2,0)
		// 향상된 for문
		// arr1 배열의 모든 원소의 총합을 구하시오.
		int[] arr1 = {10,20,30,40,50};
		int sum = 0;
//		for(int i=0;i<arr1.length;i++){ // i = 0 1 2 3 4
//			sum += arr1[i];			
//		}
//		System.out.println(sum);
		
		// 파이썬에서는
		// for i in arr1:
		// 	sum = sum +i
		
		// 향상된 for문 ---> 새로나운 문법
		for(int i : arr1) { // in 대신 :사용
			sum = sum + i;
		}
		System.out.println(sum);
		
	}

}
