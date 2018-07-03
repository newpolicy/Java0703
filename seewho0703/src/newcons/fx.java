package newcons;

public class fx {

	public fx() {name = "noname";}
     //생성자 오버로딩(동일한 이름의 메소드가 2개이상 있는 경우)
	public fx(String arg) {name = arg;}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	static {
		System.out.println("da");
	}
	 
	public void display01() {
		String name = "지역변수 name";
		System.out.println(name);
	}

}
