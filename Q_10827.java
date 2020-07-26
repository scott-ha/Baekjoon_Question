package Question;

import java.util.*;
import java.math.BigDecimal;

public class Q_10827 {

	public static void solution(BigDecimal a, int b) {
		BigDecimal result;
		
		result = a.pow(b);
		System.out.println(result.toPlainString());
	}
	
	public static void main(String[] args) {
		BigDecimal a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextBigDecimal();
		b = sc.nextInt();
		
		solution(a, b);
		

	}

}
