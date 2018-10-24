
import java.util.Scanner;

public class Exercise2 {

	
	public static void main(String args[]) {
		 
		Scanner scan=new Scanner(System.in);		
		String s1 = scan.nextLine();
		String s2 = scan.nextLine() ;
		
		char[] char1 =  s1.toCharArray();
		char[] char2 =  s2.toCharArray();
		
		String s="";
		int k=0;
		for (int i = 0; i < char1.length; i++) {
			for (int j = 0; j < char2.length; j++) {
				if (char1[i]==char2[j])k=0;else k++;
			}
				if (k==char2.length) s+=char1[i];
				k=0;
			}
		System.out.println(s);
		
		scan.close();
		}
		
		}
			
	

