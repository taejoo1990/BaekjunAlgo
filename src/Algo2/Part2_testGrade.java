package Algo2;

import java.util.Scanner;

//���������� �Է¹޾� ����� ����ϴ� ���α׷� -- 2021.11.30 Ted
public class Part2_testGrade {

	public static void main(String[] args) {
		// ��ü����
		int a;
		System.out.println("���������� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);

		// �Է�
		a = scan.nextInt();

		// ó���� ���
		ReturnGrade rg = new ReturnGrade(a);
		rg.grade();
	}

}

//����� �����ϴ� Ŭ����.
class ReturnGrade {
	private int a;

	// ����Ʈ ������
	public ReturnGrade() {
	}

	// ���������� �Է¹޾� �����ϴ� ������
	public ReturnGrade(int a) {
		this.a = a;
	}

	// �������� �����ϴ� �޼���
	public void grade() {
		if (a >= 90 && a <= 100) {
			System.out.println("A");

		} else if (a >= 80 && a <= 89) {
			System.out.println("B");

		} else if (a >= 70 && a <= 79) {
			System.out.println("C");

		} else if (a >= 60 && a <= 69) {
			System.out.println("D");

		} else if (a < 0 || a > 100) {
			System.out.println("�߸��� �����Դϴ�. 1~100�̳��� ���ڸ� �Է��Ͽ� �ּ���.");

		} else {
			System.out.println("F");
		}

	}

}
