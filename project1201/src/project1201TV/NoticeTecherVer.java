/*
 *  클래스의 구성
 *  변수 - 저장할 목적으로 많이 선언해서 사용 : VO 또는 DTO
 *  메서드 - 처리할 목적으로 선언해서 사용 : 선택 : Controller
 *  특별한 메서드 (생성자) - 클래스 이름과 같고 리턴 타입이 없다. 주로 public으로 만든다. 초기값 세팅을 위해 사용.
 *  				 - 작성하지 않으며 기본 생성자를 컴파일러가 만들어 준다.
 *  초기화 블록 - 정해진 기본값을 세팅할 때 사용
 */
package project1201TV;

public class NoticeTecherVer {
	
	// 공지사항을 실행할 메서드를 만든다.
	public void execute( ) {
		
		// 무한반복
		while(true) {
			// 메뉴 출력
			System.out.println("\n\n<-- 공지 사항 -->");
			// 메뉴 - CRUD (CREATE, READ, UPDATE, DELETE) 기준 : 리스트,보기,쓰기,수정,삭제
			System.out.println("1.리스트, 2.보기, 3.등록");
			System.out.println("4.수정, 5.삭제, 0.이전메뉴 ");
			
			// 메뉴 입력
			System.out.print("메뉴 입력 -> ");
			String menu = MainTecherVer.scanner.nextLine(); // Main에 있는 scanner 메서드를 갖다 쓰면 되어서 선언 안해도 됨.
			
			// 메뉴 처리
			switch (menu) {
			case "1" : 
				System.out.println("\n공지사항 리스트 처리");
				break;
			case "2" :
				System.out.println("\n공지사항 보기 처리");
				break;
			case "3" :
				System.out.println("\n공지사항 등록 처리");
				break;
			case "4" :
				System.out.println("\n공지사항 수정 처리");
				break;
			case "5" :
				System.out.println("\n공지사항 삭제 처리");
				break;
			case "0" :
				System.out.println("\n이전 메뉴");
				return;  // 메서드를 빠져나가면서 호출한 곳(메인 메서드)으로 되돌아간다.
			default:
				System.out.println("\n메뉴 입력이 잘못 되었습니다.");
				System.out.println("1~5번과 0번을 입력 하실 수 있습니다.");
				break;
			} // end of switch
		} // end of while		
	} // end of execute
} // end of NoticeTecherVer class
