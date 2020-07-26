package Question;

import java.util.*;

public class Q_10951 {

	public static void solution(int a, int b) {
		System.out.println((a+b));
	}
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
	
		while(sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			solution(a,b);
		}
		

	}

}
