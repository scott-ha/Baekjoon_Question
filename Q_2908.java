package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 상수 바보
// 세 자리수 2개 비교 
public class Q_2908 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		num1 = (num1%10)*100 + ((num1/10)%10)*10 + num1/100;
		num2 = (num2%10)*100 + ((num2/10)%10)*10 + num2/100;
		
		int result = (num1>num2) ? num1 : num2;
		
		System.out.println(result);

	}

}
