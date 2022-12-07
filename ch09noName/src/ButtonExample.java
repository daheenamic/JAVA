
public class ButtonExample {

	public static void main(String[] args) {
		
		Button btn1 = new ButtonStart();
		btn1.click();
		btn1.mouseOver();
		
		// adapter를 상속 받은 클래스 -> 클래스는 한개만 상속
		// 다른 클래스를 상속 받을 수 없다. => 자바 8 : default method
		Button btn2 = new ButtonAdapterStart();
		btn2.click();
		btn2.mouseOver();
		
		ButtonDefault btn3 = new ButtonDefaultStart();
		btn3.click();
		btn3.mouseOver();		
	}
}
