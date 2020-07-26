package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


//10 5
//1 10 4 9 2 3 8 5 7 6

public class Q_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str1 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(str1, " ");
		
		int n = Integer.parseInt(st1.nextToken());
		int x = Integer.parseInt(st1.nextToken());
		
		String str2 = br.readLine();
		StringTokenizer st2 = new StringTokenizer(str2, " ");
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		br.close();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<x) {
				bw.write(arr[i] + " ");
			}
		}
		
		bw.flush();
		bw.close();
		

	}

}
