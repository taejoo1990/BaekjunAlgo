package Algo2;

import java.util.Scanner;

//윤년의 여부를 알려주는 프로그램 -- 2021.11.30 Ted
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
public class Part3_LeapYear {

	public static void main(String[] args) {

		// 객체생성
		int year;
		Scanner scan = new Scanner(System.in);

		// 입력
		System.out.println("윤년 계산기");
		System.out.println("----------------");
		System.out.println("연도를 입력하세요");
		year = scan.nextInt();
		ReturnYear ry = new  ReturnYear(year);
		boolean res=ry.leapYear();

	}
}

class ReturnYear {
	private int a;

	// 기본생성자
	public ReturnYear() {
	}

	// a를 매개변수로 받는 생성자
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
