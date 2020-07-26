package Question;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_9498 {
	
	public static String solution(int a) {
		
		if(a>=90 && a<=100) {
			return "A";
		} else if(a>=80) {
			return "B";
		} else if(a>=70) {
			return "C";
		} else if(a>=60) {
			return "D";
		}
		else {
			return "F";
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score = Integer.parseInt(br.readLine());
		
		System.out.println(solution(score));

	}

}
