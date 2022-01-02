package Algo3;

import java.util.Scanner;

// 테스트케이스를 입력받고, 입력받은 케이스만큼의 두 수를 입력 받아 합을 출력한다.
public class Part3_SumWhileCase {

	public static void main(String[] args) {
		
		//선언
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		
		int num1[] = new int[testcase];
		int num2[] = new int[testcase];
		
		for(int i=0 ; i<testcase ; i++) {
			num1[i]=scan.nextInt();
			num2[i]=scan.nextInt();
		}
		for(int i=0 ; i<testcase ; i++) {
			System.out.println(num1[i]+num2[i]);
		}
		
		
		
		
		
	}
}
