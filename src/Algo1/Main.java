package Algo1;

import java.util.Scanner;

//�׽�Ʈ�� Ŭ����
public class Main {
    public static void main(String [] args){
        //��ü����
        int a,b,tmp;
        Scanner scan = new Scanner(System.in);
        
        //�Է�
        a=scan.nextInt();
        b=scan.nextInt();
        tmp=b;
        //ó���� ���
         //b�� �ڸ����� ���Ѵ�
        int length = (int)(Math.log10(b)+1);
        
        for(int i =0 ; i<length ; i++ ){
            //������ ���� b�� 1�� �ڸ����� ���������� ����.
            int tmp2 = tmp%10;
            //b�� ������ �ڸ����� a�� ���Ͽ� ���
            int res = tmp2*a;
            System.out.println(res);
            //tmp�� �������ڸ����� �߶󳽴�.
            tmp = (int)(tmp*0.1);
        }
        //a*b�� ����Ѵ�
        System.out.println(a*b);
        
        
        
    }
    
}
