package Algo2;

import java.util.Scanner;

//�� ���� ���Ͽ� ����� ">""<""=="�� ����ϴ� ���α׷�. 2021.11.30 Ted
public class Part1_compare {

	public static void main(String[] args) {
		
		//��ü����
		int a,b;
		Scanner scan = new Scanner(System.in);
		
		//�Է�
		a=scan.nextInt();
		b=scan.nextInt();
		Compare compare = new Compare(a,b);
		
		//ó�������
		compare.compare();
		
	}
}

//�񱳸� ���� Ŭ����
class Compare{
	private int a,b;
	
	//����Ʈ ������.
	public Compare() {}

	//�� ���� �񱳸� ���� �� ���� �Ű������� �ϴ� �����ڸ� �����.
	public Compare(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	//�񱳸� ���� �޼���
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