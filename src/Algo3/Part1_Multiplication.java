package Algo3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//1~9까지의 수를 입력받아 구구단을 반환하는 메서드
public class Part1_Multiplication {

	public static void main(String[] args) throws IOException{
		
		//입력부
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int dan = Integer.parseInt(br.readLine());
		Dan d = new Dan(dan);
		
		//처리 
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
