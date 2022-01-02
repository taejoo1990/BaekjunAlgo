package Algo2;
import java.util.*;
//좌표 x,y를 입력받아 출력하는 프로그램 --2021.11.30 Ted
public class Part4_Quadrant {
	public static void main(String[] args) {
		
		//객체생성
		int x,y;
		Scanner scan = new Scanner(System.in);
		//입력
		x=scan.nextInt();
		y=scan.nextInt();
		
		//처리 및 출력
		Return ret = new Return(x,y);
		ret.res();
	}
	
}
class Return{
	private int x,y;
	
	public Return() {}
	public Return(int x,int y) {
		this.x=x;
		this.y=y;
	}
	//x,y값을 통해 사분면을 출력하는 메서드
	public void res() {
		if(x>=0&&y>=0) {
			System.out.println(1);
		}else if(x<0&&y>=0) {
			System.out.println(2);
		}else if(x<0&&y<0) {
			System.out.println(3);
		}
		else if(x>=0&&y<0) {
			System.out.println(4);
		}
	}
	
}
