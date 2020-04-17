package Exercise5;

import java.util.Scanner;

public class DrawMain {		//main class로 모양을 저장하고 사용자에게 번호를 입력받는 class
	
	public static final int SELECT_DRAW = 1;	//SELECT DRAW 1로 지정
	public static final int SELECT_SHOW_ALL = 2;	//SELECT SHOW ALL 2로 지정
	public static final int SELECT_DELETE_ALL = 3;	//SELECT DELETE ALL 3로 지정
	public static final int SELECT_QUIT = 4;	//SELECT QUIT 4로 지정

	public static final int LINE = 1;	//LINE 1로 지정
	public static final int WIDE_HORIZONTAL_LINE = 2;	//WIDELINE 2로 지정
	public static final int RECTANGLE = 3;	//RECTANGLE 3로 지정
	public static final int SQUARE = 4;	//SQUARE 4로 지정
	public static final int TRIANGLE = 5;	//TRIANGLE 5로 지정
	public static final int REGULAR_TRIANGLE = 6;	//REGULAR TRIANGLE 6로 지정
	
	private static int length[] = new int[100];	// 100크기의 length배열을 class내에서 공유하기 위해 static으로 지정 	모든 shape의 길이 저장
	private static int width[] = new int[100];	// 100크기의 width배열을 class내에서 공유하기 위해 static으로 지정	rectangle의 row 저장
	private static int num[] = new int[100];		// 100크기의 num배열을 class내에서 공유하기 위해 static으로 지정	만든 모양의 번호 저장
	private static char pattern[] = new char[100];	// 100크기의 pattern배열을 class내에서 공유하기 위해 static으로 지정	모든 shape의 pattern 저장
	private static int count;	//만든 모양의 수
	private static int widthcount;	//만든 rectangle의 수
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
		
		Line line = new Line(length[count],pattern[count]);	//line인스턴스 생성, count번째의 length와 pattern 매개변수
		Wide_Horizontal_Line wide = new Wide_Horizontal_Line(length[count], pattern[count]); //wide인스턴스 생성, count번째의 length와 pattern 매개변수
		Rectangle rect = new Rectangle(length[count], width[widthcount], pattern[count]);	//rect인스턴스 생성, count번째의 length와 pattern와 widthcount번째의 row 매개변수
		Square squa = new Square(length[count], pattern[count]);	//squa 인스턴스 생성, count번째의 length와 pattern 매개변수 
		Triangle tria = new Triangle(length[count],pattern[count]);	//tria 인스턴스 생성, count번째의 length와 pattern 매개변수 
		Regular_triangle regu = new Regular_triangle(length[count],pattern[count]);	//regu 인스턴스 생성, count번째의 length와 pattern 매개변수 
		
