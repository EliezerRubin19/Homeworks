import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Random rnd=new Random();
		Passenger Tzuckerberg=new Passenger();
		Tzuckerberg.setTicketPrice(rnd.nextInt(900)+100);
		System.out.println("Ticket Price : "+Tzuckerberg.getTicketPrice());
		Tzuckerberg.setAllowedSuitcaseWeight(rnd.nextInt(90)+10);
		System.out.println("\nAllowed suitcase weight: "+Tzuckerberg.getAllowedSuitcaseWeight());
		Tzuckerberg.setPriceOfOneKilogramOverweight(rnd.nextInt(190)+10);
		System.out.println("\nThe price for each kilogram overweight is "+Tzuckerberg.getPriceOfOneKilogramOverweight());
		int numOfItemsInSuitcase=(rnd.nextInt(6)+5);
		String[] itemsList= {"Tfilin","Talit","Sidur","Books","Shoes","Socks",
				"Shirt","Pants","Underwears","Sweater","Belt","Coat","After Shave","Deodorant"
				,"Shampoo","Conditioner","Thootbrush","Toothpaste","Cigaretes","Scarf"};
		for (int i = 0; i < numOfItemsInSuitcase ; i++) {
		Item item1=new Item(itemsList[rnd.nextInt(20)], rnd.nextInt(15)+1);
		Tzuckerberg.getSwissSuitcase().addItem(item1);
		}
		System.out.println("\nThe suitcase content is : ");
		System.out.println("--------------------------");
		int x=0;
		for (Item i:Tzuckerberg.getSwissSuitcase().itemsInSuitcase){
			System.out.println("["+(x+1)+"]"+i.getName()+"  "+i.getWeight());
			x++;
		}
		System.out.println("\nTotal suitcase weight is: "+Tzuckerberg.getSwissSuitcase().getTotalWeight());
		double ow=(Tzuckerberg.getSwissSuitcase().getTotalWeight()-Tzuckerberg.getAllowedSuitcaseWeight());
		
		if (ow<=0) {
			System.out.println("No overweight - Enjoy your flight");
		}else {
			System.out.println("You have an overweight of "+ow+"\nIt will cost you "+ow*Tzuckerberg.getPriceOfOneKilogramOverweight());

		
		System.out.println("Do you want to pay? if not you can remove an item[y/n]");
		Scanner scan=new Scanner(System.in);
		String answer=scan.nextLine();
		if (answer.equals("y")){
			System.out.println("You paid "+ow*Tzuckerberg.getPriceOfOneKilogramOverweight()+" Dollars - Enjoy the flight");
		}else{
			while(ow>0){
			x=0;
			for (Item i:Tzuckerberg.getSwissSuitcase().itemsInSuitcase){
				System.out.println("["+(x+1)+"]"+i.getName()+"  "+i.getWeight());
				x++;
			}
			System.out.println("Your overweight is "+ow+" which item do you want to remove?");
			int itemNumber=scan.nextInt();
			Tzuckerberg.getSwissSuitcase().itemsInSuitcase.remove(itemNumber-1);
			Tzuckerberg.getSwissSuitcase().calcTotalWeight();
			ow=(Tzuckerberg.getSwissSuitcase().getTotalWeight()-Tzuckerberg.getAllowedSuitcaseWeight());

			}
			System.out.println("You don't have overweight - enjoy your flight");
			}
		}
	}

}

