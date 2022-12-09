public class IncreaseDecreaseOperatorExample {
	public static void main (String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------");
		x++; // x에 1 증가 (11)
		++x; // x에 1 증가 (12)
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");
		y--; // y에 1 감소 (9)
		--y; // y에 1 감소 (8)
		System.out.println("y=" + y);
		
		System.out.println("-----------------------");
		z = x++; // z값에 x먼저 대입 후(12), x에 1 증가(13)
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("-----------------------");
		z = ++x; // x에 1 먼저 증가 후(14) z값에 대입(14)
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("-----------------------");
		z = ++x + y ++;
		// x에 1 증가(15) -> y와 더함(15+8) -> z에 대입(23) -> y에 1증가(9)
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);		
	}
}
