package Exercise5;

public class Shape {	//shape의 모양을 print하는 class

	public void drawline(int length, char pattern) {	//매개변수로 length와 pattern을 입력받아 line 출력

		System.out.println();
		for (int i = 0; i < length; i++) {
			System.out.print(pattern);
		}
		System.out.println();
	}
	
	public void drawwideline(int length, char pattern) {	//매개변수로 length와 pattern을 입력받아 wideline 출력
		System.out.println();
		for (int i = 0; i < length; i++) {
			System.out.print(pattern + " ");
		}
		System.out.println();
	}
	
	public void drawrectangle(int column, int row, char pattern) {	//매개변수로 column,row와 pattern을 입력받아 rectangle 출력
		System.out.println();
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(pattern);
			}
			System.out.println();
		}
	}
	
	public void drawsquare(int length, char pattern) {	//매개변수로 length와 pattern을 입력받아 square 출력
		System.out.println();
		for (int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				System.out.print(pattern);
			}
			System.out.println();
		}
	}
	
	public void drawtriangle(int length, char pattern) {	//매개변수로 length와 pattern을 입력받아 triangle 출력
		System.out.println();
		for (int i = 0; i < length; i++) {
			for( int j = 0; j < i+1; j++ ) {
				System.out.print(pattern);
			}
			System.out.println();
		}
	}
	
	public void drawregular(int length, char pattern) {	//매개변수로 length와 pattern을 입력받아 regulartriangle 출력
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