		do {	//selectmenu가 quit이 아닌동안
			showMenu ();	//showmenu method 호출
			System.out.print ("Enter a number >> ");
			selectmenu = sc.nextInt();	//selectmenu에 번호 입력
			
			switch (selectmenu) {	//selectmenu에 입력받는 번호마다 case
				case SELECT_DRAW:	//showmenu에서 selectdraw 1번 입력받은 경우
					showDrawMenu();		//showdrawmenu method 호출
					System.out.print ("Enter a number >> ");	
					selectdrawmenu = sc.nextInt();	//selectmenu에 번호 입력
					switch(selectdrawmenu) {	//selectdrawmenu에 입력받는 번호에 따라 case
						case LINE:	//showdrawmenu에서 line 1번 입력받은 경우
							receive();	//length와 pattern을 입력받는 method 호출
							line.drawline(length[count],pattern[count]);	//Shape class의 drawline호출 
							num[count] = LINE;	//count번째 num배열에 1저장
							count++;
							break;
							
						case WIDE_HORIZONTAL_LINE: 	//showdrawmenu에서 wide line 2번 입력받은 경우
							receive();	//length와 pattern을 입력받는 method 호출
							wide.drawwideline(length[count],pattern[count]);	//Shape class의 drawwideline호출 
							num[count] = WIDE_HORIZONTAL_LINE;	//count번째 num배열에 2저장
							count++;
							break;
						
						case RECTANGLE:	//showdrawmenu에서 rectangle 3번 입력받은 경우
							receive_rect();		//length, width와 pattern을 입력받는 method 호출
							rect.drawrectangle(length[count], width[widthcount], pattern[count]);	//Shape class의 drawrectangle호출 
							num[count] = RECTANGLE;	//count번째 num배열에 3저장
							count++;
							widthcount++;
							break;			
						
						case SQUARE:	//showdrawmenu에서 square 4번 입력받은 경우
							receive();	//length, pattern을 입력받는 method 호출
							squa.drawsquare(length[count], pattern[count]);	//Shape class의 drawsquare호출 
							num[count] = SQUARE;	//count번째 num배열에 4저장
							count++;
							break;
							
						case TRIANGLE:	//showdrawmenu에서 triangle 5번 입력받은 경우
							receive();	//length, pattern을 입력받는 method 호출
							tria.drawtriangle(length[count], pattern[count]);	//Shape class의 drawtriangle호출
							num[count] = TRIANGLE;	//count번째 num배열에 5저장
							count++;
							break;
							
						case REGULAR_TRIANGLE:	//showdrawmenu에서 regular triangle 6번 입력받은 경우
							receive();	//length, pattern을 입력받는 method 호출
							tria.drawregular(length[count], pattern[count]);	//Shape class의 drawregulartriangle 호출
							num[count] = REGULAR_TRIANGLE;	//count번째 num배열에 6저장
							count++;
							break;
												
					}
				break;
				
				case SELECT_SHOW_ALL:	//showmenu에서 selectshowall 2번 입력받은 경우
					for (int i = 0; i < count; i++) {	//만든 모양의 수 만큼 반복
						switch(num[i]) {	//i번째 num 의 값으로 case문 
							case 1:	//i번째  num이 1인 경우
								line.drawline(length[a], pattern[a]);	//a번째 length와 pattern을 매개변수로 shape class의 drawline호출
								a++;
								break;
							case 2:	//i번째  num이 2인 경우
								wide.drawwideline(length[a], pattern[a]);	//a번째 length와 pattern을 매개변수로 shape class의 drawwideline호출
								a++;
								break;	
							case 3:	//i번째  num이 3인 경우
								rect.drawrectangle(length[a], width[b], pattern[a]);	//a번째 length와 pattern, b번째 width를 매개변수로 shape class의 drawline호출
								a++;
								b++;
								break;
							case 4:	//i번째  num이 4인 경우
								squa.drawsquare(length[a], pattern[a]);	//a번째 length와 pattern을 매개변수로 shape class의 drawsquare호출
								a++;
								break;
							case 5:	//i번째  num이 5인 경우
								tria.drawtriangle(length[a], pattern[a]);	//a번째 length와 pattern을 매개변수로 shape class의 drawtriangle호출
								a++;
								break;
							case 6:	//i번째  num이 6인 경우
								regu.drawregular(length[a],  pattern[a]);	//a번째 length와 pattern을 매개변수로 shape class의 drawregular호출
								a++;
								break;
													
						}
					}
										
					break;
				
				case SELECT_DELETE_ALL:	//showmenu에서 selectdeleteall 3번 입력받은 경우
					for(int j = 98; j >= 0; j--) {	//100번째 배열을 null이라 판단 99번째 배열에 100번째 값을 넣고 0까지 반복해서 전 배열을 null로
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
		
		}while (selectmenu != SELECT_QUIT);	//selectmenu에서 selectquit 4번이 입력되면 
		System.out.println("Bye~");	//bye 출력후 while문 탈출
		
	}
	
	public static void showMenu() {	//첫번째 menu print
		System.out.println("******************");
		System.out.println("*  1. Draw       *");
		System.out.println("*  2. Show All   *");
		System.out.println("*  3. Delete All *");
		System.out.println("*  4. Quit       *");		
		System.out.println("******************");
	}
	
	public static void showDrawMenu() {	//두번째 menu print
		System.out.println("***************************");
		System.out.println("*        1. Line          *");
		System.out.println("* 2. Wide Horizontal Line *");
		System.out.println("*      3. Rectangle       *");
		System.out.println("*        4.Square         *");
		System.out.println("*       5.Triangle        *");
		System.out.println("*     6.Regular_Trian     *");
		System.out.println("***************************");
	}
	
	public static void receive() {	//rectangle을 제외한 모든 shape의 length와 pattern을 입력받는 method 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter line length");
		length[count] = sc.nextInt();	//length count번째에 저장
		System.out.println("Enter pattern");
		pattern[count] = sc.next().charAt(0);	//pattern count번째에 string으로 입력받은 문자열의 0번째 char 저장
	}
	
	public static void receive_rect() {		//rectangle의 length,width와  pattern을 입력받는 method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter column length");
		length[count] = sc.nextInt();
		System.out.println("Enter row length");
		width[widthcount] = sc.nextInt();
		System.out.println("Enter pattern");
		pattern[count] = sc.next().charAt(0);
		
	}

}
