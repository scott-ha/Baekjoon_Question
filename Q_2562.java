package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 9개의 서로 다른 수
// Max, Max index ?
public class Q_2562 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int max = 0;
		int idx = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max<arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		
		br.close();
		
		System.out.println(max);
		System.out.println(idx+1);
		

	}

}
