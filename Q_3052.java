package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// A,B

public class Q_3052 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[42];
		int count = 0;
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<arr1.length;i++) {
			arr2[arr1[i]%42]++;
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i] !=0 ) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
