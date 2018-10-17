
public class Exercise1 {

	 
	
	  public static void main(String args[]) {

	    String s = "abcdefghijklmnopqrstuvwxy";
	    int start = 0;
	    int end = 5;
	    while (end<=s.length()){
	    char[] buf = new char[end - start];

	    s.getChars(start, end, buf, 0);
	    System.out.println(buf);
	    start+=5;
	    end+=5;
	  }
	}
}

