package Question;

import java.util.*;

public class Q_11021 {

	public static void solution(int i, int a, int b) {
		int result;
		result = a+b;
		System.out.println("Case #" + (i+1) + ": " + result);
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
