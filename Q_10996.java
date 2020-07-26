package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//1
//*
//2
//* 
// *
//* 
// *
//3
//* *
// *
//* *
// *
//* *
// *
public class Q_10996 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<N;i++) {
			if(i%2 != 0) {
				sb.append(" ");
			} else {
				sb.append("*");
			}
		}
		sb.append("\n");
		
		for(int i=0;i<N;i++) {
			if(i%2 != 0) {
				sb.append("*");
			} else {
				sb.append(" ");
			}
		}
		sb.append("\n");
		
		String str = sb.toString();
		
		for(int i=1;i<N;i++) {
			sb.append(str);
		}
		
		System.out.println(sb);
	}

}
