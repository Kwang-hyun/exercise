package Exercise5;

public class Line extends Shape {	//shape의 child class

	private int length;
	private char pattern;
		
	public Line (int len, char pat) {	//매개변수로 받은 len과 pat을 class 변수에 저장하는 method
		length = len;
		pattern = pat;	

	}
}
