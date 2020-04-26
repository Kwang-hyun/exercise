package MeetingRoom_num_1931;

import java.util.Scanner;

public class MeetingRoom {

	private static int [][] time; //���۽ð��� ���ð��� ���� ���߹迭�� ����
	private static int tempN;
	
	public static void main(String[] args) {
		
		int N; //ȸ�Ǽ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ȸ�� ����");
		
		N = sc.nextInt();
		
		tempN = N;
		
		time = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();		
		}
		
		for(int i = 0; i < N; i++) { //������ ȸ�̽ð��� �ٸ� ȸ�ǽð��� ���ԵǴ� �κ� ����
			for(int j = i + 1; j < N; j++) {
			
				if(time[i][0] == 0 && time[i][1] == 0) {			
				}else {
					if(time[j][0] <= time[i][0] && time[j][1] >= time[i][1]) {
						time[j][0] = 0;
						time[j][1] = 0;
					}
					else if(time[j][0] >= time[i][0] && time[j][1] <= time[i][1]) {
						time[i][0] = 0;
						time[i][1] = 0;
					}
				}
				
			}
		
		}
		
		
		for(int i = 0; i < tempN; i++) {
			if(time[i][0] == 0 && time[i][1] == 0) {
				pop(i);
				i--;
			}
		}
		
		selectionSort();
		
		for(int i = 0; i < tempN; i++) {
			System.out.printf("(%d,%d)", time[i][0], time[i][1]);
		}
	}
	
	public static void pop(int index) {
		time[index][0] = time[tempN - 1][0];
		time[index][1] = time[tempN - 1][1];
		
		tempN--;
	}
	
	public static void selectionSort() {
		
		int temp;
		
		for(int i = 0; i < tempN; i++) {
			temp = i;
			for(int j = i+1; j < tempN; j++) {
				if(time[temp][1] >= time[j][1]) {
					temp = j;
				}
			}
			swap(i, temp);
		}
	}
	
	public static void swap(int index1, int index2) {
		int temp1, temp2;
		
		temp1 = time[index1][0];
		temp2 = time[index1][1];
		
		time[index1][0] = time[index2][0];
		time[index1][1] = time[index2][1];
		
		time[index2][0] = temp1;
		time[index2][1] = temp2;		
		
	}
}
