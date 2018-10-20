
public class Program {

	public static void main(String[] args) {
		Person[] personsAtAirport= new Person[4];
		
		personsAtAirport[0]=new Pilot("Bob", "Cave", "AN76439", 8);
		personsAtAirport[1]=new Passenger("Jimmy", "Ohana", 9532561);
		personsAtAirport[2]=new FlightAttendent("Virginia","Jagger", 5, "USA", "Business");
		personsAtAirport[3]=new GroundAttendent("Nick", "Wolf", 4, "Australia", "Ticketing");
		
		
		for (int i = 0; i < personsAtAirport.length; i++) {
			if (personsAtAirport[i]  instanceof Pilot) {System.out.println("--------Pilot--------------");
			}else {
				if (personsAtAirport[i]  instanceof FlightAttendent) {System.out.println("--------Flight  Attendent-------");
				}else {
					if (personsAtAirport[i]  instanceof GroundAttendent){System.out.println("--------Ground  Attendent-------");
					}else {System.out.println("--------Passenger-------");
					}
				}
			}
			personsAtAirport[i].print();
			System.out.println();
			System.out.println();
		}
		
	}
}
