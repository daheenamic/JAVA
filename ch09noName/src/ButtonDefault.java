
public interface ButtonDefault {
	
	// java 1.8 버전 이상부터 구현할 수 있음
	public default void mouseOver() {};
	public default void mouseLeave() {};
	public default void click() {};
	public default void doubleClick() {};
}