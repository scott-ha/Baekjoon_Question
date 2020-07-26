package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// S = Ham + Beverage
// Hamburger S J H
// Beverage Cola Cyder
// 가장 싼 세트 ??

public class Q_5543 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int burger_price = 2001;
		int beverage_price = 2001;
		
		for(int i=0;i<3;i++) {
			int tmp = Integer.parseInt(br.readLine());
			
			if(tmp<burger_price) {
				burger_price = tmp;
			}
		}
		
		for(int i=0;i<2;i++) {
			int tmp = Integer.parseInt(br.readLine());
			
			if(tmp<beverage_price) {
				beverage_price = tmp;
			}
		}
		
		br.close();
		bw.write(String.valueOf(burger_price+beverage_price - 50));
		bw.flush();
		bw.close();
		
		

	}

}
