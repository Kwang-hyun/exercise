package Exercise5;

public class Rectangle extends Shape{	//shape�� child class
	
	private int row;
	private int column;
	private char pattern;

	public Rectangle (int col, int row, char pat) {	//�Ű������� ���� col, row�� pat�� class ������ �����ϴ� method
		column = col;
		this.row = row;
		pattern = pat;
	}
}
