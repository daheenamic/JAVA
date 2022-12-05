
public class CarExample {

	// 시작
	public static void main(String[] args) {

		// Car() 생성자를 이용해서 객체를 생성한다(new). 주소가 나온다. 주소를 myCar에 저장한다.
		// 생성자가 없으면 기본 생성자를 만들고 컴파일 해준다.
		Car myCar = new Car(); // 생성자 없는 객체를 생성, 이미 값이 들어가 있어서 기본적으로 생성이 되어있음. (생략되어 있음)
		Car myCar1 = new Car("기아", "모하비", "블랙", 200, 0); // 생성자 있는 객체 생성해서 값을 넣어줌

		System.out.println(myCar); // public String toString() 호출
		System.out.println();

		// 필드(변수)값을 읽기
		System.out.println("제작회사 : " + myCar.getCompany());
		System.out.println("모델명 : " + myCar.getModel());
		System.out.println("색깔 : " + myCar.getColor());
		System.out.println("최고속도 : " + myCar.getMaxSpeed());
		System.out.println("현재속도 : " + myCar.getSpeed());

		System.out.println();

		System.out.println("제작회사 : " + myCar1.getCompany());
		System.out.println("모델명 : " + myCar1.getModel());
		System.out.println("색깔 : " + myCar1.getColor());
		System.out.println("최고속도 : " + myCar1.getMaxSpeed());
		System.out.println("현재속도 : " + myCar1.getSpeed());

		System.out.println();

		// 변경된 값
//		myCar.company = 60;
		myCar.setCompany("기아");
		System.out.println("수정된 회사 : " + myCar.getCompany());
	}
}
