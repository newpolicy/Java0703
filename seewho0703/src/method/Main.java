package method;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Member_fx member1 = new Member_fx();// 멤버 클래스의 인스턴스를 생성
		System.out.printf("글자 수 : ");
		int z= member1.Num_word("우리안녕하세요");
		System.out.println(z);
        
		
		member1.display01();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("이름: ");
		String name = sc.nextLine();
		System.out.printf("나이: ");
		int age = sc.nextInt();
	
		
		member1.setName(name);
		member1.setMobile("010-4330-1610");
		member1.home = "부천";
		member1.height = 180;
		member1.age = age;
		sc.close();
		

		member1.prin();
		
		System.out.println(member1);
		
		System.out.println(Member_fx.sum(10, 30, 12));

		
		//저장돼 있는 메소드 활용법
		long m = Math.max(100, 200); //max라는 메소드 활용
		System.out.println(m);
	}

}
