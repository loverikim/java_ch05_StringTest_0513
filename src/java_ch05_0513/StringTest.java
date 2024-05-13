package java_ch05_0513;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 참조타입		
		String str1 ="홍길동";
		String str2 ="홍길동";
		
		if(str1 == str2) { //문자열이 저장된 번지가 100번지라면 100 == 100
			System.out.println("참!");
		}else {
			System.out.println("거짓!");
		}
		
		String strObject1 = new String("홍길동");
		String strObject2 = new String("홍길동");
		
		
		// strObject1이 저장된 번지가 200이고 strObject2가 저장된 번지가 300이라면
		// 200 == 300이므로 false가 출력됨
		if(strObject1 == strObject2) { //홍길동 ==홍길동 
			System.out.println("참!");
		}else {
			System.out.println("거짓!");
		}
		
		// 실제 문자열이 같은지 비교를 한다 -->.equalse()
		if(strObject1.equals(strObject2)) { //홍길동 ==홍길동 
			System.out.println("참!");
		}else {
			System.out.println("거짓!");
		}
		
		

	}

}
