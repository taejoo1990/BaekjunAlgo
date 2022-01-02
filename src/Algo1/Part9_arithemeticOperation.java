package Algo1;
import java.util.*;

//2개의 자연수를 입력받아 사칙연산과 나머지를 구하는 프로그램 2021.11.29 Ted
public class Part9_arithemeticOperation {
	
	public static void main(String[] args) {
		//객체생성
		Scanner scan = new Scanner(System.in);
		int a,b;
		
		// 1.입력
		System.out.println("사칙연산");
		System.out.println("A를 입력하여 주세요.");
		a=scan.nextInt();
		System.out.println("B를 입력하여 주세요.");
		b=scan.nextInt(); 
		// 2.처리
		//사칙연산 Ari클래스의 객체를 두 수를 넣어 생성
		Ari ari = new Ari(a, b);
		int sum = ari.sum();
		int minus = ari.minus();
		int mul = ari.mul();
		int div = ari.div();
		int per = ari.per();
		// 3.출력
		System.out.println(a+"+"+b+"="+sum);
		System.out.println(a+"-"+b+"="+minus);
		System.out.println(a+"*"+b+"="+mul);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+per);

	}
}

//사칙연산과 나머지를 계산하는 클래스.
class Ari{
	int a,b;
	
	//두 정수를 생성자로 받아 setting
	public Ari(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	//더하기 메서드
	public int sum() {
		int sum=a+b;
		return sum;
}
	//빼기 메서드
	public int minus() {
		int minus=a-b;
		return minus;
	}
	//곱하기 메서드
	public int mul() {
		int mul=a*b;
		return mul;
	}
	//나누기 메서드
	public int div() {
		int div=a/b;
		return div;
	}
	//나머지 메서드
	public int per() {
		int per=a%b;
		return per;
	}
}
