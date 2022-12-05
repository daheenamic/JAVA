// 데이터를 저장하는 용도로 작성된 클래스
// 저장 - VO : CarVO, 전달 - DTO : CarDTO, 객체의 정보 : Car
public class Car {

	// static이 없어서 자동으로 올라가지 않고 new를 통해 객체를 생성해야 올라간다.
	// 회사, 모델, 색상, 최고 속도, 현재 속도
	// public - 다른 패키지에서 사용 가능
	// private - Car Class 안에서만 사용 가능
	private String company = "현대자동차";
	private String model = "그랜저";
	private String color = "검정";
	private int maxSpeed = 350;
	private int speed;

	// new Car()
	public Car() {
	} // 생성자가 없을 때 컴파일러가 만들어 주는 기본 생성자

	// 똑같은 이름인데 전달되는 변수 갯수나 타입에 따라서 구분이 된다.
	// new Car("기아","모하비", "블랙", "200", "0")
	public Car(String company, String model, String color, int maxSpeed, int speed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	} // end of Car()

	// getter와 setter
	// company 데이터 가져가는 메서드 - 다른 위치에서도 사용 가능하다.
	public String getCompany() {
		return company;
	}

	// company 데이터 넣어주는 메서드 - 다른 위치에서도 사용 가능하다.
	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// 어노테이션 : 오버라이딩을 올바르게 했는지 컴파일러가 체크한다.
	@Override // 부모클래스(Object)에서 상속받은 것과 동일한지 체크하는 역할을 한다.
	// Object에 객체 출력하는 메서드 => toString(){~~} --> Override라고 한다.
	// toString() : 객체의 정보를 문자열로 만든다. 주로 객체 안에 있는 데이터를 확인하기 위해서
	public String toString() { // 형태가 Object 클래스 안에 있는 것과 같아야 한다.
		return "Car[company = " + company + ", model = " + model + ", color = " + color + ", maxSpeed = " + maxSpeed
				+ ", speed = " + speed + "]";
	}

} // end of Car class