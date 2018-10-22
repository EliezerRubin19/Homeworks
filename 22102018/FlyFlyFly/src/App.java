
public class App {
	public static IFly createFly() {
		int rnd=(int)(Math.random()*3);
		if (rnd==0) { 
			IFly fly=new Bird();
			return fly;
		}else if (rnd==1) {
			IFly fly=new Airplane();
			return fly;
		}else {
			IFly fly=new Kite();
			return fly;
				}
		}

	
	public static void main(String[] args) {
	
		IFly[] flyflyfly=new IFly[10];
		
		for (IFly f:flyflyfly) {
			System.out.println();
			f=createFly();
			String des;
			int vel;
			boolean land;
			
			if (f instanceof Airplane) { 
				if ((int)(Math.random()*2)==1) {des="Paris";}
				else {des="Rome";}
				((Airplane) f).setDestination(des);
				if ((int)(Math.random()*2)==1) {vel=900;}
				else {vel=700;}
				if ((int)(Math.random()*2)==1) {land=true;}
				else {land=false;}
				((Airplane) f).setLanded(land);
				
				f.fly(vel);
				f.land();
				
			}else if (f instanceof Bird) {
				if ((int)(Math.random()*2)==1) {vel=50;}
				else {vel=20;}
				if ((int)(Math.random()*2)==1) {land=true;}
				else {land=false;}
				((Bird) f).setLanded(land);
				
				f.fly(vel);
				f.land();
				
			}else if (f instanceof Kite) {
				if ((int)(Math.random()*2)==1) {vel=5;}
				else {vel=2;}
				if ((int)(Math.random()*2)==1) {land=true;}
				else {land=false;}
				((Kite) f).setLanded(land);
				f.fly(vel);
				f.land();
			}
			
		}
		
	
		
		
		
	}
}
