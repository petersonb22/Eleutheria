import java.util.Scanner;

public class runGame {
	//initialize game variables
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//declare all items
		Item PhilosophersStone = new Item ("Philosophers Stone","PS", "a legendary substance allegedly capable of turning inexpensive metals into gold"); 
		Item StaffofWenge = new Item ("Staff of Wenge", "SW", "a staff made of wenge. A tropical timber, very dark in color with a distinctive figure");
		Item KeyofCentaurus = new Item ("Key of Centaurus","KC"," a key bearing the name Ixionidae");
		Item StaffofBubinga = new Item ("Staff of Bubinga", "SB", "a staff made of Bubinga wood");
		Item PlatinumChallace = new Item ("Platinum Challace", "PC", "the base of the challace has an inscription, Swordquest");
		Item KeyofAnubis = new Item ("KeyofAnubis", "KA", "the key bears a picture of a jackal");
		Item Flower = new Item ("Flower", "FW", "a flower, purple in color");
		Item GoldTalisman = new Item ("GoldTalisman", "GT", "the talisman is made of 18K solid gold, studded with 12 diamonds and the birthstones of the twelve zodiac signs");
		Item KeyofLaburinthos = new Item ("Key of Laburinthos", "KL", "enterance to Daedalus");
		Item StaffofPadauk = new Item ("Staff of Padauk", "SP", "a staff with reddish orange coloration");
		Item RodofAsclepius = new Item ("Rod of Asclepius", "RA", "a serpent entwined rod");
		Item BallofThread = new Item ("Ball of Thread", "BT", "a gift from Ariadne");
		Item RedRuby = new Item ("RedRuby", "RB", "a gemstone found in Metatron by the lucky adventurer");
		
		//declare all rooms
		Room metatron = new Room();
		metatron.name = "Metatron";
		Room Tartarus = new Room();
		Room ElysianFields = new Room();
		Room Cosmos = new Room();
		
		metatron.westRoom = Tartarus;
		metatron.addItem(RodofAsclepius);
		//put items in rooms
		
		//declare player
		final int TURN_LIMIT = 50; //arbitrary number, change when game is complete
		Player player = new Player(metatron);
		player.add(BallofThread);
		
		String CurrentState = "Ready"; // This is the State that commands are entered in.
		System.out.println("State is: " +CurrentState+ "\n"); // using for debugging 
		
		System.out.println("Command list: Move, Pickup, Drop, Examine, Inventory, Journal, Quit"); // Command list
		Scanner scanner = new Scanner(System.in);//used to get user input.
		String EnterdCommand;
		boolean runGame = true;
		while(runGame){// runs game
			
			//display descriptive text
			System.out.println("You are in " + player.getRoom().name);
			System.out.print("You see the following items in the room: ");
			player.getRoom().getItems();
			System.out.println("What would you like to do?");
			EnterdCommand = scanner.nextLine(); //user input
			player.turnCounter ++;
			if (EnterdCommand.compareTo("quit")==0){//Quits game.
				System.out.println("end of game");
				runGame = false;
			}
			else if (EnterdCommand.compareTo("Pickup")==0){
				if(CurrentState.compareTo("Ready")==0){
					CurrentState = "Pickup";
					// Run list of objects in room to be picked up then reset to ready State
					player.getRoom().listItems();
					System.out.println("Enter the name of the item to add to your Inventory");
					String roomItem = scanner.next();
					Item itemToAdd = player.getRoom().getInv().getItem(roomItem);
					while(itemToAdd ==null && roomItem.compareTo("cancel")!=0)
					{
						System.out.println("Enter the name of the item to add to your Inventory");
						roomItem = scanner.next();
						if (roomItem.compareTo("cancel")==0)
						{
							break;
						}
						itemToAdd = player.getRoom().getInv().getItem(roomItem);
					}
					if (itemToAdd == null)
					{
						
					}
					else
					{
						player.add(itemToAdd);
				    	player.getRoom().removeItem(itemToAdd);
					}
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
					while(itemToRemove ==null && itemTag.compareTo("cancel")!=0)
					{
						System.out.println("Enter the name of the item to add to your Inventory");
						itemTag = scanner.next();
						if (itemTag.compareTo("cancel")==0)
						{
							break;
						}
						itemToRemove = player.playerInv.getItem(itemTag);
					}
					if (itemToRemove != null)
					{
						player.getRoom().addItem(itemToRemove);
						player.drop(itemToRemove);
					}
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
					player.getRoom().displayExits();
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
					player.getRoom().getItems();
					System.out.println("Enter the name of the item you want to Examine");
					String roomItem = scanner.next();
					Item itemToExamine = player.getRoom().getInv().getItem(roomItem);
					while(itemToExamine ==null && roomItem.compareTo("cancel")!=0)
					{
						System.out.println("Enter the name of the item to examine");
						roomItem = scanner.next();
						itemToExamine = player.getRoom().getInv().getItem(roomItem);
					}
					if (itemToExamine != null)
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
				player.turnCounter--;
			}
			if (player.turnCounter >= TURN_LIMIT)
			{
				//display fail text
				runGame = false;
			}
		}
		scanner.close();
	}
}
