package Exercise5;

public class Regular_triangle extends Shape {	//shape의 child class
	
	private int length;
	private char pattern;
	
	public Regular_triangle (int len, char pat) {	//매개변수로 받은 len과 pat을 class 변수에 저장하는 method
		length = len;
		pattern = pat;

	}

}
