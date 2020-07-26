package Question;

import java.util.*;

public class Q_11022 {

	public static void solution(int i, int a, int b) {
		System.out.println("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b));
	}
	
	public static void main(String[] args) {
		int a,b,T;
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		for(int i=0;i<T;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			solution(i, a, b);
		}
		
		

	}

}
