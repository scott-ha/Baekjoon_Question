package Question;

// 정수 N개의 합
public class Q_15596 {
	
	long sum(int[] a) {
		long sum = 0;
		
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
}
