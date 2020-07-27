package Question;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_11720 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		br.close();
		
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			sum += str.charAt(i)-'0';
		}
		System.out.println(sum);

	}

}
