package Question;

import java.util.*;

public class Q_10952 {
	
	public static int solution(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
				
			if(a == 0 && b ==0) break;
			System.out.println(solution(a,b));
		}
		
	}

}
