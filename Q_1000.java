package Question;
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
import java.util.Scanner;

public class Q_1000 {

	public static void main(String[] args) {
		int a,b;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		// input
		a = sc.nextInt();
		b = sc.nextInt();
		
		result = a+b;
		System.out.println(result);
		
		
	}

}


