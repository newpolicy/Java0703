package method.p;

public class Task {

	public void javaDisplay() {
			System.out.println("나는 씨플플이다");
			//나는 자바다 3번출력
			for(int i=0; i<3; i++){System.out.println("나는 자바다");}
		}

	public void total() {
		int sum=0;
		for(int i=1; i<101; i++){sum = sum + i; }
		System.out.println("합계 = " +sum);
	}
	
	public int total1() { //리턴값이 생겨 활용할 수 있다.
		int sum=0;
		for(int i=1; i<101; i++){sum = sum + i; }
		System.out.println("합계 = " +sum);
		return sum;
	}	
    public int total2(int n) {
		int sum=0;
		for(int i=1; i<n+1; i++){sum = sum + i; }
		System.out.println("합계 = " +sum);
		return sum;
		}
    //로그인 처리 메소드
    public boolean loginResult(String id, String password) {
    boolean result = false;
    	if(id.equals("tadlennon") && password.equals("1234")) // String 타입은 equals 를 쓴다!!! == 아님
    	{
    		System.out.println("로그인 성공");
    		result = true;
    	}
    	else{System.out.println("로그인 실패");}
    	return result;
    }
    
    //회원 탈퇴
    public boolean deleteMember(String id, String pw)
    {
    	boolean result = false;
    	if(id.equals("a") && pw.equals("b"))
    	{
    		result = true;
    	}
    	return result;
    }
    

	}



