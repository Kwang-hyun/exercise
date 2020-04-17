package ATM_num_11399;

import java.util.Scanner;

public class ATM {

	private static int[] personal_time; //ó�� �� �� ������� ���� �ҿ� �ð�
	
	public static void main(String[] args) {
		
		int result = 0; //�����
		int num; // �����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� ���� �Է��ϼ���.");
		num = sc.nextInt(); 
		
		personal_time = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.printf("%d���� ����� �ɸ��� �ð��� �Է��ϼ���", i + 1);
			personal_time[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num;i++) {   // ���� ���� �˰���
			int temp = i;

			for(int j = i + 1; j < num; j++) {
				if(personal_time[temp] >= personal_time[j]) {
					temp = j;
				}				
			}
			swap(i,temp);
		}
		
		for(int i = 0; i < num; i++) { //�� �ð� ���ϱ�
			for(int j = i; j < num; j++) {
				result = result + personal_time[i];
			}
		}
		
		System.out.println("�� ����� ���� �����ϴµ� �ʿ��� �ð��� ���� �ּڰ���" + result + "�� �Դϴ�.");
			
	}
	
	public static void swap(int temp1, int temp2) { //�迭 ��ġ�ٲٱ� swap �Լ� ����
		int temp = personal_time[temp1];
		personal_time[temp1] = personal_time[temp2];
		personal_time[temp2] = temp;
		
	}
}
