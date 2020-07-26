package Question;

import java.util.*;

public class Q_10430 {
	
	public static void solution(int a, int b, int c) {
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		solution(a,b,c);

	}

}
