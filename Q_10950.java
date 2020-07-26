package Question;

import java.util.*;

public class Q_10950 {
	
	public static int solution(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		int a,b;
		int T;
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(solution(a,b));
		}
	}

}
