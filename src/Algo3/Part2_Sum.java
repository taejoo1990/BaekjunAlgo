package Algo3;

import java.util.Scanner;

public class Part2_Sum {
	public static void main(String[] args) {
		
		//선언
		int n;
		Scanner scan = new Scanner(System.in);
		
		//입력
		n=scan.nextInt();
		int result = n ;
		//처리
		for(int i=1; i<n ; i++) {
			result += i;
		}
		System.out.println(result);
	}

}
