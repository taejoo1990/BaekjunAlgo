package Algo3;

import java.util.Scanner;

// �׽�Ʈ���̽��� �Է¹ް�, �Է¹��� ���̽���ŭ�� �� ���� �Է� �޾� ���� ����Ѵ�.
public class Part3_SumWhileCase {

	public static void main(String[] args) {
		
		//����
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
