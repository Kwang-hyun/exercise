package Exercise5;

public class Shape {	//shape�� ����� print�ϴ� class

	public void drawline(int length, char pattern) {	//�Ű������� length�� pattern�� �Է¹޾� line ���

		System.out.println();
		for (int i = 0; i < length; i++) {
			System.out.print(pattern);
		}
		System.out.println();
	}
	
	public void drawwideline(int length, char pattern) {	//�Ű������� length�� pattern�� �Է¹޾� wideline ���
		System.out.println();
		for (int i = 0; i < length; i++) {
			System.out.print(pattern + " ");
		}
		System.out.println();
	}
	
	public void drawrectangle(int column, int row, char pattern) {	//�Ű������� column,row�� pattern�� �Է¹޾� rectangle ���
		System.out.println();
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(pattern);
			}
			System.out.println();
		}
	}
	
	public void drawsquare(int length, char pattern) {	//�Ű������� length�� pattern�� �Է¹޾� square ���
		System.out.println();
		for (int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				System.out.print(pattern);
			}
			System.out.println();
		}
	}
	
	public void drawtriangle(int length, char pattern) {	//�Ű������� length�� pattern�� �Է¹޾� triangle ���
		System.out.println();
		for (int i = 0; i < length; i++) {
			for( int j = 0; j < i+1; j++ ) {
				System.out.print(pattern);
			}
			System.out.println();
		}
	}
	
	public void drawregular(int length, char pattern) {	//�Ű������� length�� pattern�� �Է¹޾� regulartriangle ���
		System.out.println();
		for(int i = 0; i < length + 1; i++) {
			for (int j = length + 1; j > i; j-- ) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print(pattern+" ");
			}
			System.out.println();
		}
	}
	
}
