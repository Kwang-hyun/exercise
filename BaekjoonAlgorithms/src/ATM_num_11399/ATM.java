package ATM_num_11399;

import java.util.Scanner;

public class ATM {

	private static int[] personal_time; //처음 줄 선 사람들의 개인 소요 시간
	
	public static void main(String[] args) {
		
		int result = 0; //결과값
		int num; // 사람수
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt(); 
		
		personal_time = new int[num];
		
		for(int i = 0; i < num; i++) {
			personal_time[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num;i++) {   // 선택 정렬 알고리즘
			int temp = i;

			for(int j = i + 1; j < num; j++) {
				if(personal_time[temp] >= personal_time[j]) {
					temp = j;
				}				
			}
			swap(i,temp);
		}
		
		for(int i = 0; i < num; i++) { //총 시간 구하기
			for(int j = i; j < num; j++) {
				result = result + personal_time[i];
			}
		}
		
		System.out.println(result);	
	}
	
	public static void swap(int temp1, int temp2) { //배열 위치바꾸기 swap 함수 구현
		int temp = personal_time[temp1];
		personal_time[temp1] = personal_time[temp2];
		personal_time[temp2] = temp;
		
	}
}
