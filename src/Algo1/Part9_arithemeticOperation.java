package Algo1;
import java.util.*;

//2���� �ڿ����� �Է¹޾� ��Ģ����� �������� ���ϴ� ���α׷� 2021.11.29 Ted
public class Part9_arithemeticOperation {
	
	public static void main(String[] args) {
		//��ü����
		Scanner scan = new Scanner(System.in);
		int a,b;
		
		// 1.�Է�
		System.out.println("��Ģ����");
		System.out.println("A�� �Է��Ͽ� �ּ���.");
		a=scan.nextInt();
		System.out.println("B�� �Է��Ͽ� �ּ���.");
		b=scan.nextInt(); 
		// 2.ó��
		//��Ģ���� AriŬ������ ��ü�� �� ���� �־� ����
		Ari ari = new Ari(a, b);
		int sum = ari.sum();
		int minus = ari.minus();
		int mul = ari.mul();
		int div = ari.div();
		int per = ari.per();
		// 3.���
		System.out.println(a+"+"+b+"="+sum);
		System.out.println(a+"-"+b+"="+minus);
		System.out.println(a+"*"+b+"="+mul);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+per);

	}
}

//��Ģ����� �������� ����ϴ� Ŭ����.
class Ari{
	int a,b;
	
	//�� ������ �����ڷ� �޾� setting
	public Ari(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	//���ϱ� �޼���
	public int sum() {
		int sum=a+b;
		return sum;
}
	//���� �޼���
	public int minus() {
		int minus=a-b;
		return minus;
	}
	//���ϱ� �޼���
	public int mul() {
		int mul=a*b;
		return mul;
	}
	//������ �޼���
	public int div() {
		int div=a/b;
		return div;
	}
	//������ �޼���
	public int per() {
		int per=a%b;
		return per;
	}
}
