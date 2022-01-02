package Algo1;

import java.util.Scanner;

//두 수의 곱셈의 처리과정을 보여주는 프로그램
public class Part11_Multiply2 {
	public static void main(String[] args) {
		
		//객체생성
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a,b;
		
		//입력
		System.out.println("a*b----------------------");
		System.out.println("a를 입력하시오");
		a=scan.nextInt();
		System.out.println("b를 입력하시오");
		b=scan.nextInt();
		
		//처리 및 출력
		Mul mul = new Mul(a,b);
		mul.cal();
		
		
	}
}

class Mul{
	private int a,b,c,tmp;
	
	public Mul(int a, int b) {
		this.a=a;
		this.b=b;
		this.tmp=b;
		this.c=(int)Math.log10(b)+1;
	}
	
	public void cal() {
		//곱셈을 연산을 구한다.
		for(int i = 0; i<c ; i++) {
			//b의 일의자리를 구한다.
			int tmp2 = tmp%10;
			//b의 일의자리와 a를 곱한다.
			int res = tmp2*a;
			//결과를 출력한다.
			System.out.println(res);
			//연산이 완료된 b의 마지막 자리수를 제거한다.
			tmp = (int)(tmp*0.1);
		}
		//a*b의 값을 출력한다.
		System.out.println(a*b);
	}
	
	
}
