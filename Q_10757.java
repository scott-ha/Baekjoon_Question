package Question;

import java.util.*;
import java.math.BigInteger;

public class Q_10757 {

	public static void solution(BigInteger a, BigInteger b) {
		System.out.println(a.add(b).toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split(" ");
		
//		System.out.println(str[0]);
//		System.out.println(str[1]);
		BigInteger a = new BigInteger(str[0]);
		BigInteger b = new BigInteger(str[1]);
		
		solution(a,b);

	}

}
