package Exercise5;

public class Rectangle extends Shape{	//shape의 child class
	
	private int row;
	private int column;
	private char pattern;

	public Rectangle (int col, int row, char pat) {	//매개변수로 받은 col, row와 pat을 class 변수에 저장하는 method
		column = col;
		this.row = row;
		pattern = pat;
	}
}
