package Algo3;

import java.util.Scanner;

//N을 입력받아 1부터 N까지를 충력하는 프로그램 2022.01.02 Ted
public class Part5_Print1toN {

	public static void main(String[] args) {

		// 선언
		Scanner scan = new Scanner(System.in);

		// 입력
		int n = scan.nextInt();
		// 출력
		printN(n);
	}

	// N을 입력받아 1부터 N을 출력하는 메서드
	public static void printN(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i + 1);
		}
	}
}
