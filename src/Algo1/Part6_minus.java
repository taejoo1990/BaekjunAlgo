package Algo1;

//import
import java.util.Scanner;

//두 수(A,B)를 매개변수로 차를 return하는 메서드
public class Part6_minus {
		    
	
			    public static int minus(int a, int b){
			        int sum = a-b;
			        return sum;
			    }
			    
			    public static void main(String [] args){
			        //Scanner의 객체를 생성한다.
			        Scanner scan = new Scanner(System.in);
			        
			        //두 수를 입력 받는다.
			        System.out.println("A+B");
			        System.out.println("A를 입력하여 주세요.");
			        int a = scan.nextInt();
			        System.out.println("B를 입력하여 주세요");
			        int b = scan.nextInt();
			        
			        //메서드를 호출하여 두 수의 합을 구한다.
			        int sum = minus(a,b);
			        //두 수의 합을 출력한다.
			        System.out.println(a+"-"+b+"= "+sum);
			    }
		    
		}
