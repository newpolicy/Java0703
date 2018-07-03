package method;


public class Member_fx {

	public int Num_word(String n) {
	 int k = n.length();
	 return k;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String arg) {
		name = arg;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	private String name;
	private String mobile;
	 String home;
	 int height;
	 int age;

	@Override
	public String toString() {
		return "Member_fx [name=" + name + ", mobile=" + mobile + ", home=" + home + ", age=" +age + ", height="
				+ height + "]";
	}
	public void prin() {//인스턴스 변수들을 출력해주는 메소드 // 클래스 안에서 클래에 만들어진 변수를 사용할 떄는 인스턴스나 클래스 이름을 기재하지 않습니다.
		System.out.println("이름   : " + name + "\n휴대폰: " + mobile + "\n주소   : " + home+ "\n키      : " + height + "\n나이   : "+age );
	}

	public static int sum(int ... ar) { //static 메소드: 클래스 이름으로 호출할수있는 메소드 // 매개변수에 ...이 있으면 매개변수 개수에 상관없이 대입가능.
		int total = 0;
		int len = ar.length; //heap에 있는 데이터를 stack에 저장한다. 자주사용하기 때문에 heap에 있으면 효율이 떨어진다.   
		for(int i=0; i<len; i++) {total = ar[i];}
		return total; 
	
	}
	 
	public void display01() {
		String name = "지역변수 name";
		System.out.println(this.name);  //this를 붙이면 지역변수에서는 찾지 않고 인스턴스 변수에서 찾아옵니다.
	}
		
}
	


