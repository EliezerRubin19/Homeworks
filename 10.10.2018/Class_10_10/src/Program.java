import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		SeatInCinema[][] cinema=new SeatInCinema[4][3];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				
				cinema[i][j]=new SeatInCinema();
				
			}
			
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter number of tickets----> ");
		int numOfTickets=scan.nextInt();
		
		for (int i = 0; i < numOfTickets; i++) {
			System.out.println("Seat number "+(i+1));
			boolean seated=false;
			while (seated==false){
			System.out.print("Enter line number--->[0-3]");
			int line=scan.nextInt();
			System.out.print("Enter row number--->[0-2]");
			int row=scan.nextInt();
			 if (cinema[line][row].isSeatOccupied()==false){
				 seated=true;
				 cinema[line][row].setOccupied(true);
			 }else
				 System.out.println("This seat is occupied, try again");
			}
			
		}
		
		System.out.println("Enjoy the movie!!");
		scan.close();
		}

	}


