package prob1;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;


public class Prob1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "문자열을 입력하세요: " );
		
		String s = scanner.nextLine();
		
		/*  구현합니다. */
		char[] array=s.toCharArray();
		int length=array.length;
		for(int i=0; i<length; i++){
			
			for(int j=0; j<i+1; j++){
				
				System.out.print(array[j]);

			}
			System.out.println();
			
			
		}
	
		

		
		
		
		scanner.close();
	}
}
