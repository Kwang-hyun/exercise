package Exercise5;

public class Triangle extends Shape{	//shape�� child class
	
	private int length;
	private char pattern;

	public Triangle (int len, char pat) {	//�Ű������� ���� len�� pat�� class ������ �����ϴ� method
		this.length = len;
		pattern = pat;
	}

}