package Exercise5;

import java.util.Scanner;

public class DrawMain {		//main class�� ����� �����ϰ� ����ڿ��� ��ȣ�� �Է¹޴� class
	
	public static final int SELECT_DRAW = 1;	//SELECT DRAW 1�� ����
	public static final int SELECT_SHOW_ALL = 2;	//SELECT SHOW ALL 2�� ����
	public static final int SELECT_DELETE_ALL = 3;	//SELECT DELETE ALL 3�� ����
	public static final int SELECT_QUIT = 4;	//SELECT QUIT 4�� ����

	public static final int LINE = 1;	//LINE 1�� ����
	public static final int WIDE_HORIZONTAL_LINE = 2;	//WIDELINE 2�� ����
	public static final int RECTANGLE = 3;	//RECTANGLE 3�� ����
	public static final int SQUARE = 4;	//SQUARE 4�� ����
	public static final int TRIANGLE = 5;	//TRIANGLE 5�� ����
	public static final int REGULAR_TRIANGLE = 6;	//REGULAR TRIANGLE 6�� ����
	
	private static int length[] = new int[100];	// 100ũ���� length�迭�� class������ �����ϱ� ���� static���� ���� 	��� shape�� ���� ����
	private static int width[] = new int[100];	// 100ũ���� width�迭�� class������ �����ϱ� ���� static���� ����	rectangle�� row ����
	private static int num[] = new int[100];		// 100ũ���� num�迭�� class������ �����ϱ� ���� static���� ����	���� ����� ��ȣ ����
	private static char pattern[] = new char[100];	// 100ũ���� pattern�迭�� class������ �����ϱ� ���� static���� ����	��� shape�� pattern ����
	private static int count;	//���� ����� ��
	private static int widthcount;	//���� rectangle�� ��
	private static int a; 
	private static int b;	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int selectdrawmenu;
		int selectmenu;
		count = 0;
		widthcount = 0;
		
		a = 0;
		b = 0;
		
		Line line = new Line(length[count],pattern[count]);	//line�ν��Ͻ� ����, count��°�� length�� pattern �Ű�����
		Wide_Horizontal_Line wide = new Wide_Horizontal_Line(length[count], pattern[count]); //wide�ν��Ͻ� ����, count��°�� length�� pattern �Ű�����
		Rectangle rect = new Rectangle(length[count], width[widthcount], pattern[count]);	//rect�ν��Ͻ� ����, count��°�� length�� pattern�� widthcount��°�� row �Ű�����
		Square squa = new Square(length[count], pattern[count]);	//squa �ν��Ͻ� ����, count��°�� length�� pattern �Ű����� 
		Triangle tria = new Triangle(length[count],pattern[count]);	//tria �ν��Ͻ� ����, count��°�� length�� pattern �Ű����� 
		Regular_triangle regu = new Regular_triangle(length[count],pattern[count]);	//regu �ν��Ͻ� ����, count��°�� length�� pattern �Ű����� 
		
