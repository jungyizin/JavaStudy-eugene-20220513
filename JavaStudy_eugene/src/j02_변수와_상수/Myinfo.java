package j02_변수와_상수;

public class Myinfo {

	public static void main(String[] args) {
		// 주석
		/*
		 * 메모, 필기
		 * 
		 * 1.문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 *  이름: 김준일
		 *  나이: 29
		 *  연락처: 010-9988-1916
		 *  주소: 부산 동래구 사직동
		 *  
		 */
		
		char name1 = '김';
		char name2 = '준';
		char name3 = '일';
		String phone = "010-9988-1916";
		String address = "부산 동래구 사직동";
		int age = 29;
				
		System.out.print("이름: ");
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.println("나이: ");
		System.out.print("연락처: ");
		System.out.println(phone);
		System.out.print("주소: ");
		System.out.println(address);
		
		System.out.print("이름: ");
		System.out.print("" + name1 + name2 + name3);
		
		System.out.println("세 수의 합:" + 10 + 20 + 30);
		System.out.println("세 수의 합:" + (10 + 20 + 30));
	}

}
