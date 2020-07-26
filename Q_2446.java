package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// *********
//  *******
//   *****
//    ***
//     *
//    ***
//   *****
//  *******
// *********

public class Q_2446 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int CenterLine = 2*N-1;
		int spaceCount = 0;
		int starCount = 2*N-1;
		
		for(int i=0;i<CenterLine;i++) {
			for(int j=0;j<spaceCount;j++) {
				sb.append(" ");
			}
			for(int j=0;j<starCount;j++) {
				sb.append("*");
			}
			sb.append("\n");
			
			if(i<N-1) {
				spaceCount++;
				starCount -= 2;
			} else {
				spaceCount--;
				starCount += 2;
			}
		}
		
		System.out.println(sb);
			
	}

}
