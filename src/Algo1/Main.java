package Algo1;

import java.util.Scanner;

//테스트용 클래스
public class Main {
    public static void main(String [] args){
        //객체생성
        int a,b,tmp;
        Scanner scan = new Scanner(System.in);
        
        //입력
        a=scan.nextInt();
        b=scan.nextInt();
        tmp=b;
        //처리와 출력
         //b의 자릿수를 구한다
        int length = (int)(Math.log10(b)+1);
        
        for(int i =0 ; i<length ; i++ ){
            //연산을 위해 b의 1의 자릿수를 지역변수에 저장.
            int tmp2 = tmp%10;
            //b의 마지막 자릿수와 a를 곱하여 출력
            int res = tmp2*a;
            System.out.println(res);
            //tmp의 마지막자리수를 잘라낸다.
            tmp = (int)(tmp*0.1);
        }
        //a*b를 출력한다
        System.out.println(a*b);
        
        
        
    }
    
}
