package BronzeV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AdivideB1008 {
	
	public static void main(String[] args) throws IOException {
	/*	Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		scanner.close(); 
		
		System.out.println(a / b);       //Scanner 사용한 방법
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);
		
		System.out.println(a/b);  //split 이용한 방법 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		System.out.println(a/b);  //StringTokenizer를 이용한 방법
	}

}