package Algo3;

import java.util.Scanner;

//정수 N을 입력받아, *을 1개부터 N개까지 형식에 맞춰 출력한다. 2022.01.02 Ted
public class Part10_PrintStar2 {
	public static void main(String[] args) {
		// 1. 입력
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
