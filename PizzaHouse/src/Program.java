
public class Program {

	public static void main(String[] args) {
		
		Pizza[] pizzas=new Pizza[5];
		
		pizzas[0]=new Pizza(20, 4, 0);
		pizzas[1]=new Pizza(30, 4, 1);
		pizzas[2]=new Pizza(40, 6, 2);
		pizzas[3]=new Pizza(50, 8, 3);
		pizzas[4]=new Pizza(15, 2, 0);
		
		for (int i = 0; i < pizzas.length; i++) {
			System.out.println("Pizza"+(i+1)+" is "
		+(pizzas[i].isBasicPizza()?"":"not ")+"basic");

		}
		
		 for (int i = 0; i < pizzas.length; i++) {
			System.out.print("Pizza"+(i+1)+" : ");
		    pizzas[i].print();
		 }
		 
		System.out.println("Total number of toppings: "+Pizza.count_toppings);
	}

}