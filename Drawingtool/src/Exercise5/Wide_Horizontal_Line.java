package Exercise5;

public class Wide_Horizontal_Line extends Shape {	//shape의 child class
	
	private int length;
	private char pattern;

	public Wide_Horizontal_Line (int len, char pat) {	//매개변수로 받은 len과 pat을 class 변수에 저장하는 method
		length = len;
		pattern = pat;
	}
	
}
