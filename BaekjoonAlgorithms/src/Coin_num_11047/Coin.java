package Coin_num_11047;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		int N, K;
		int A[];
		int temp1, temp2;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		K = sc.nextInt();
		
		A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		temp1 = N - 1;
		temp2 = K;
		
		while(temp2 % A[temp1] != 0) {
			if(temp2 / A[temp1] != 0) {
				count = count + (temp2 / A[temp1]); 
				temp2 = temp2 % A[temp1];
			}
			temp1--;
		}
		count = count + (temp2 / A[temp1]); 
		
		System.out.println(count);
		
		
		
	}
}
