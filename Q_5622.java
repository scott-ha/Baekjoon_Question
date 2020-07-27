package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_5622 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		br.close();
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
//			System.out.println(str.charAt(i));
			char alpha = str.charAt(i);
			switch(alpha) {
				case 'A': case 'B': case 'C':
					count+=3; break;
				case 'D': case 'E': case 'F':
					count+=4; break;
				case 'G': case 'H': case 'I':
					count+=5; break;
				case 'J': case 'K': case 'L':
					count+=6; break;
				case 'M': case 'N': case 'O':
					count+=7; break;
				case 'P': case 'Q': case 'R': case 'S':
					count+=8; break;
				case 'T': case 'U': case 'V':
					count+=9; break;
				case 'W': case 'X': case 'Y': case 'Z':
					count+=10; break;
			}	
		}
		System.out.println(count);

	}

}
