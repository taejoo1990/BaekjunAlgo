package Algo3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//���� N�� X�� �Է� ���� ��, N���� ���� �Է¹޾� ���� N�� �����. N�� �������� �� X���� ���� ���� ����Ѵ�. 2022.01.02 Ted
public class Part10_XsmallerNum {
	public static void main(String[] args) throws IOException {
		
		// 1. �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			//N�� X�� �Է¹޾� arr[0]�� arr[1]�� ��´�.
		String[] arr = new String[2];
		arr = br.readLine().split(" ");
			//N���� �������� �� ������ �����Ѵ�.
		String[] vars = new String[Integer.parseInt(arr[0])];
		vars = br.readLine().split(" ");
		
		for(String tmp : vars) {
			if(Integer.parseInt(tmp)<Integer.parseInt(arr[1])) {
				System.out.print(tmp+" ");
			}
		}
		
		
	}

}
