package Algo3;

import java.util.Scanner;

//���� N�� �Է¹޾�, *�� 1������ N������ ���Ŀ� ���� ����Ѵ�. 2022.01.02 Ted
public class Part10_PrintStar2 {
	public static void main(String[] args) {
		// 1. �Է�
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1 ; j<=(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
