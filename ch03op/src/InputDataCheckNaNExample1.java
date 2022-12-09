
public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		// 대문자로 시작되면 class나 Interface. Double(클래스).valueOf(메서드)
		
		double currentBalance = 10000.0;
		
		currentBalance += val; // currentBalance = currentBalance + val
		System.out.println(currentBalance);
	}
}
