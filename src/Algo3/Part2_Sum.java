package Algo3;

import java.util.Scanner;

public class Part2_Sum {
	public static void main(String[] args) {
		
		//����
		int n;
		Scanner scan = new Scanner(System.in);
		
		//�Է�
		n=scan.nextInt();
		int result = n ;
		//ó��
		for(int i=1; i<n ; i++) {
			result += i;
		}
		System.out.println(result);
	}

}
