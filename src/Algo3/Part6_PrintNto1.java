package Algo3;

import java.util.Scanner;

// N�� �Է¹޾� N���� 1������ �ڿ����� ����ϴ� ���α׷� 2022.01.02 Ted
public class Part6_PrintNto1 {
	
	public static void main(String[] args) {
		
		// 1. �Էº�
		Scanner scan = new Scanner(System.in) ;
		int n = scan.nextInt();
		
		// 2. ó��
		PrintNto1(n);
				
	}
	
	public static void PrintNto1(int n) {
		for(int i=0 ; i<n ; i++) {
			System.out.println(n-i);
		}
	}

}
