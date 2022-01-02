package Algo1;

//import
import java.util.*;


//두 수를 입력받아 나누는 프로그램.
public class Part8_division {
	
	//두 수를 입력받아, 나눈 결과를 리턴하는 메서드
	public static double div(int a, int b) {
		
		double div=(double)a/b;
		return div;
	}

	public static void main(String[] args) {
		// 1. 객체생성
		Scanner scan = new Scanner(System.in);
		// 2. 입력
		int a = scan.nextInt();
		int b = scan.nextInt();
		// 3. 처리
		double div = div(a,b);
		System.out.println(div);
		
		// 4. 출력
		System.out.println(Math.round(div*1000000000)/1000000000.0);
		
	}
}
