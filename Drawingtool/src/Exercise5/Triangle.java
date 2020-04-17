package Exercise5;

public class Triangle extends Shape{	//shape의 child class
	
	private int length;
	private char pattern;

	public Triangle (int len, char pat) {	//매개변수로 받은 len과 pat을 class 변수에 저장하는 method
		this.length = len;
		pattern = pat;
	}

}