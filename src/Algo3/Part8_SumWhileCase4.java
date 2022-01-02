package Algo3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//테스트케이스와 두 정수 A,B를 입력받아 두 수의 합을 정해진 형식에 맞추어 출력한다. 2022.01.02 Ted
public class Part8_SumWhileCase4 {

	public static void main(String[] args) throws IOException {

		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		String arr[] = new String[2];
		
		//2. 처리 및 출력
		for(int i=0 ; i<testCase ; i++) {
			arr=br.readLine().split(" ");
			int var1= Integer.parseInt(arr[0]);
			int var2= Integer.parseInt(arr[1]);
			bw.write("Case #"+(i)+ ": " +var1+" + "+var2+" = "+ (var1+var2) +"\n");
		}
		bw.flush();
		bw.close();

	}
}
