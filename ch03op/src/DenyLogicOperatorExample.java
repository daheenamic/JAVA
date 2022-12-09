public class DenyLogicOperatorExample {
	public static void main (String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play; // true 값에 !를 붙이면 false
		System.out.println(play);
		
		play = !play; // false 값에 !를 붙이면 true
		System.out.println(play);
	}
}
