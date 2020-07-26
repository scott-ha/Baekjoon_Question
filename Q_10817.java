package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

// a b c
// 2nd ??

public class Q_10817 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[3];
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		Arrays.sort(arr);
		bw.write(String.valueOf(arr[1]));
		bw.flush();
		bw.close();
		
		

	}

}
