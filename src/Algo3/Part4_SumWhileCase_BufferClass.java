package Algo3;

import java.io.*;
//�׽�Ʈ���̽�(Ƚ��)�� �� ���� A,B�� �Է¹޾� A+B�� ����ϴ� ���α׷����� ����Ŭ���� ��� -- 2021.12.17 Ted
public class Part4_SumWhileCase_BufferClass {

		public static void main(String[] args) throws IOException {
			//1. ��ü����
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			//2. ó��
			int t = Integer.parseInt(br.readLine());
			String [] arr = new String[2];

			//4. ���
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


