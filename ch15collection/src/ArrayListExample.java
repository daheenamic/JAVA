import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// 데이터 여러개를 담을 수 있는 객체 
		// :검색이 빨라야 하고 모든 데이터에 대한 처리를 해야 한다. -> ArrayList
		// <String> : 제네릭 -> List객체는 Object를 받는다.
		// 제네릭해서 사용하면 제네릭해서 사용된 데이터 타입으로 List 안에 데이터 타입이 Object에서 변경된다.
		// -> 실행 할 때 데이터 형태가 다르면 오류가 나기 때문에 변경한다.
		// 리스트는 같읕 데이터를 중복해서 넣을 수 있다.
		List<String> list = new ArrayList<String>();

		// 데이터 추가하는 add() 메서드 -> 데이터들의 뒤에 추가한다.
		list.add("java");
		System.out.println(list);
//		list.add(123465); // String 타입이 아니라서 에러. List에는 String만 넣을 수 있도록 제네릭 했다.
		list.add("JDBC");
		System.out.println(list);
		list.add("Servlet/JSP"); // [java, JDBC, Servlet/JSP] -> list[2]의 데이터는 현재 Servlet/JSp 이다.
		System.out.println(list);
		list.add(2, "Database"); // add 메서드를 사용해 데이터를 추가하면 순서대로 입력 되지만 앞에 숫자를 넣어주면 그 위치로 들어간다.
		System.out.println(list); // [java, JDBC, Database, Servlet/JSP] -> list[2]의 데이터가 Database로 바뀌었다.
		list.add("iBATIS");
		System.out.println(list);
		list.add("java");
		System.out.println(list);
		System.out.println();

		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();

		String skill = list.get(2); // index의 위치 데이터 가져오기
		System.out.println("2 skill : " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		// 향상된 for문
		String str ="";
		for(String data : list) str += data + ", ";
		//마지막 콤마를 없애는 방법 -> ", " - 2글자를 없앤다.
		str = str.substring(0, str.length() -2);
		System.out.println(str);
		System.out.println();
		
		// list 데이터 한 개 지우기 - remove(index) or remove(data)
		list.remove(2);
		System.out.println("remove(2) : " + list);
		list.remove(2);
		System.out.println("remove(2) : " + list);
		list.remove("java"); // 데이터로 지울 때는 최초 데이터만 지운다. (먼저 들어온 데이터)
		System.out.println("remove(java) : " + list);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str1 = list.get(i);
			System.out.println(i + " : " + str1);
		}
	}
}