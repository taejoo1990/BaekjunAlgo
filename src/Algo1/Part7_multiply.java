package Algo1;

//����Ʈ
import java.util.Scanner;

//�� ���� �Է¹޾� ���� ���ϴ� ���α׷�.
public class Part7_multiply {
	
	//�Ű����� a,b�� �Է¹޾� ���� ��ȯ�ϴ� �޼���
	public static int multiply(int a, int b) {
		int mul = a*b;
		return mul;
	}
	
	public static void main(String[] args) {
		
		//������ ��ü����.
		int a,b;
		Scanner scan = new Scanner(System.in);
		
		// 1.�Է�
		System.out.printf("%s","A�� �Է��Ͽ� �ּ���.");
		a=scan.nextInt();
		System.out.printf("%s","B�� �Է��Ͽ� �ּ���.");
		b=scan.nextInt();
		// 2.ó��
		int mul = multiply(a,b); 
		// 3.���
		System.out.printf("%d * %d = %d",a,b,mul);
		
	}

}
