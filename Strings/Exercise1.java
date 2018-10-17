import java.util.Scanner;

public class Exercise1 {

	 
	
	  public static void main(String args[]) {
		  Scanner scan = new Scanner(System.in);
	    String s = "abcdefghijklmnopqrstuvwxy";
	    System.out.println("Please enter number of pieces"
	    		+ " (must be a divider of" +s.length()+")");
	    int n=scan.nextInt();
	    while (s.length()%n>0){
	    	System.out.println("Wrong!!!!  Please enter number of pieces"
		    		+ " (must be a divider of "
		    		+ "" +s.length()+")");
	    	n=scan.nextInt();
	    }
	    int start = 0;
	    int end = s.length()/n;
	    while (end<=s.length()){
	    char[] buf = new char[end - start];

	    s.getChars(start, end, buf, 0);
	    System.out.println(buf);
	    start+=s.length()/n;
	    end+=s.length()/n;
	  }
	    scan.close();
	}
}

