import java.util.Date;

public class Clock {

	public static void main(String[] args) {
		Date now=new Date();
		String[] now1=now.toString().split(" ");
		System.out.println(now1[3]);
		String actual=now1[3];
		String newActual=now1[3];
		while (true) {
			Date now2=new Date();
			String[] now3=now2.toString().split(" ");
			newActual=now3[3];
			
		if (!(actual.equals(newActual))) {
		System.out.println(now3[3]);
		actual=now3[3];
			}
		}
	}

}
