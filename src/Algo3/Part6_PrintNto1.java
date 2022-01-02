package Algo3;

import java.util.Scanner;

// N을 입력받아 N부터 1까지의 자연수를 출력하는 프로그램 2022.01.02 Ted
public class Part6_PrintNto1 {
	
	public static void main(String[] args) {
		
		// 1. 입력부
		Scanner scan = new Scanner(System.in) ;
		int n = scan.nextInt();
		
		// 2. 처리
		PrintNto1(n);
				
	}
	
	public static void PrintNto1(int n) {
		for(int i=0 ; i<n ; i++) {
			System.out.println(n-i);
		}
	}

}
