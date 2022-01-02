package Algo3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//정수 N과 X를 입력 받은 후, N개의 수룰 입력받아 수열 N을 만든다. N의 구성원들 중 X보다 작은 수를 출력한다. 2022.01.02 Ted
public class Part10_XsmallerNum {
	public static void main(String[] args) throws IOException {
		
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			//N과 X를 입력받아 arr[0]과 arr[1]에 담는다.
		String[] arr = new String[2];
		arr = br.readLine().split(" ");
			//N개의 구성원이 들어간 수열을 생성한다.
		String[] vars = new String[Integer.parseInt(arr[0])];
		vars = br.readLine().split(" ");
		
		for(String tmp : vars) {
			if(Integer.parseInt(tmp)<Integer.parseInt(arr[1])) {
				System.out.print(tmp+" ");
			}
		}
		
		
	}

}
