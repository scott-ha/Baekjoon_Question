package Question;

import java.util.*;

public class Q_1002 {

	public static void main(String[] args) {
		// solution 교점의 갯수?
//		3
//		0 0 13 40 0 37
//		0 0 3 0 7 4
//		1 1 1 1 1 5
		int x1,y1,x2,y2,r1,r2;
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		for(int i=0;i<testCase;i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();

			System.out.println(point(x1, y1, r1, x2, y2, r2));
		}
		
		
	}
	
	public static int point(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		double dist = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
		// case 0: 같은 원일 경우 -1
		if(x1==x2 && y1==y2 && r1==r2) {
			return -1;
		} 
		// case 1: 접점 1 (외접/내접)
		else if(dist == r1+r2 || dist==Math.abs(r2-r1)) {
			return 1;
		}
		// case 2: 접점 0
		else if((x1==x2 && y1==y2 && r1!=r2) || (dist>r1+r2) || (dist < Math.abs(r2-r1))) {
			return 0;
		}
		// case 3: 접점2
		else {
			return 2;
		}
	}

}
