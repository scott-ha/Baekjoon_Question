package Question;

import java.util.*;

public class Q_1008 {
	
	public static double solution(double a, double b) {
		return a/b;
	}

	public static void main(String[] args) {
		double a,b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		System.out.println(solution(a,b));

	}

}
