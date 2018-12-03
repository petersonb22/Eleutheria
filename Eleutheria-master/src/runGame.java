import java.util.Scanner;

public class runGame {
	//initialize game variables
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Item PhilosophersStone = new Item ("PS", "a legendary substance allegedly capable of turning inexpensive metals into gold");
		Item StaffofWenge = new Item ("SW", "a staff made of wenge. A tropical timber, very dark in color with a distinctive figure");
		Room metatron = new Room();
		Room nowhere = new Room();
		metatron.name = "Metatron";
		nowhere.name = "Nowhere";
		Player player = new Player(metatron);
		player.add(PhilosophersStone);
		metatron.addRoom(nowhere,"N");
		metatron.addItem(StaffofWenge);
		
		String CurrentState = "Ready"; // This is the State that commands are entered in.
		System.out.println("State is: " +CurrentState+ "\n"); // using for debugging 
		
		System.out.println("Command list: Move, Pickup, Drop, Examine, Inventory, Journal, Quit"); // Command list
		Scanner scanner = new Scanner(System.in);//used to get user input.
		String EnterdCommand;
		boolean runGame = true;
		while(runGame){// runs game
			
			//display descriptive text
			System.out.println("You are in " + player.currentRoom.name);
			System.out.println("You see the following items in the room:");
			player.currentRoom.getItems();
			System.out.println("What would you like to do?");
			EnterdCommand = scanner.nextLine(); //user input
			if (EnterdCommand.compareTo("quit")==0){//Quits game.
				System.out.println("end of game");
				runGame = false;
			}
			else if (EnterdCommand.compareTo("Pickup")==0){
				if(CurrentState.compareTo("Ready")==0){
					CurrentState = "Pickup";
					// Run list of objects in room to be picked up then reset to ready State
					player.currentRoom.getItems();
					System.out.println("Enter the name of the item to add to your Inventory");
					String roomItem = scanner.next();
					Item itemToAdd = player.currentRoom.roomInv.getItem(roomItem);
					while(itemToAdd ==null)
					{
						System.out.println("Enter the name of the item to add to your Inventory");
						roomItem = scanner.next();
						itemToAdd = player.currentRoom.roomInv.getItem(roomItem);
					}
				    player.add(itemToAdd);
				    player.currentRoom.removeItem(itemToAdd);
				    CurrentState = "Ready";
					//list items in room
					//read item number to be picked up from player
					//
				}
				else{// Used for if they type a command in the wrong mode
					System.out.println("enter valid command from list");
					/*System.out.println("Command list: Move,Examine, Pickup, Drop, Inventory, Journal, Quit"); Will need to change for the inputs for the CurrentState menu */
				}
				System.out.println("State is: " +CurrentState+ "\n");// debugging.
			}
			else if (EnterdCommand.compareTo("Drop")==0){
				if(CurrentState.compareTo("Ready")==0){
					CurrentState = "Drop";
					// Run list of objects based on the players inventory.
					System.out.println("Which Item would you like to drop?");
					player.playerInv.displayInventory();
					String itemTag = scanner.next();
					Item itemToRemove = player.playerInv.getItem(itemTag);
					while(itemToRemove ==null)
					{
						System.out.println("Enter the name of the item to add to your Inventory");
						itemTag = scanner.next();
						itemToRemove = player.playerInv.getItem(itemTag);
					}
				    player.currentRoom.addItem(itemToRemove);
				    player.drop(itemToRemove);
				    CurrentState = "Ready";
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
					player.inventory();
					//System.out.println("Game text goes here");
					//System.out.println("Command list for Inventory:  ");// This is a list of commands for while in the inventory.
					CurrentState = "Ready";
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
			else if (EnterdCommand.compareTo("Move")==0){
				if (CurrentState.compareTo("Ready")==0) {
					//select direction
					CurrentState = "Move";
					System.out.println("Which way would you like to go?");
					//System.out.println("Command list for move:  ");// This is a list of commands for while in the Move Screen.
					player.currentRoom.displayExits();
					String direction = scanner.next();
					if(player.move(direction))
					{
						CurrentState = "Ready";
					}
					//
				}
				System.out.println("State is: " +CurrentState+ "\n");// debugging
			}
			else if (EnterdCommand.compareTo("Examine")==0)
			{
				if (CurrentState.compareTo("Ready")==0) {
					CurrentState = "Examine";
					player.currentRoom.getItems();
					System.out.println("Enter the name of the item you want to Examine");
					String roomItem = scanner.next();
					Item itemToExamine = player.currentRoom.roomInv.getItem(roomItem);
					while(itemToExamine ==null)
					{
						System.out.println("Enter the name of the item to examine");
						roomItem = scanner.next();
						itemToExamine = player.currentRoom.roomInv.getItem(roomItem);
					}
				    System.out.println(itemToExamine.getitemDescription());
				    CurrentState = "Ready";
					//list items in room
					//read item number to be picked up from player
					//
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