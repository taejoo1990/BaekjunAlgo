package Algo3;

import java.util.Scanner;

//N�� �Է¹޾� 1���� N������ ����ϴ� ���α׷� 2022.01.02 Ted
public class Part5_Print1toN {

	public static void main(String[] args) {

		// ����
		Scanner scan = new Scanner(System.in);

		// �Է�
		int n = scan.nextInt();
		// ���
		printN(n);
	}

	// N�� �Է¹޾� 1���� N�� ����ϴ� �޼���
	public static void printN(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i + 1);
		}
	}
}
