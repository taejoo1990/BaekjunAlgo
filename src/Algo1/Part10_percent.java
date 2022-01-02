package Algo1;
//import
import java.util.*;

//세 정수의 나머지를 구하는 프로그램
public class Part10_percent {
	
	public static void main(String[] args) {
		// 1. 객체생성
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		// 2. 입력
		System.out.println("a를 입력하세요");
		a=scan.nextInt();
		System.out.println("b를 입력하세요");
		b=scan.nextInt();
		System.out.println("c를 입력하세요");
		c=scan.nextInt();
		// 3. 처리
		Per per = new Per(a,b,c);
		int first=per.first();
		int second=per.second();
		int third=per.third();
		int forth=per.forth();
		// 4. 출력
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(forth);
		
	}
}

class Per{
	private int a;
	private int b;
	private int c;
	
	public Per(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public int first(){
		int result=(a+b)%c;
		return result;
	}
	public int second(){
		int result=((a%c)+(b%c))%c;
		return result;
	}
	public int third(){
		int result=(a*b)%c;
		return result;
	}
	public int forth(){
		int result=((a%c)*(b%c))%c;
		return result;
	}
	
}
