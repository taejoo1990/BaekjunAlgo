package Algo2;

import java.util.Scanner;

//������ �ð����� 45�� �ռ��� �˶��� �����Ǵ� �ð� --2021.11.30 Ted
public class Part5_Alert {
	public static void main(String[] args) {
		//��ü����
		int h,m;
		Scanner scan = new Scanner(System.in);
		
		//�Է�
		h=scan.nextInt();
		m=scan.nextInt();
		
		//�Է½ð� ������ �ý�������
		if(h>24 || h<0 || m>60 || m<0) {
			System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�. �ٽ� �Է��Ͽ� �ּ���.");
			System.exit(0);
		}
		
		//ó�� �� ���
		AlertClock  ac = new AlertClock(h, m);
		h=ac.setHour();
		m=ac.setMin();
		
		System.out.printf("%d %d",h,m);
		
	}

}
class AlertClock{
	private int h,m;
	
	public AlertClock() {}
	public AlertClock(int h,int m) {
		this.h=h;
		this.m=m;
	}
	//�ð��� �����ϴ� �޼���
	public int setHour() {
		if(m<45) {
			if(h==0) {
				return h=23;
			}
			return h-1;
			
		}
		else return h;
	}
	//���� �����ϴ� �޼���
	public int setMin() {
		if(m<45) {
			return (m-45)+60;
		}else {
			return m-45;
		}
	}
}