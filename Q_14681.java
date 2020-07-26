package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q_14681 {

	public static int solution(int x, int y) {
		
		// 1,4
		if(x>0) {
			if(y>0) {
				return 1;
			} else {
				return 4;
			}
		}
		// 2,3
		else {
			if(y>0) {
				return 2;
			} else {
				return 3;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		System.out.println(solution(x, y));

	}

}
