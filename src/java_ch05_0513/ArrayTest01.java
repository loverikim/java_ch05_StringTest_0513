package java_ch05_0513;

public class ArrayTest01 {

	public static void main(String[] args) { // 문자열 타입의 배열 함수.
		// 1.배열은 같은 타입의 데이터만 저장.
		//배열을 선언하는 방법 2가지
		//배열을 만든 방법1
		//방법1)int ArrayInt[] //올드한 방식 C언어에서 보통 사용
		//방법2)
		int[] arrayInt = {1,2,3,4,5}; //배열의 기호는 중괄호!!!! 선언과 동시에 초기화.
		double[] arrayDouble = {1.1,1.2};
		String[] arrayStr = {"korea","japan","usa"};
		
		int[] arrayTest = null; //참조하는 배열값이 없는 배열 이름만 선언.
		// list1 = [] 파이썬의 리스트와 같음
		
		//배열을 만든 방법2
		int[] arrayTest2 = new int[5];// new연산자:객체에 메모리를 만들어주는 연산자.
		// 각 원소값이 0으로 초기화되는 5칸짜리 배열이 생성 ***********
		// 값 고정 삽입,삭제,추가 불가능. --> 지우고 다시 만들어야 함.
		// 메모리 낭비는 있으나 필요에 따라 여분의 메모리를 만들어 놓는 방법이 있음.
		// 예시) 회원 실제 50 만드는것은 100으로 만듦
				
//		for(int i=0;i<5;i++) {//배열 arrayTest2의 모든 원소를 출력			
//			System.out.println(arrayTest2[i]);
//		}
		for(int i=0;i<arrayTest2.length;i++) {//배열 arrayTest2의 모든 원소를 출력			
			System.out.println(arrayTest2[i]);
		} // 상수보다는 length를 사용해라
		  // length 유연한 코드 배열의 크기를 모들 때 사용할 수 있음.
		  // 배열이름.length -> 배열의 길이를 자동으로 계산.
		
	}

}
