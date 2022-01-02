package Algo3;

import java.util.Scanner;

//N을 입력받아 별을 1개부터  N개까지 출력한다. 2022.01.02 Ted
public class Part9_PrintStar {
	
	public static void main(String[] args) {
		
		// 1. 입력
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String star ="*";
		String result = "*";
		// 2. 출력
		for(int i=1 ; i<=num ;i++ ) {
			System.out.println(star);
			star = star+result;
		}
		
	}

}
