package Algo2;

import java.util.Scanner;

//두 수를 비교하여 결과로 ">""<""=="를 출력하는 프로그램. 2021.11.30 Ted
public class Part1_compare {

	public static void main(String[] args) {
		
		//객체생성
		int a,b;
		Scanner scan = new Scanner(System.in);
		
		//입력
		a=scan.nextInt();
		b=scan.nextInt();
		Compare compare = new Compare(a,b);
		
		//처리와출력
		compare.compare();
		
	}
}

//비교를 위한 클래스
class Compare{
	private int a,b;
	
	//디폴트 생성자.
	public Compare() {}

	//두 수의 비교를 위해 두 수를 매개변수로 하는 생성자를 만든다.
	public Compare(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	//비교를 위한 메서드
	public void compare() {
		if(a==b) {
			System.out.println("==");
		}else if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}
	}
	
	
}