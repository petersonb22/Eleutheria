import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String CurrentState = "Ready"; // This is the State that commands are entered in.
		System.out.println("State is: " +CurrentState+ "\n"); // using for debugging 
		
		System.out.println("Command list: Pickup, Drop, Inventory, Journal, Quit"); // Command list
		Scanner scanner = new Scanner(System.in);//used to get user input.
		String EnterdCommand;
		boolean runGame = true;
		while(runGame){// runs game
			EnterdCommand = scanner.nextLine();
			if (EnterdCommand.compareTo("quit")==0){//Quits game.
				System.out.println("end of game");
				runGame = false;
			}
			else if (EnterdCommand.compareTo("Pickup")==0){
				if(CurrentState.compareTo("Ready")==0){
					CurrentState = "Pickup";
					// Run list of objects in room to be picked up then reset to ready State
					System.out.println("Game text goes here");
					System.out.println("Command list for Pickup:  ");// This is a list of commands for while in the pickup menu
				}
				else{// Used for if they type a command in the wrong mode
					System.out.println("enter valid command from list");
					/*System.out.println("Command list: Pickup, Drop, Inventory, Journal, Quit"); Will need to change for the inputs for the CurrentState menu */
				}
				System.out.println("State is: " +CurrentState+ "\n");// debugging.
			}
			else if (EnterdCommand.compareTo("Drop")==0){
				if(CurrentState.compareTo("Ready")==0){
					CurrentState = "Drop";
					// Run list of objects based on the players inventory.
					System.out.println("Game text goes here");
					System.out.println("Command list for Drop:  ");// This is a list of commands for while in the drop menu
				}
				else{
					System.out.println("enter valid command from list");
					/*System.out.println("Command list: Pickup, Drop, Inventory, Journal, Quit"); Will need to change for the inputs for the CurrentState menu */
				}
				System.out.println("State is: " +CurrentState+ "\n");	// debugging		
			}
			else if (EnterdCommand.compareTo("Inventory")==0){
				if (CurrentState.compareTo("Ready")==0){
					CurrentState = "Inventory";
					// Run show players Inventory
					System.out.println("Game text goes here");
					System.out.println("Command list for Inventory:  ");// This is a list of commands for while in the inventory.
				}
				else{
					System.out.println("enter valid command from list");
					/*System.out.println("Command list: Pickup, Drop, Inventory, Journal, Quit"); Will need to change for the inputs for the CurrentState menu */
				}
				System.out.println("State is: " +CurrentState+ "\n");	// debugging
			}
			else if (EnterdCommand.compareTo("Journal")==0){
				if (CurrentState.compareTo("Ready")==0){
					//CurrentState = "Journal";
					//Run show Players Journal
					System.out.println("Game text goes here");
					System.out.println("Command list for Journal:  ");// This is a list of commands for while in the Journal.
				}
				else{
					System.out.println("enter valid command from list");
					/*System.out.println("Command list: Pickup, Drop, Inventory, Journal, Quit"); Will need to change for the inputs for the CurrentState menu */
				}
				System.out.println("State is: " +CurrentState+ "\n");// debugging
				}
				else{
					System.out.println("enter valid command from list");
					System.out.println("Command list: Pickup, Drop, Inventory, Journal, Quit");
				}
			}
		}
	}
