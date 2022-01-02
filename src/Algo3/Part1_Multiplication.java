package Algo3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//1~9������ ���� �Է¹޾� �������� ��ȯ�ϴ� �޼���
public class Part1_Multiplication {

	public static void main(String[] args) throws IOException{
		
		//�Էº�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int dan = Integer.parseInt(br.readLine());
		Dan d = new Dan(dan);
		
		//ó�� 
		int [] value = new int[10];
		value = d.Multiplication();
		String[] str = new String[10];
		
		for (int i=1; i<=value.length-1; i++) {
			str[i] = Integer.toString(value[i]);
			bw.write(dan+ "x" + i + "=" + str[i]+"\n");
		}
		bw.close();
		
		
	}
}

class Dan{
	private int dan;
	
	public Dan(int dan) {
		this.dan = dan;
	}
	
	public int[] Multiplication() {
		int [] value = new int[10];
		for(int i = 1 ;i<=value.length-1 ; i++) {
			value[i] = dan*i;
		}
		return value;
	}
	
	
}
