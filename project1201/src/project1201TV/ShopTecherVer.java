package project1201TV;

public class ShopTecherVer {
	
	// 쇼핑몰을 실행할 메서드를 만든다.
	public void execute() {
		
		// 무한 반복
		while (true) {
			
			// 메뉴 출력
			System.out.println("\n\n<---- 쇼핑 ---->");
			System.out.println("1.리스트, 2.보기, 3.등록");
			System.out.println("4.수정, 5.삭제, 0.이전메뉴 ");
			
			// 메뉴 입력
			System.out.print("메뉴 입력 -> ");
			String menu = MainTecherVer.scanner.nextLine();
			
			switch (menu) {
			case "1" : 
				System.out.println("\n상품 리스트 처리");
				break;
			case "2" :
				System.out.println("\n상품 보기 처리");
				break;
			case "3" :
				System.out.println("\n상품 등록 처리");
				break;
			case "4" :
				System.out.println("\n상품 수정 처리");
				break;
			case "5" :
				System.out.println("\n상품 삭제 처리");
				break;
			case "0" :
				System.out.println("\n이전 메뉴 ------>>>>>>>");
				return; // 메서드를 빠져나가면서 호출한 곳(메인 메서드)으로 되돌아간다.
			default:
				System.out.println("\n메뉴 입력이 잘못 되었습니다.");
				System.out.println("1~5번과 0번을 입력 하실 수 있습니다.");
				break;
			} // end of switch
		} // end of while		
	} // end of execute
} // end of ShopTecherVer class
