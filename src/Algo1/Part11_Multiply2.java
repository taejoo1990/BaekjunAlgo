package Algo1;

import java.util.Scanner;

//�� ���� ������ ó�������� �����ִ� ���α׷�
public class Part11_Multiply2 {
	public static void main(String[] args) {
		
		//��ü����
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a,b;
		
		//�Է�
		System.out.println("a*b----------------------");
		System.out.println("a�� �Է��Ͻÿ�");
		a=scan.nextInt();
		System.out.println("b�� �Է��Ͻÿ�");
		b=scan.nextInt();
		
		//ó�� �� ���
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
		//������ ������ ���Ѵ�.
		for(int i = 0; i<c ; i++) {
			//b�� �����ڸ��� ���Ѵ�.
			int tmp2 = tmp%10;
			//b�� �����ڸ��� a�� ���Ѵ�.
			int res = tmp2*a;
			//����� ����Ѵ�.
			System.out.println(res);
			//������ �Ϸ�� b�� ������ �ڸ����� �����Ѵ�.
			tmp = (int)(tmp*0.1);
		}
		//a*b�� ���� ����Ѵ�.
		System.out.println(a*b);
	}
	
	
}
