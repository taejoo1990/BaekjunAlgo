package Algo1;

//import
import java.util.*;


//�� ���� �Է¹޾� ������ ���α׷�.
public class Part8_division {
	
	//�� ���� �Է¹޾�, ���� ����� �����ϴ� �޼���
	public static double div(int a, int b) {
		
		double div=(double)a/b;
		return div;
	}

	public static void main(String[] args) {
		// 1. ��ü����
		Scanner scan = new Scanner(System.in);
		// 2. �Է�
		int a = scan.nextInt();
		int b = scan.nextInt();
		// 3. ó��
		double div = div(a,b);
		System.out.println(div);
		
		// 4. ���
		System.out.println(Math.round(div*1000000000)/1000000000.0);
		
	}
}
