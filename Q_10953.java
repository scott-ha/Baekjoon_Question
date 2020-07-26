package Question;

import java.util.*;

public class Q_10953 {

	public static void solution(int a,int b) {
		System.out.println((a+b));
	}
	
	public static void main(String[] args) {
		int a,b,T;
		Scanner sc = new Scanner(System.in);
		// nextInt
		// next
		// nextLine
		// , 구분자
		T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			String[] str = sc.next().split(",");
			a = Integer.parseInt(str[0]);
			b = Integer.parseInt(str[1]);
			solution(a,b);
		}
		

	}

}
