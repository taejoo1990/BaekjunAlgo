package Algo3;

import java.util.Scanner;

//N�� �Է¹޾� ���� 1������  N������ ����Ѵ�. 2022.01.02 Ted
public class Part9_PrintStar {
	
	public static void main(String[] args) {
		
		// 1. �Է�
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String star ="*";
		String result = "*";
		// 2. ���
		for(int i=1 ; i<=num ;i++ ) {
			System.out.println(star);
			star = star+result;
		}
		
	}

}
