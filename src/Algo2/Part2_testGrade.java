package Algo2;

import java.util.Scanner;

//시험점수를 입력받아 등급을 출력하는 프로그램 -- 2021.11.30 Ted
public class Part2_testGrade {

	public static void main(String[] args) {
		// 객체생성
		int a;
		System.out.println("시험점수를 입력하세요");
		Scanner scan = new Scanner(System.in);

		// 입력
		a = scan.nextInt();

		// 처리와 출력
		ReturnGrade rg = new ReturnGrade(a);
		rg.grade();
	}

}

//등급을 리턴하는 클래스.
class ReturnGrade {
	private int a;

	// 디폴트 생성자
	public ReturnGrade() {
	}

	// 시험점수를 입력받아 저장하는 생성자
	public ReturnGrade(int a) {
		this.a = a;
	}

	// 시험등급을 리턴하는 메서드
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
			System.out.println("잘못된 점수입니다. 1~100이내의 숫자를 입력하여 주세요.");

		} else {
			System.out.println("F");
		}

	}

}
