public class main{
	
	String CurrentState = "Ready" // This is the State that commands are entered in.
	System.out.println("State is: " +CurrentState+ "\n"); // using for debugging 
	
	System.out.println("Command list: Pickup, Drop, Inventory, Journal, Quit"); // Command list
	Scanner scanner = new Scanner(System.in);//used to get user input.
	String EnterdCommand = scanner.nextLine();
	while(x == true){// runs game
		if (EnterdCommand = "quit"){//Quits game.
			System.out.println("end of game");
			x = false;
		}
		else if (EnterdCommand = "Pickup"){
			if(CurrentState = "Ready"){
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
		else if (EnterdCommand = "Drop"){
			if(CurrentState = "Ready"){
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
		else if (EnterdCommand = "Inventory"){
			if (CurrentState = "Ready"){
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
		else if (EnterdCommand = "Journal"){
			if (CurrentState = "Ready"){
				CurrentState = "Journal";
				//Run show Players Journal
				System.out.println("Game text goes here");
				System.out.println("Command list for Journal:  ");// This is a list of commands for while in the Journal.
			}
			else{
				System.out.println("enter valid command from list");
				/*System.out.println("Command list: Pickup, Drop, Inventory, Journal, Quit"); Will need to change for the inputs for the CurrentState menu */
			}
			System.out.println("State is: " +CurrentState+ "\n");	// debugging
		else{
			System.out.println("enter valid command from list");
			System.out.println("Command list: Pickup, Drop, Inventory, Journal, Quit");
		}