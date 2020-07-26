package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// N Max, Min 

public class Q_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
 
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		br.close();
		
		int[] arr = new int[N];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr); // min -> max
//		sb.append(arr[0] + " ");
//		sb.append(arr[N-1]);
		System.out.println(arr[0] + " " + arr[N-1]);
	}

}
