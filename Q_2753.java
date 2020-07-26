package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q_2753 {
	
	public static int solution(int year) {
		
		if(((year%4)==0) && (((year%100)!=0) || ((year%400)==0))) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		
		System.out.println(solution(year));

	}

}

//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
