package Algo1;
//import
import java.util.*;

//�� ������ �������� ���ϴ� ���α׷�
public class Part10_percent {
	
	public static void main(String[] args) {
		// 1. ��ü����
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		// 2. �Է�
		System.out.println("a�� �Է��ϼ���");
		a=scan.nextInt();
		System.out.println("b�� �Է��ϼ���");
		b=scan.nextInt();
		System.out.println("c�� �Է��ϼ���");
		c=scan.nextInt();
		// 3. ó��
		Per per = new Per(a,b,c);
		int first=per.first();
		int second=per.second();
		int third=per.third();
		int forth=per.forth();
		// 4. ���
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