		do {	//selectmenu�� quit�� �ƴѵ���
			showMenu ();	//showmenu method ȣ��
			System.out.print ("Enter a number >> ");
			selectmenu = sc.nextInt();	//selectmenu�� ��ȣ �Է�
			
			switch (selectmenu) {	//selectmenu�� �Է¹޴� ��ȣ���� case
				case SELECT_DRAW:	//showmenu���� selectdraw 1�� �Է¹��� ���
					showDrawMenu();		//showdrawmenu method ȣ��
					System.out.print ("Enter a number >> ");	
					selectdrawmenu = sc.nextInt();	//selectmenu�� ��ȣ �Է�
					switch(selectdrawmenu) {	//selectdrawmenu�� �Է¹޴� ��ȣ�� ���� case
						case LINE:	//showdrawmenu���� line 1�� �Է¹��� ���
							receive();	//length�� pattern�� �Է¹޴� method ȣ��
							line.drawline(length[count],pattern[count]);	//Shape class�� drawlineȣ�� 
							num[count] = LINE;	//count��° num�迭�� 1����
							count++;
							break;
							
						case WIDE_HORIZONTAL_LINE: 	//showdrawmenu���� wide line 2�� �Է¹��� ���
							receive();	//length�� pattern�� �Է¹޴� method ȣ��
							wide.drawwideline(length[count],pattern[count]);	//Shape class�� drawwidelineȣ�� 
							num[count] = WIDE_HORIZONTAL_LINE;	//count��° num�迭�� 2����
							count++;
							break;
						
						case RECTANGLE:	//showdrawmenu���� rectangle 3�� �Է¹��� ���
							receive_rect();		//length, width�� pattern�� �Է¹޴� method ȣ��
							rect.drawrectangle(length[count], width[widthcount], pattern[count]);	//Shape class�� drawrectangleȣ�� 
							num[count] = RECTANGLE;	//count��° num�迭�� 3����
							count++;
							widthcount++;
							break;			
						
						case SQUARE:	//showdrawmenu���� square 4�� �Է¹��� ���
							receive();	//length, pattern�� �Է¹޴� method ȣ��
							squa.drawsquare(length[count], pattern[count]);	//Shape class�� drawsquareȣ�� 
							num[count] = SQUARE;	//count��° num�迭�� 4����
							count++;
							break;
							
						case TRIANGLE:	//showdrawmenu���� triangle 5�� �Է¹��� ���
							receive();	//length, pattern�� �Է¹޴� method ȣ��
							tria.drawtriangle(length[count], pattern[count]);	//Shape class�� drawtriangleȣ��
							num[count] = TRIANGLE;	//count��° num�迭�� 5����
							count++;
							break;
							
						case REGULAR_TRIANGLE:	//showdrawmenu���� regular triangle 6�� �Է¹��� ���
							receive();	//length, pattern�� �Է¹޴� method ȣ��
							tria.drawregular(length[count], pattern[count]);	//Shape class�� drawregulartriangle ȣ��
							num[count] = REGULAR_TRIANGLE;	//count��° num�迭�� 6����
							count++;
							break;
												
					}
				break;
				
				case SELECT_SHOW_ALL:	//showmenu���� selectshowall 2�� �Է¹��� ���
					for (int i = 0; i < count; i++) {	//���� ����� �� ��ŭ �ݺ�
						switch(num[i]) {	//i��° num �� ������ case�� 
							case 1:	//i��°  num�� 1�� ���
								line.drawline(length[a], pattern[a]);	//a��° length�� pattern�� �Ű������� shape class�� drawlineȣ��
								a++;
								break;
							case 2:	//i��°  num�� 2�� ���
								wide.drawwideline(length[a], pattern[a]);	//a��° length�� pattern�� �Ű������� shape class�� drawwidelineȣ��
								a++;
								break;	
							case 3:	//i��°  num�� 3�� ���
								rect.drawrectangle(length[a], width[b], pattern[a]);	//a��° length�� pattern, b��° width�� �Ű������� shape class�� drawlineȣ��
								a++;
								b++;
								break;
							case 4:	//i��°  num�� 4�� ���
								squa.drawsquare(length[a], pattern[a]);	//a��° length�� pattern�� �Ű������� shape class�� drawsquareȣ��
								a++;
								break;
							case 5:	//i��°  num�� 5�� ���
								tria.drawtriangle(length[a], pattern[a]);	//a��° length�� pattern�� �Ű������� shape class�� drawtriangleȣ��
								a++;
								break;
							case 6:	//i��°  num�� 6�� ���
								regu.drawregular(length[a],  pattern[a]);	//a��° length�� pattern�� �Ű������� shape class�� drawregularȣ��
								a++;
								break;
													
						}
					}
										
					break;
				
				case SELECT_DELETE_ALL:	//showmenu���� selectdeleteall 3�� �Է¹��� ���
					for(int j = 98; j >= 0; j--) {	//100��° �迭�� null�̶� �Ǵ� 99��° �迭�� 100��° ���� �ְ� 0���� �ݺ��ؼ� �� �迭�� null��
						num[j] = num [j+1];
						length[j] = length[j+1];
						width[j] = width[j+1];
						pattern[j] = pattern[j+1];
												
					}
					count = 0;
					widthcount = 0;
					a = 0;
					b = 0;										
					break;
										
			}
		
		}while (selectmenu != SELECT_QUIT);	//selectmenu���� selectquit 4���� �ԷµǸ� 
		System.out.println("Bye~");	//bye ����� while�� Ż��
		
	}
	
	public static void showMenu() {	//ù��° menu print
		System.out.println("******************");
		System.out.println("*  1. Draw       *");
		System.out.println("*  2. Show All   *");
		System.out.println("*  3. Delete All *");
		System.out.println("*  4. Quit       *");		
		System.out.println("******************");
	}
	
	public static void showDrawMenu() {	//�ι�° menu print
		System.out.println("***************************");
		System.out.println("*        1. Line          *");
		System.out.println("* 2. Wide Horizontal Line *");
		System.out.println("*      3. Rectangle       *");
		System.out.println("*        4.Square         *");
		System.out.println("*       5.Triangle        *");
		System.out.println("*     6.Regular_Trian     *");
		System.out.println("***************************");
	}
	
	public static void receive() {	//rectangle�� ������ ��� shape�� length�� pattern�� �Է¹޴� method 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter line length");
		length[count] = sc.nextInt();	//length count��°�� ����
		System.out.println("Enter pattern");
		pattern[count] = sc.next().charAt(0);	//pattern count��°�� string���� �Է¹��� ���ڿ��� 0��° char ����
	}
	
	public static void receive_rect() {		//rectangle�� length,width��  pattern�� �Է¹޴� method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter column length");
		length[count] = sc.nextInt();
		System.out.println("Enter row length");
		width[widthcount] = sc.nextInt();
		System.out.println("Enter pattern");
		pattern[count] = sc.next().charAt(0);
		
	}

}
