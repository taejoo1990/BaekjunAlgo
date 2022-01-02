package Algo2;

import java.util.Scanner;

//설정된 시간보다 45분 앞서서 알람이 설정되는 시계 --2021.11.30 Ted
public class Part5_Alert {
	public static void main(String[] args) {
		//객체생성
		int h,m;
		Scanner scan = new Scanner(System.in);
		
		//입력
		h=scan.nextInt();
		m=scan.nextInt();
		
		//입력시간 오류시 시스템종료
		if(h>24 || h<0 || m>60 || m<0) {
			System.out.println("잘못된 숫자를 입력하였습니다. 다시 입력하여 주세요.");
			System.exit(0);
		}
		
		//처리 및 출력
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
	//시간을 설정하는 메서드
	public int setHour() {
		if(m<45) {
			if(h==0) {
				return h=23;
			}
			return h-1;
			
		}
		else return h;
	}
	//분을 설정하는 메서드
	public int setMin() {
		if(m<45) {
			return (m-45)+60;
		}else {
			return m-45;
		}
	}
}