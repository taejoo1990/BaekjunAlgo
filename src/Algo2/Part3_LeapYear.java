package Algo2;

import java.util.Scanner;

//������ ���θ� �˷��ִ� ���α׷� -- 2021.11.30 Ted
//������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
public class Part3_LeapYear {

	public static void main(String[] args) {

		// ��ü����
		int year;
		Scanner scan = new Scanner(System.in);

		// �Է�
		System.out.println("���� ����");
		System.out.println("----------------");
		System.out.println("������ �Է��ϼ���");
		year = scan.nextInt();
		ReturnYear ry = new  ReturnYear(year);
		boolean res=ry.leapYear();

	}
}

class ReturnYear {
	private int a;

	// �⺻������
	public ReturnYear() {
	}

	// a�� �Ű������� �޴� ������
	public ReturnYear(int a) {
		this.a = a;
	}

	public boolean leapYear() {
		if ((a % 4) == 0 && ((a % 100) != 0 || (a % 400) == 0)) {
			System.out.println(1);
			return true;
		} else {
			System.out.println(0);
			return false;
		}

	}
}
