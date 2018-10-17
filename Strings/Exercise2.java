
public class Exercise2 {

	
	public static void main(String args[]) {
		
		String s1 = "the quick brown fox";
		String s2 = "queen";
		
		char[] char1 =  s1.toCharArray();
		char[] char2 =  s2.toCharArray();
		
		
		for (int i = 0; i < char2.length; i++) {
			for (int j = 0; j < char1.length; j++) {
				if (char1[j]==char2[i]) char1[j]=8;
			}
		}
		for (int i = 0; i < char1.length; i++) {
			if (char1[i]!=8)
			System.out.print(char1[i]);
		}
			
	}
}
