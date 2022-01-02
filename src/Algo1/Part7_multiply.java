package Algo1;

//임포트
import java.util.Scanner;

//두 수를 입력받아 곱을 구하는 프로그램.
public class Part7_multiply {
	
	//매개변수 a,b를 입력받아 곱을 반환하는 메서드
	public static int multiply(int a, int b) {
		int mul = a*b;
		return mul;
	}
	
	public static void main(String[] args) {
		
		//변수와 객체생성.
		int a,b;
		Scanner scan = new Scanner(System.in);
		
		// 1.입력
		System.out.printf("%s","A를 입력하여 주세요.");
		a=scan.nextInt();
		System.out.printf("%s","B를 입력하여 주세요.");
		b=scan.nextInt();
		// 2.처리
		int mul = multiply(a,b); 
		// 3.출력
		System.out.printf("%d * %d = %d",a,b,mul);
		
	}

}
