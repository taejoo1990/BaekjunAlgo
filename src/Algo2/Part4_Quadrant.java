package Algo2;
import java.util.*;
//��ǥ x,y�� �Է¹޾� ����ϴ� ���α׷� --2021.11.30 Ted
public class Part4_Quadrant {
	public static void main(String[] args) {
		
		//��ü����
		int x,y;
		Scanner scan = new Scanner(System.in);
		//�Է�
		x=scan.nextInt();
		y=scan.nextInt();
		
		//ó�� �� ���
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
	//x,y���� ���� ��и��� ����ϴ� �޼���
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
