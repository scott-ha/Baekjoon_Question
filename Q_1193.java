package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_1193 {
	
	public static String solution(int x) {
		StringBuilder sb = new StringBuilder();
		// 항의 갯수 등차 : 1 2 3 4 5
		int count=1; 
		int prev_sum=0; 
		int upper_value = 0;
		int lower_value = 0;
		while(true) {
			if(x <= count+prev_sum) {
				if(count%2==0) { // 짝수
					upper_value = x - prev_sum;
					lower_value = count -(x - prev_sum -1);
					sb.append(upper_value).append('/').append(lower_value);
					break;
				} else { // 홀수
					upper_value = count -(x - prev_sum -1);
					lower_value = x - prev_sum;
					sb.append(upper_value).append('/').append(lower_value);
					break;
				}
			} else {
				prev_sum += count;
				count++;
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		System.out.println(solution(X));

	}

}
