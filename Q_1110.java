package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Q_1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int initial_num = Integer.parseInt(br.readLine());
		br.close();
		int new_num = initial_num;
		int num1, num2;
		int count = 0;
		
		// 26 68 4
		while(true) {
				num1 = new_num/10; // 2 6 0
				num2 = new_num%10; // 6 8 4
				new_num = (num2*10) + ((num1+num2)%10); // 68 8 44
				count++;
				
				if(initial_num == new_num) break;
			
		}

		bw.write(count +"\n");
		bw.flush();
		bw.close();
		
	}
}
