package Algo3;

import java.io.*;
//테스트케이스(횟수)와 두 정수 A,B를 입력받아 A+B를 출력하는 프로그램에서 버퍼클래스 사용 -- 2021.12.17 Ted
public class Part4_SumWhileCase_BufferClass {

		public static void main(String[] args) throws IOException {
			//1. 객체생성
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			//2. 처리
			int t = Integer.parseInt(br.readLine());
			String [] arr = new String[2];

			//4. 출력
			for(int i=0; i<t; i++) {
				arr = br.readLine().split(" ");
				int var1 = Integer.parseInt(arr[0]);
				int var2 = Integer.parseInt(arr[1]);
				bw.write(var1 + var2 +"\n");
				}
			bw.flush();
			bw.close();
		}
		
	}


