package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 3,5
public class Q_2839 {

	public static int solution(int weight) {
		int result = 0;
		int bucket_five = 0;
		int bucket_three = 0;
		
		// weight 중심으로 생각
		while(true) {
			if(weight%5==0 && weight%3==0) {
				weight -= 5;
				bucket_five++;
			} else if(weight%5==0) {
				weight -= 5;
				bucket_five++;
			} else if(weight%3==0) {
				weight -= 3;
				bucket_three++;
			} else {
				weight -=5;
				bucket_five++;
			}
			if(weight<0) {
				result = -1;
				break;
			} else if(weight==0) {
				result = bucket_five + bucket_three;
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int weight = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(solution(weight));

	}

}
