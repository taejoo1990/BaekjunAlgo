package Algo1;

//import
import java.util.Scanner;

//�� ��(A,B)�� �Ű������� ���� return�ϴ� �޼���
public class Part6_minus {
		    
	
			    public static int minus(int a, int b){
			        int sum = a-b;
			        return sum;
			    }
			    
			    public static void main(String [] args){
			        //Scanner�� ��ü�� �����Ѵ�.
			        Scanner scan = new Scanner(System.in);
			        
			        //�� ���� �Է� �޴´�.
			        System.out.println("A+B");
			        System.out.println("A�� �Է��Ͽ� �ּ���.");
			        int a = scan.nextInt();
			        System.out.println("B�� �Է��Ͽ� �ּ���");
			        int b = scan.nextInt();
			        
			        //�޼��带 ȣ���Ͽ� �� ���� ���� ���Ѵ�.
			        int sum = minus(a,b);
			        //�� ���� ���� ����Ѵ�.
			        System.out.println(a+"-"+b+"= "+sum);
			    }
		    
		}
